package com.esd.ticketTracker.security;

import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.esd.ticketTracker.entity.User;
import com.esd.ticketTracker.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user != null){
            org.springframework.security.core.userdetails.User authenticatedUser =
                    new org.springframework.security.core.userdetails.User(
                      user.getEmail(),
                      user.getPassword(),
                      user.getRoles().stream()
                              .map((role) -> new SimpleGrantedAuthority(role.getName()))
                              .collect(Collectors.toList())
                    );
            return authenticatedUser;
        }else {
            throw new UsernameNotFoundException("Invalid username and password");
        }
    }
}