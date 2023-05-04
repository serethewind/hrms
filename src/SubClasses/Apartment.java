package SubClasses;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class Apartment extends Property {
    private String floorNumber;
    private PropertyCodeEnum type;

    public Apartment(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCodeEnum prefix, String floorNumber) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus, prefix);
        this.floorNumber = floorNumber;
    }

    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()){
            return getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return  super.toString() + "," + '\n' +
                "floorNumber: " + getFloorNumber() + "," + '\n' +
                "rentalIncome: " + rentalIncome() + "}" + '\n' + '\n';
    }

}
