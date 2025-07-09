package com.esd.ticketTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.esd.ticketTracker.dto.CommentDto;
import com.esd.ticketTracker.dto.TicketDto;
import com.esd.ticketTracker.service.CommentService;
import com.esd.ticketTracker.service.TicketService;

@Controller
public class CommentController {

	private CommentService commentService;
	private TicketService ticketService;

	public CommentController(CommentService commentService, TicketService ticketService) {
		this.commentService = commentService;
		this.ticketService = ticketService;
	}

	// handler method to create form submit request
	@PostMapping("/{ticketUrl}/comments")
	public String createComment( @PathVariable String ticketUrl,
			@Validated @ModelAttribute("comment") CommentDto commentDto, BindingResult result, Model model) {

		TicketDto ticketDto = ticketService.findTicketByUrl(ticketUrl);
		if (result.hasErrors()) {
			model.addAttribute("ticket", ticketDto);
			model.addAttribute("comment", commentDto);
			return "home/client_ticket";
		}
		commentService.createComment(ticketUrl, commentDto);
		return "redirect:/ticket/" + ticketUrl;
	}

}
