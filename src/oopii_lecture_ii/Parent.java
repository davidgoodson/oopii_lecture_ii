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
public class Parent {
    private String name, nationality;
    private int yob;
    private ArrayList<Location> locations = new ArrayList();
    private ArrayList<Child> children = new ArrayList();

    public Parent() {}

    public Parent(String name, String nationality, int yob, Location location, Child child) {
        this.name = name;
        this.nationality = nationality;
        this.yob = yob;
        this.locations=locations;
        this.children = children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getYob() {
        return yob;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }
    
    public Location getDefaulLocation(){
        return locations.get(0);
    }

    public ArrayList<Child> getChildren() {
        return children;
    }
    
   public  int getAge(){
    int current_year=Calendar.getInstance().get(Calendar.YEAR);
    return current_year -this.yob;
   }
   public int getNumberofchildren(){
     return this.children.size();
   }
    
}
