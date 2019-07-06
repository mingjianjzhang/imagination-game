package com.imaginationgame.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import sun.net.util.URLUtil;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private CharacterHelper characterHelper;

    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping(value = "/createCharacter", method = RequestMethod.POST)
    @ResponseBody
    public List<String> createCharacter(
    		@RequestBody Character character
    		){
    	List<String> errorList = new ArrayList<String>();
    	
    	if(character.getName().length() <= 1) {
    		errorList.add("Name is too short");
    	}
    	if(character.getHealth() <= 0 || character.getHealth() > 1000 ) {
    		errorList.add("Number error");
    	}
    	List<Ability> abilityList = character.getListofab();
    	for(int i = 0; i < abilityList.size(); i++) {
    		if(abilityList.get(i).getName().length() > 0) {
    			errorList.add( abilityList.get(i).getName() + " is too long");
    		}
    		if(abilityList.get(i).getDmg() < 0) {
    			errorList.add("Please add damage to " + abilityList.get(i).getName());
    		}
    	}
    	if(errorList.size() == 0) {
    		errorList.add("u good buddy");
    		characterHelper.saveCharacter(character);
    	}
    	
    	
        System.out.println(errorList.toString());
        return errorList;
    	
    	
    }

    @RequestMapping(value = "/getCharacters", method = RequestMethod.GET)
    @ResponseBody
    public List<Character> getCharacters() {
        return characterHelper.getCharacters();
    }
    @GetMapping("/getCharacterByName")
    public Character getCharacterByName(String charName) {
    	Character character = characterHelper.getCharacterLlamo(charName);
    	if(character == null) {
    		return null;
    	}
    	return character;
    }
    
//write a new function gitCharacter by name por favor The route should be /getCharacterByName
    // function should be able to identify grab and return a character through its name 
}
