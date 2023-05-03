package SubClasses;

import BaseClass.Property;
import Enums.PropertyCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Apartment extends Property {
    private String floorNumber;

    public Apartment(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode prefix, String floorNumber1) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus, prefix);
        this.floorNumber = floorNumber;
    }
    //    private PropertyCode propertyCode = PropertyCode.APA;
//    private int count = 1;
//
//    public String generatePropertyCode() {
//        String code = "APA" + String.format("%03d", count++);
//        return code;
//    }


    @Override
    public double rentalIncome() {
        return getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return  super.toString() + "Apartment{" +
                "floorNumber='" + floorNumber + '\'' +
                '}';
    }
}
