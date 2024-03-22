package BuildingProject;

import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) 
    {
        Address address1 = new Address("102", "Blue Ave","Harrisburg","Pennsylvania", "17112");
        Address address2 = new Address("807", "Red Dr", "San Jose", "California", "95101");
        Address address3 = new Address("503", "Purple Ave", "Columbus", "Ohio", "43004");
        Address address4 = new Address("304", "Green Dr","Boulder","Colorado","80304");

        Silo newSilo = new Silo(250000, "Blue","Rachel D'Souza",address1 ,10000, 15000);
        Silo newSilo2 = new Silo(275000, "Red", "Jane Smith",address2, 20000, 45);
    
        Ranch newRanch = new Ranch(40000,"Purple", "John Doe", address3,100, 700, 80);
        Ranch newRanch2 = new Ranch(30000, "Green" ,"Don Green", address4, 200, 500, 60);
    
        ArrayList <Building> buildList = new ArrayList();
        
        buildList.add(newSilo);
        buildList.add(newSilo2);
        buildList.add(newRanch);
        buildList.add(newRanch2);

        for (Building building : buildList) 
        {
            System.out.println(building.getInfo());
        }
    }
}
