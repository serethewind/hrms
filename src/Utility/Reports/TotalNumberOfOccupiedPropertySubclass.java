package Utility.Reports;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.ArrayList;
import java.util.List;

public class TotalNumberOfOccupiedPropertySubclass {

    public static int totalNumberOfOccupied(PropertyCodeEnum prefix, List<Property> properties) {
        ArrayList<Property> storage = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
                if (property.isOccupiedStatus()){
                    storage.add(property);
                }
            }
        }
        return storage.size();
    }
}
