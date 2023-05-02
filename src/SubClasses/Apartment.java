package SubClasses;

import BaseClass.Property;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartment extends Property {
    private String floorNumber;

    @Override
    public double rentalIncome() {
        return getNumberOfBedrooms() * getRentPerMonth();
    }

    @Override
    public String propertyCodeGenerator() {
        return null;
    }
}
