package com.event.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.Entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
	
	public List<Event> findEventByid(int id);
	public List<Event> findEventBytitle(String title);

}
