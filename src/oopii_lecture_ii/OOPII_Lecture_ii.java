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
        parents.get(1).addLocation(loc3);
        parents.get(1).addLocation(loc5);
        
        Child ch1 = new Child("Carol", "Ugandan", 1999, loc1);
        Child ch2 = new Child("Pius", "Kenyan", 1999, loc2);
        Child ch3 = new Child("Benjamin", "Rwandese", 1992, loc4);
        Child ch4 = new Child("Sebastian", "Congolese", 2000, loc3);
        Child ch5 = new Child("Deborah", "Nigerian", 1999, loc5);
        
        parents.get(0).addChild(ch1);
        parents.get(0).addChild(ch2);
         
        parents.get(1).addChild(ch3);
        parents.get(1).addChild(ch4);
        parents.get(1).addChild(ch5);
        
     
        System.out.println("PROGRAM OUTPUT \n ---------------------- \n");
        
        
        
        for(int n = 0; n < parents.size(); n++){
            System.out.println("Parent " + (n+1) + "\n__________________________");
            System.out.println("\tName: " + parents.get(n).getName());
            System.out.println("\tNationality: " + parents.get(n).getNationality());
            System.out.println("\tYear of Birth: " + parents.get(n).getYob());
            System.out.println("\tAge: " + parents.get(n).getAge());
            System.out.println("\t\tLocation Details\n\t\t--------------------");
            for(int i = 0; i < p1.getLocations().size(); i++){
                System.out.println("\t\tLocation " + (i + 1));
                System.out.println("\t\t\tCountry: " + parents.get(n).getLocations().get(i).getCountry());
                System.out.println("\t\t\tDistrict: " + parents.get(n).getLocations().get(i).getDistrict());
                System.out.println("\t\t\tCounty: " + parents.get(n).getLocations().get(i).getCounty());
                System.out.println("\t\t\tParish: " + parents.get(n).getLocations().get(i).getParish());
                System.out.println("\t\t\tVillage: " + parents.get(n).getLocations().get(i).getVillage());

            }
            
            System.out.println("\n" + parents.get(n).getName() + "'s" + " children:\n_________________________________\n");
            
            for (int j = 0; j < parents.get(n).getNumberOfChildren(); j++) {
            	System.out.println("\tChild " + (j+1) + " Details:\n\t\t--------------------");
            	System.out.println("\t\tName: " + parents.get(n).getChildren().get(j).getName());
            	System.out.println("\t\tNationality: " + parents.get(n).getChildren().get(j).getNationality());
            	System.out.println("\t\tYear of Birth: " + parents.get(n).getChildren().get(j).getYob());
            	System.out.println("\t\tAge: " + parents.get(n).getChildren().get(j).getAge() + "\n\t\t**************");
            	 
            	for (int m = 0; m < parents.get(n).getChildren().get(j).getLocations().size(); m++) {
            		System.out.println("\t\t\tChild's ORIGIN:");
            		System.out.println("\t\t\t\tCountry: " + parents.get(n).getChildren().get(j).getLocations().get(m).getCountry());
                 	System.out.println("\t\t\t\tDistrict: " + parents.get(n).getChildren().get(j).getLocations().get(m).getDistrict());
                 	System.out.println("\t\t\t\tCounty: " + parents.get(n).getChildren().get(j).getLocations().get(m).getCounty());
                 	System.out.println("\t\t\t\tParish: " + parents.get(n).getChildren().get(j).getLocations().get(m).getParish());
                 	System.out.println("\t\t\t\tVillage: " + parents.get(n).getChildren().get(j).getLocations().get(m).getVillage());
                }
            	 
            	 System.out.println("\t\t\t__________________________\n");
            }
        }
    
    }
}
