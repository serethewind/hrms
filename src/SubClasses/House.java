package SubClasses;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import lombok.Data;

@Data
public class House extends Property {

    private int numberOfFloors;
    private double yardSize;

    public House(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCodeEnum prefix, int numberOfFloors, double yardSize) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus, prefix);
        this.numberOfFloors = numberOfFloors;
        this.yardSize = yardSize;
    }

    //    private PropertyCode propertyCode = PropertyCode.HOU;
//    private int count = 1;
//
//    public String generatePropertyCode() {
//        String code = "HOU" + String.format("%03d", count++);
//        return code;
//    }
    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()) {
            return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "," + '\n' +
                "numberOfFloors: " + getNumberOfFloors() + "," + '\n' +
                "yardSize: " + getYardSize() + "}"
                + '\n' + '\n';
    }
}
