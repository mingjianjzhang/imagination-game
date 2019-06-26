package com.imaginationgame.demo;
import java.util.*;
public class Character {
    private String name;
    private List<Ability> listofab = new ArrayList<Ability>();
    private int health;
    private String img;
    private String description;
    
    public Character() {
    	
    }
    public Character(String aName, int aHealth, String aImg, String aDescription, List<Ability> aListofab) {
        name = aName;
        health = aHealth;
        img = aImg;
        description = aDescription;
        listofab = aListofab;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public String getImg(){
        return img;
    }
    public String getDescription(){
        return description;
    }
    public List<Ability> getListofab(){
        return listofab;
    }
    public void setName(String aName){
        name = aName;
    }
    public void setHealth(int aHealth){
        health = aHealth;
    }
    public void setImg(String aImg){
        img = aImg;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }
    public void setListofab(List<Ability>aListofab){
        listofab = aListofab;
    }
    
    public void sayName() {
        System.out.println(name);
    }
    
    // write a method that allows adding an ability to a character

    
    // write a method that allows for the removal of an ability by ability name
    public void removeAb(int abilitynum){
        listofab.remove(abilitynum);
    }
}
