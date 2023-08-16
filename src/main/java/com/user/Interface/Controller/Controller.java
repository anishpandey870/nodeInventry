package com.user.Interface.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.Interface.Entity.card;
import com.user.Interface.Entity.node;
import com.user.Interface.Entity.port;
import com.user.Interface.Entity.shelf;
import com.user.Interface.Repository.CardRepository;
import com.user.Interface.Repository.NodeRepository;
import com.user.Interface.Repository.PortRepository;
import com.user.Interface.Repository.ShelfRepository;

@RestController
public class Controller {
	@Autowired 
	private NodeRepository noderep;
	@Autowired 
	private ShelfRepository shelfrep;
	@Autowired
	private CardRepository cardrep;
	@Autowired
	private PortRepository portrep;
	
	

	
	@PostMapping("/card")
	public List<card> GetCards(@RequestParam("RowId") String id) {
		System.out.println("port"+"/"+id);
		
		List<card> cards = cardrep.findByPARENTIDIs(Integer.parseInt(id));
		return cards;
	}
	
	
	@PostMapping("/port")
	public List<port> GetPorts(@RequestParam("RowId") String id) {
		System.out.println("port"+"/"+id);
		
		List<port> ports = portrep.findByPARENTIDIs(Integer.parseInt(id));
		return ports;
	}
	
	

}
