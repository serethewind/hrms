import BaseClass.Property;
import Enums.PropertyCodeEnum;
import Repository.RentalRepository;
import SubClasses.Apartment;
import SubClasses.Condo;
import SubClasses.House;

public class TestingClass {
    public static void main(String[] args) {
//        Property property = new Apartment();


        Property property1 = new Apartment( "a","ABUJA", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property2 = new Apartment("b", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property3 = new Apartment("c", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property4 = new Apartment("d", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property5 = new Apartment("b", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property6 = new Apartment("b", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property7 = new Apartment("bdfsgsdgf", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property8 = new Apartment("b", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property9 = new Apartment("bds", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property10 = new Apartment("bsd", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.APA, "1");
        Property property11 = new House("df", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.HOU, 4, 12);
        Property property12 = new House("fdsfs", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.HOU, 4, 12);
        Property property13 = new Condo("APvsdf1", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.CON, 4, "GYM");
        Property property14 = new Condo("APv0fsfds01", "Lagos", 4, 4, 125.5, true, PropertyCodeEnum.CON, 4, "Gym, Swimming Pool");




        RentalRepository propertiesList = new RentalRepository();
        propertiesList.addProperty(property1);
        propertiesList.addProperty(property2);
        propertiesList.addProperty(property3);
        propertiesList.addProperty(property4);
        propertiesList.addProperty(property5);
//        propertiesList.addProperty(property6);
//        propertiesList.addProperty(property7);
//        propertiesList.addProperty(property8);
//        propertiesList.addProperty(property9);
//        propertiesList.addProperty(property10);
        propertiesList.addProperty(property11);
        propertiesList.addProperty(property12);
        propertiesList.addProperty(property13);
        propertiesList.addProperty(property14);

        System.out.println(propertiesList.viewAllProperties());
//        System.out.println("coding in the specific:");
//        System.out.println("coding in the general");
//        System.out.println(propertiesList.viewAllSpecificPropertySubclass(PropertyCodeEnum.HOU));
//        System.out.println(propertiesList.viewAllSpecificPropertySubclass(PropertyCodeEnum.CON));
//        System.out.println(propertiesList.viewAllSpecificPropertySubclass(PropertyCodeEnum.APA));
//        System.out.println(propertiesList.viewPropertyByPropCode("APA002"));
//        System.out.println(propertiesList.totalNumberOfSpecifiedPropertySubclass(PropertyCodeEnum.APA));

//        System.out.println(propertiesList.toString(PropertyCodeEnum.APA));
//        System.out.println(propertiesList.toString(PropertyCodeEnum.HOU));
//        System.out.println(propertiesList.toString(PropertyCodeEnum.CON));
    }

}
