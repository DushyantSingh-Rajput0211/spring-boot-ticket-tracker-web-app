package com.esd.ticketTracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.esd.ticketTracker.entity.Ticket;
    
public interface TicketRepository extends JpaRepository<Ticket, Long>{ //entity name, data type of primary key

	Optional<Ticket> findByUrl(String url); //create query using method name , spring jpa will pass internally and uses hibernate to create the query
	
	//JPQL for search operation : use JPA entity and its field names
	@Query("SELECT p from Ticket p WHERE " +
            " p.title LIKE CONCAT('%', :query, '%') OR " +
            " p.shortDescription LIKE CONCAT('%', :query, '%')")
	List<Ticket> searchTickets(String query);

	@Query(value = "select * from tickets t where t.created_by = :userId", nativeQuery = true)
    List<Ticket> findTicketsByUser(Long userId);
}
