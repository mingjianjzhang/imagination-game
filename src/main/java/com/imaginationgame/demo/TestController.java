package com.imaginationgame.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.imaginationgame.demo.Ability;
@RestController
public class TestController {
	@RequestMapping("/getCharacterName")
	public String getCharacterName() {
		List<Ability> robab = new ArrayList<Ability>();
		Character zob = new Character("Thor", 100, "url", "Big Strong", robab);
		return zob.getName();
	}
	
	
    @RequestMapping("/")
    public String index() {
 		    List<Ability> bobab = new ArrayList<Ability>();
 		    List<Ability> zobab = new ArrayList<Ability>();
 		    bobab.add(new Ability(100,"punch", "tuff fist"));
 		    zobab.add(new Ability(50,"punch", "irrevelant fr fr"));
 		    bobab.add(new Ability(150,"kick", "tuff kick"));
 		    zobab.add(new Ability(15,"shleep", "keep it real fr"));
 		    bobab.add(new Ability(500, "oof", "f"));
 		    zobab.add(new Ability(999, "quit", "feels bad man"));
 		    
 		    
 		    // initialize two characters, each with three Abilities
 		        Character bob = new Character("bob", 100, "img","small and tuff", bobab );
 		        Character zob = new Character("zob", 500, "img", "big and weak", zobab );
 		        
 		    // write fight simulation here
 		    System.out.println("The fight is starting");
 		    System.out.println("Our contestants are: " + bob.getName() + " and " + zob.getName());
 		    System.out.println(bob.getName() + " goes first! He uses " + bob.getListofab().get(2).getName());
 		    System.out.println("Ouch! " + zob.getName() + " now has " + (zob.getHealth() - bob.getListofab().get(2).getDmg()) + " health!");
 		    zob.setHealth(zob.getHealth() - bob.getListofab().get(2).getDmg());
 		    System.out.println("Health update. Here's zob's current health: " + zob.getHealth());
 		    
 		    System.out.println("Attempting to remove all of bob's abilities");
 		    while(bob.getListofab().size() > 0){
 		        bob.removeAb(0);

 		    }
 		    System.out.println("Now bob has " + bob.getListofab().size() + " abilities");

 
    	return "Gwlee";
        
    }

}
