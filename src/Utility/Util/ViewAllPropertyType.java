package Utility.Util;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.ArrayList;
import java.util.List;

public class ViewAllPropertyType {

    public static List<Property> viewAllPropertiesSubclass(PropertyCodeEnum prefix, List<Property> properties) {
        ArrayList<Property> storage = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
                storage.add(property);
            }
        }

        return storage;
    }
}
