package com.event.Service;

import java.util.List;

import com.event.Entity.Event;



public interface EventService {
	public Event addEvent(Event event);
	public List<Event> getAllEvents();
	public void deleteEvent(int id);
	public Event updateEvent(Event event);
	public List<Event> findEventById(int id);
	public List<Event> searchEventByName(String title);

}
