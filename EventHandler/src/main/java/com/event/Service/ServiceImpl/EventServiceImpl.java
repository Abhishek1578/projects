package com.event.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.event.Entity.Event;
import com.event.Repository.EventRepository;
import com.event.Service.EventService;

@Repository
public class EventServiceImpl implements EventService {
	
	@Autowired
	EventRepository eventRepository;

	@Override
	public Event addEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public void deleteEvent(int id) {
		// TODO Auto-generated method stub
		eventRepository.deleteById(id);
		
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		Event _event=eventRepository.findById(event.getId()).get();
		_event.setId(event.getId());
		_event.setTitle(event.getTitle());
		_event.setCity(event.getCity());
		_event.setCountry(event.getCountry());
		_event.setEventstartdate(event.getEventstartdate());
		_event.setEventenddate(event.getEventenddate());
		eventRepository.save(_event);
		return _event;
	}

	@Override
	public List<Event> findEventById(int id) {
		// TODO Auto-generated method stub
		return eventRepository.findEventByid(id);
	}

	@Override
	public List<Event> searchEventByName(String title) {
		// TODO Auto-generated method stub
		return eventRepository.findEventBytitle(title);
	}

}
