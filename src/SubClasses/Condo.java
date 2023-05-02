package SubClasses;

import BaseClass.Property;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condo extends Property {

    private int numberOfFloors;
    private String amenities;
    @Override
    public double rentalIncome() {
        return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String propertyCodeGenerator() {
        return null;
    }
}
