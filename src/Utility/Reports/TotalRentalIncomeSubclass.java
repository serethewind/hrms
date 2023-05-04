package Utility.Reports;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.List;

public class TotalRentalIncomeSubclass {

    public static Double totalRentalIncome(PropertyCodeEnum prefix, List<Property> properties) {
        Double count = 0.0;
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
                 count += property.rentalIncome();
            }
        }
        return count;
    }
}
