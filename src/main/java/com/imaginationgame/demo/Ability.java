package com.imaginationgame.demo;

public class Ability  {
	
    private int dmg;
    private String name;
    private String description;
    
    public Ability() {
    	
    }
    public Ability(int aDmg, String aName, String aDescription){
        dmg = aDmg;
        name = aName;
        description = aDescription;
    }
    public int getDmg(){
        return dmg;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setDmg(int aDmg){
        dmg = aDmg;
    }
    public void setName(String aName){
         name = aName;
    }
    public void setDescription(String aDescription){
         description = aDescription;
    }
}

