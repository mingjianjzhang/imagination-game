package com.imaginationgame.demo;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GameController {
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping(value = "/createCharacter", method = RequestMethod.POST)
    @ResponseBody
    public List<String> createCharater(
    		/*Character Name has to be longer than one character
    		 * Hp can't be negative or 0 and has to be less than 1000
    		 * Ability name less than 20 chars.
    		 * Ability damage cant be negative
    		 */
    		@RequestParam(name = "ability_description") String abiDesc,
    		@RequestParam(name ="description") String charDescription, 
    		@RequestParam(name = "ability_damage") int abilityDmg,
    		@RequestParam(name ="ability_name") String abilityName,
    		@RequestParam(name="character_name") String characterName,
    		@RequestParam(name="character_health") int characterHP) {
    	List<String> errorList = new ArrayList<String>();
    	if(characterName.length() <= 1) {
    		errorList.add("Name is too short");
    	}
    	if(characterHP <= 0 || characterHP > 1000 ) {
    		errorList.add("Number error");
    	}
    	if(abilityName.length() > 20) {
    		errorList.add("Name is too long");
    	}
    	if(abilityDmg < 0) {
    		errorList.add("Please add damage to your move");
    	}
    	if(errorList.size() == 0) {
    		errorList.add("u good buddy");
    	}
        System.out.println(errorList.toString());
        return errorList;
    }


}
