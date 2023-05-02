package Repository;

import BaseClass.Property;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {

    private Property property;

    List<Property> properties = new ArrayList<>();

    //add Method
    public List<Property> createProperty(Property property) {
        properties.add(property);
        return properties;
    }

    //update Method
    public List<Property> updateProperty(Property property, double value) {
        try {
            if (properties.contains(property)) {
                property.setRentPerMonth(value);
//                property.setOccupiedStatus(!property.isOccupiedStatus());
            }
        } catch (Exception exception) {
            exception.getMessage();
        }
        return properties;
    }

    public List<Property> deleteProperty(Property property) {
        try {
            if (properties.contains(property)) {
                properties.remove(property);
            }
        } catch (Exception exception) {
            exception.getMessage();
        }
        return properties;
    }
}

