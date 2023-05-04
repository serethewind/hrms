package SubClasses;

import BaseClass.Property;
import Enums.PropertyCode;

import Utility.PropertyCodeGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class Apartment extends Property {
    private String floorNumber;
    private PropertyCode type;

    public Apartment(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode prefix, String floorNumber) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, isOccupiedStatus, prefix);
        this.floorNumber = floorNumber;
    }

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
