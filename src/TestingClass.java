import BaseClass.Property;
import Enums.PropertyCode;
import Repository.RentalRepository;
import SubClasses.Apartment;
import SubClasses.Condo;
import SubClasses.House;

import java.util.List;

public class TestingClass {
    public static void main(String[] args) {
        Property property1 = new Apartment("APv001", "ABUJA", 4, 4, 125.5, true, PropertyCode.APA, "1");
        Property property2 = new Apartment("APv001", "Lagos", 4, 4, 125.5, true, PropertyCode.APA, "1");
        Property property3 = new House("APv001", "Lagos", 4, 4, 125.5, true, PropertyCode.HOU, 4, 12);
        Property property4 = new Condo("APv001", "Lagos", 4, 4, 125.5, true, PropertyCode.CON, 4);
//        System.out.println(property1);
//        System.out.println(property2);
//        System.out.println(property3);
//        System.out.println(property4);


        RentalRepository propertiesList = new RentalRepository();
        propertiesList.addProperty(property1);
        propertiesList.addProperty(property2);
        propertiesList.addProperty(property3);
        propertiesList.addProperty(property4);
        System.out.println(propertiesList.viewAllProperties());
        System.out.println(propertiesList.viewAllApartments());
    }

}
