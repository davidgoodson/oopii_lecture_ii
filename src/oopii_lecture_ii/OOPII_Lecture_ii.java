/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopii_lecture_ii;

/**
 *
 * @author davidbuyinza
 */
import  java.util.Date;
public class OOPII_Lecture_ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Parent p1 = new Parent();
        p1.setName("Rachel Janz");
        p1.setYob(1997);
        p1.setNationality("Ugandan");
        
        Parent p2 = new Parent();
        p2.setName("Lawrance Museveni");
        p2.setYob(1986);
        p2.setNationality("Tanzanian");
        
        java.util.ArrayList<Parent> parents = new java.util.ArrayList();
        parents.add(p1);
        parents.add(p2);
        
        Location loc1 = new Location("Uganda", "Kampala", "Rubaga", "Wakaliga", "Wakanda");
        Location loc2 = new Location("Rwanda", "Kigali", "Nyenda Tale", "Kabalagala", "Mpako");
        Location loc3 = new Location("Kenya", "Nairobi", "Nakuru", "Naivasha", "Njeri");
        Location loc4 = new Location("Tanzania", "Dodoma", "Mwanza", "Tanga", "Mbeya");
        Location loc5 = new Location("Nigeria", "Lagos", "Abujja", "Kano", "Puchu");
        Location loc6 = new Location("Congo", "Kawuma", "Gomma", "Butembo", "Lokaku");
        
    
        parents.get(0).addLocation(loc1);
        parents.get(0).addLocation(loc2);
        parents.get(1).addLocation(loc4);
        parents.get(1).addLocation(loc6);
        parents.get(1).addLocation(loc5);
        parents.get(0).addLocation(loc3);
        
        Child ch1 = new Child("Carol", "Ugandan", 1999, loc1);
        Child ch2 = new Child("Pius", "Kenyan", 1999, loc3);
        Child ch3 = new Child("Benjamin", "Rwandese", 1992, loc2);
        Child ch4 = new Child("Sebastian", "Congolese", 2000, loc6);
        Child ch5 = new Child("Deborah", "Nigerian", 1999, loc5);
        
        parents.get(0).addChild(ch1);
        parents.get(1).addChild(ch2);
       parents.get(0).addChild(ch3);
        
       
        
     
        System.out.println("PROGRAM OUTPUT \n ---------------------- \n");
        
        
        
        for(int n = 0; n < parents.size(); n++){
            System.out.println("Parent " + (n+1) + "\n__________________________");
            System.out.println("\tName: " + parents.get(n).getName());
            System.out.println("\tNationality: " + parents.get(n).getNationality());
            System.out.println("\tYear of Birth: " + parents.get(n).getYob());
            System.out.println("\tAge: " + parents.get(n).getAge());
            System.out.println("\t\tLocation Details\n\t\t--------------------");
            for(int i = 0; i < parents.get(n).getLocations().size(); i++){
                System.out.println("\t\tLocation " + (i + 1));
                System.out.println("\t\t\tCountry: " + parents.get(n).getLocations().get(i).getCountry());
                System.out.println("\t\t\tDistrict: " + parents.get(n).getLocations().get(i).getDistrict());
                System.out.println("\t\t\tCounty: " + parents.get(n).getLocations().get(i).getCounty());
                System.out.println("\t\t\tParish: " + parents.get(n).getLocations().get(i).getParish());
                System.out.println("\t\t\tVillage: " + parents.get(n).getLocations().get(i).getVillage());
                
              } 
            for(int u=0;u<parents.get(n).getNumberofchildren();u++){
                System.out.println("\t\tchild"+(1+u));
               System.out.println("\t\t\tName; "+parents.get(n).getChildren().get(u).getName());
               System.out.println("\t\t\tNationality; "+parents.get(n).getChildren().get(u).getNationality());
               System.out.println("\t\t\tyear of birth; "+parents.get(n).getChildren().get(u).getYob());
               System.out.println("\t\t\tAge; "+parents.get(n).getChildren().get(u).getAge());
            
             for(int t=0;t<parents.get(n).getChildren().get(u).getLocations().size();t++){
             System.out.println("\t\tlocation; "+(1+t));
             System.out.println("\t\t\tCountry; "+parents.get(n).getChildren().get(u).getLocations().get(t).getCountry());
            System.out.println("\t\t\tDistrict: " + parents.get(n).getChildren().get(u).getLocations().get(t).getDistrict());
            System.out.println("\t\t\tCounty: " + parents.get(n).getChildren().get(u).getLocations().get(t).getCounty());
            System.out.println("\t\t\tParish: " + parents.get(n).getChildren().get(u).getLocations().get(t).getParish());
            System.out.println("\t\t\tVillage: " + parents.get(n).getChildren().get(u).getLocations().get(t).getVillage());
             }  
               
               
               
               
               
            }
        }
    
    }
}
