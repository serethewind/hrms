package BaseClass;

import Enums.PropertyCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Property {
    /**
     *  Property Code (The code of the property must be in 3 characters + 4 digits format,
     * the first three character (APA for Apartment, HOU for Houses and CON for Condos)
     * the other 4 digits will be in incremental value by one (1). E.g. APA001, HOU002,
     * CON003
     * ▪ Location
     * ▪ Number of bedrooms
     * ▪ Number of bathrooms
     * ▪ Rent per month
     * ▪ Floor number
     * ▪ Occupied Status ( occupied or not)
     *
     */

    private String propertyCode;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private int floorNumber;
    private boolean isOccupiedStatus;
    private PropertyCode propertyCodePrefix;

    public abstract double rentalIncome();

    public abstract String propertyCodeGenerator();

}
