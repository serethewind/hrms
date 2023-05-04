package Utility.Reports;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.List;

public class TotalBedroomPropertySubclass {

    public static int totalNumberOfBedrooms(PropertyCodeEnum prefix, List<Property> properties) {
        int bedroomCount = 0;
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
               bedroomCount += property.getNumberOfBedrooms();
            }
        }
        return bedroomCount;
    }

}
