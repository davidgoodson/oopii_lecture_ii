/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopii_lecture_ii;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author davidbuyinza
 */
public class Child extends Parent{
    private String name, nationality;
    private int yob;
    private ArrayList<Location> locations;
    private ArrayList<Parent>parents;

    public Child(){}
    
    public Child(String name, String nationality, int yob, Location location) {
        this.name = name;
        this.nationality = nationality;
        this.yob = yob;
        this.addLocation(location);
        this.parents=parents;
    }
    public void setName(String name){
     this.name=name;
    }
    public void setNationality(String nationality){
     this.nationality=nationality;
    
    }
    public void setLocation(Location location){
       this.locations.add(location);
    
    }
    public void setParent(Parent parent){
      this.parents.add(parent);
    
    }
    public void setYob(int yob){
     this.yob=yob;
    }
    
    public String getName(){
    return name;
    }
    public String getNationality(){
     return nationality;
    }
    public int getYob(){
      return yob;
    }
    
    public ArrayList<Location>getlocations(){
       return locations;
    
    }
    public ArrayList<Parent>getparents(){
       return parents;
    
    }
    public Location getDefaultLocation(){
       return locations.get(0);
    }
    public int getAge(){
    int currentyear=Calendar.getInstance().get(Calendar.YEAR);
     return currentyear - this.yob;
    }
    
    
    
    
    
    
    
    
    
}
