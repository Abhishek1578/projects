package com.event.RepoTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import com.event.Entity.Event;
import com.event.Repository.EventRepository;
import com.event.Service.EventService;

@SpringBootTest
public class EventRepositoryTest {
	
	@Autowired
	EventService eventserv;
	
	@MockBean
	EventRepository evenrepo;
	
	@Test
	void testaddEvent()
	{
		Event e=new Event(101,"marriage","mumbai","India","20/04/2023","21/04/2023");
		Mockito.when(evenrepo.save(e)).thenReturn(e);
		assertEquals(e,eventserv.addEvent(e));
	}
	
	@Test
	void testGetAll() {
		List<Event> listevent=Stream.of(new Event(101,"birthday","mumbai","india","20/04/2023","21/04/2023"),new Event(102,"party","mumbai","india","22/04/2023","23/04/2023")).collect(Collectors.toList());
		Mockito.when(evenrepo.findAll()).thenReturn(listevent);
		assertEquals(2,eventserv.getAllEvents().size());
	}
	@Test
	void testDeleteEvent() {
		eventserv.deleteEvent(101);
		Mockito.verify(evenrepo).deleteById(101);
	}

}
