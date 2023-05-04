package Utility.Reports;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.List;

public class TotalBathroomPropertySubclass {

    public static int totalNumberOfBathrooms(PropertyCodeEnum prefix, List<Property> properties) {
        int bathroomCount = 0;
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
                bathroomCount += property.getNumberOfBathrooms();
            }
        }
        return bathroomCount;
    }
}
