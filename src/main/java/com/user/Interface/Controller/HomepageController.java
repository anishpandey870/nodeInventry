package com.user.Interface.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.user.Interface.Entity.card;
import com.user.Interface.Entity.login;
import com.user.Interface.Entity.node;
import com.user.Interface.Entity.port;
import com.user.Interface.Entity.shelf;
import com.user.Interface.Repository.CardRepository;
import com.user.Interface.Repository.LoginRepository;
import com.user.Interface.Repository.NodeRepository;
import com.user.Interface.Repository.PortRepository;
import com.user.Interface.Repository.ShelfRepository;


@Controller
@SessionAttributes({"User","pass","name","nname","ip","ems"})
public class HomepageController {
	
	
	@Autowired
	private LoginRepository loginrep;
	@Autowired 
	private NodeRepository noderep;
	@Autowired 
	private ShelfRepository shelfrep;
	@Autowired
	private CardRepository cardrep;
	@Autowired
	private PortRepository portrep;
	
	
    
	
	@GetMapping("/")
    public String showLoginForm() {
        return "login";
    }

	


   
    @PostMapping("/login")
    public String login(@RequestParam String Uname, @RequestParam String Pass,  Model model) {
        login user = loginrep.findByUsernameAndPassword(Uname, Pass);
        System.out.println("login"+user);
        if (user != null) {
        	model.addAttribute("User",Uname);
        	model.addAttribute("pass",Pass);
            return "home";
        } else {
        	  model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
	

	
	@GetMapping("/node")
	public String SearchForNodes(@RequestParam String Name,@RequestParam String NetworkName,@RequestParam String IpAddress,
			@RequestParam String EmsId ,Model model) {
		model.addAttribute("name",Name);
    	model.addAttribute("nname",NetworkName);
    	model.addAttribute("ip",IpAddress);
    	model.addAttribute("ems",EmsId);
		List<node> a = new ArrayList<>();
		if(Name.isEmpty() && NetworkName.isEmpty() && IpAddress.isEmpty() && EmsId.isEmpty()) {
			a= noderep.findByNAMEIs(Name);
		}
		else if(Name.isEmpty()) {
			 a = noderep.findAll();
		}else {
			a= noderep.findByNAMEIs(Name);
		} 
		
		//List<node> a = noderep.findByNAMEIs(NetworkName);
		List<node> b = noderep.findByNETWORKNAMEIs(NetworkName);
		List<node> c = noderep.findByIPADDRESS(IpAddress);
		List<node> d = noderep.findByEMSIDIs(EmsId);
		
		if(NetworkName.isEmpty()== false) {
			a.retainAll(b);
		}
		if(IpAddress.isEmpty()== false) {
			a.retainAll(c);
		}
		if(EmsId.isEmpty()== false) {
			a.retainAll(d);
		}
		
        model.addAttribute("nodes",a);
        return "home";
    }


	


	@GetMapping("/NodeInventory")
	public String GetShelfs(@RequestParam String RowId,Model model) {
		//System.out.println("Shelf"+"/"+RowId);
		
		List<shelf> shelfs = shelfrep.findByPARENTIDIs(Integer.parseInt(RowId));
				
		
		if (shelfs.size()>0) {
			model.addAttribute("shelfs",shelfs);
			int shelf_id = shelfs.get(0).getID();
			
			List<card> cards = cardrep.findByPARENTIDIs(shelf_id);
			model.addAttribute("cards",cards);
			if (cards.size()>0) {
				int card_id = cards.get(0).getID();
				
				List<port> ports = portrep.findByPARENTIDIs(card_id);
		 		
		 		model.addAttribute("ports",ports);
			}
			
		}
		
		return "NodeInventory";
	}
	
	
	
	
	
	
}
	
	

