package SubClasses;

import BaseClass.Property;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House extends Property {

    private int numberOfFloors;
    private double yardSize;
    @Override
    public double rentalIncome() {
        return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String propertyCodeGenerator() {
        return null;
    }
}
