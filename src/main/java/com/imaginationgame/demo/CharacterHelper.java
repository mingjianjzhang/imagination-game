package com.imaginationgame.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterHelper {
    private static List<Character> characterList = new ArrayList<>();


    public CharacterHelper() {
        List<Ability> abilityList = new ArrayList<>();
        abilityList.add(new Ability(50, "AwesomeCool",
                "Freezes enemy with utter coolness" ));
        characterList.add(new Character("David Foster Wallace", 50,
                "http://ecx.images-amazon.com/images/I/51zSpLTZcQL.jpg", "The Coolest Guy",
                abilityList));
    }

    /**
     * Adds a new character to characterList.
     */
    public void saveCharacter() {
    	characterList.add()
    }

    public List<Character> getCharacters() {
        return characterList;
    }

}
