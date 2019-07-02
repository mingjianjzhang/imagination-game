package com.imaginationgame.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CharacterHelper {
    private static List<Character> characterList;


    public CharacterHelper() {
        List<Ability> abilityList = new ArrayList<>();
        abilityList.add(new Ability(50, "AwesomeCool",
                "Freezes enemy with utter coolness" ));
        characterList.add(new Character("Josh", 50, null, "The Coolest Guy",
                abilityList));
    }

    /**
     * Adds a new character to characterList.
     */
    public void saveCharacter() {

    }

}
