package com.event.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.Entity.Event;
import com.event.Service.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@PostMapping(value = "/addevents")
	public Event addEvent(@Valid @RequestBody Event event)
	{
		return eventService.addEvent(event);
	}
	@GetMapping(value ="/getallevent")
	public List<Event> getAllEvents()
	{
		return eventService.getAllEvents();
		
	}
	@DeleteMapping(value = "/delete/{id}")
	public String deleteEvent(@Valid @PathVariable int id)
	{
		eventService.deleteEvent(id);
		return "Event Deleted";
	}
	@PutMapping(value = "/update")
	public Event updateEvent(@Valid @RequestBody Event event)
	{
		return eventService.updateEvent(event);
	}
	@GetMapping(value = "/getid/{id}")
	public List<Event> findEventById(@Valid @PathVariable int id)
	{
		return eventService.findEventById(id);
	}
	@GetMapping(value = "/getname/{title}")
	public List<Event> findEventByName(@Valid @PathVariable String title)
	{
		return eventService.searchEventByName(title);
	}
	

}
