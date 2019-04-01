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

    public Child(){}
    
    public Child(String name, String nationality, int yob, Location location) {
        this.name = name;
        this.nationality = nationality;
        this.yob = yob;
        this.addLocation(location);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}
    
	public int getAge(){
        int current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year - this.yob;
    }
    
}
