package SubClasses;

import BaseClass.Property;
import Enums.PropertyCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class House extends Property {

    private int numberOfFloors;
    private double yardSize;

    public House(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode prefix, int numberOfFloors, double yardSize) {
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
        return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String toString() {
        return super.toString() + "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yardSize=" + yardSize +
                '}';
    }
}
