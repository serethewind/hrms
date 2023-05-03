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
     * Property Code(The code of the property must be in 3 characters + 4 digits format,
     * the first three character (APA for Apartment, HOU for Houses and CON for Condos)
     * the other 4 digits will be in incremental value by one (1). E.g. APA001, HOU002,
     * CON003
     * ▪ Location
     * ▪ Number of bedrooms
     * ▪ Number of bathrooms
     * ▪ Rent per month
     * ▪ Floor number
     * ▪ Occupied Status ( occupied or not)
     */

    private String propertyCode;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private boolean isOccupiedStatus;

    public Property(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean isOccupiedStatus, PropertyCode prefix) {
        this.propertyCode = generatePropertyCode(prefix);
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.rentPerMonth = rentPerMonth;
        this.isOccupiedStatus = isOccupiedStatus;
    }

    public void setPropertyCode(String propertyCode, PropertyCode prefix) {
        this.propertyCode = generatePropertyCode(prefix);
    }


    public abstract double rentalIncome();

    private int count = 1;

    private String generatePropertyCode(PropertyCode prefix) {
        String code = "";

        switch (prefix) {
            case APA: {
                code = "APA" + String.format("%03d", count++);
            }
            break;
            case CON: {
                code = "CON" + String.format("%03d", count++);
            }
            break;
            case HOU: {
                code = "HOU" + String.format("%03d", count++);
            }
            break;
            default:
        }
        return code;
    }

}
