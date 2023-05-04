package SubClasses;

import BaseClass.Property;
import Enums.PropertyCode;
import lombok.Data;

@Data
public class Condo extends Property {

    private int numberOfFloors;

    public Condo(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode prefix, int numberOfFloors) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus, prefix);
        this.numberOfFloors = numberOfFloors;
    }


    //    private PropertyCode propertyCode = PropertyCode.CON;
//
//
//    private int count = 1;
//    public String generatePropertyCode() {
//        String code = "CON" + String.format("%03d", count++);
//        return code;
//    }
    @Override
    public double rentalIncome() {
        return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return super.toString() + "Condo{" +
                "numberOfFloors=" + numberOfFloors +
                '}';
    }
}
