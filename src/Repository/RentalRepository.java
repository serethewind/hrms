package Repository;

import BaseClass.Property;
import Enums.PropertyCodeEnum;
import Utility.Reports.*;
import Utility.Util.PropertyName;
import Utility.Util.ViewAllPropertyType;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {

    private List<Property> properties;

    public RentalRepository() {
        this.properties = new ArrayList<>();
    }

    //Create implementation of CRUD: Add Method
    public List<Property> addProperty(Property property) {
        properties.add(property);
        return properties;
    }

    //Update implementation of CRUD: Update Method
    public List<Property> updateProperty(Property updatedProperty) {
        //say we can create an upDatedProperty, however the propertyCode of the updated property will not change.
        for (int i = 0; i < properties.size(); i++) {
            Property property = properties.get(i);
            if (property.getPropertyCode().equalsIgnoreCase(updatedProperty.getPropertyCode())) {
                properties.set(i, updatedProperty);
            }
        }
        return properties;
    }

    //    Delete implementation of CRUD: Delete Method
    public List<Property> deleteProperty(String propertyCode) {
        for (Property property : properties) {
            if (property.getPropertyCode().equalsIgnoreCase(propertyCode)) {
                properties.remove(property);
            }
        }
        return properties;
    }

    /**
     * a. View all apartments
     * b. View all houses
     * c. View all condos
     * d. View all properties
     * e. View all occupied properties (Apartment, House, Condo)
     * f. View all unoccupied properties (Apartment, House, Condo)
     * g. View through search by location
     * h. View through search by property code
     */

    public List<Property> viewAllProperties() {
        return properties;
    }

    public List<Property> viewAllSpecificPropertySubclass(PropertyCodeEnum prefix) {
        return ViewAllPropertyType.viewAllPropertiesSubclass(prefix, properties);
    }

    public List<Property> viewOccupiedProperties() {
        ArrayList<Property> occupiedProperties = new ArrayList<>();
        for (Property property : properties) {
            if (property.isOccupiedStatus()) {
                occupiedProperties.add(property);
            }
        }
        return occupiedProperties;
    }

    public List<Property> viewUnOccupiedProperties() {
        ArrayList<Property> unOccupiedProperties = new ArrayList<>();
        for (Property property : properties) {
            if (!property.isOccupiedStatus()) {
                unOccupiedProperties.add(property);
            }
        }
        return unOccupiedProperties;
    }

    public List<Property> viewPropertyByLocation(String locationQuery) {
        ArrayList<Property> specificLocation = new ArrayList<>();
        for (Property property : properties) {
            if (property.getLocation().equalsIgnoreCase(locationQuery)) {
                specificLocation.add(property);
            }
        }
        return specificLocation;
    }

    public Property viewPropertyByPropCode(String propertyCode) {
        for (Property property : properties) {
            if (property.getPropertyCode().equalsIgnoreCase(propertyCode)) {
                return property;
            }
        }
        return null;
    }

    public int totalNumberOfProperties() {
        return properties.size();
    }

    public int totalNumberOfSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalPropertiesSubClass.totalNumberOfSpecifiedProperty(prefix, properties);
    }

    public int totalNumberOfBedroomsInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalBedroomPropertySubclass.totalNumberOfBedrooms(prefix, properties);
    }

    public int totalNumberOfBathroomsInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalBathroomPropertySubclass.totalNumberOfBathrooms(prefix, properties);
    }

    public Double totalRentalIncomeForSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalRentalIncomeSubclass.totalRentalIncome(prefix, properties);
    }

    public int totalNumberOfOccupiedPropertiesInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalNumberOfOccupiedPropertySubclass.totalNumberOfOccupied(prefix, properties);
    }

    public int totalNumberOfUnoccupiedPropertiesInSpecifiedPropertySubclass(PropertyCodeEnum prefix) {
        return TotalNumberOfUnoccupiedPropertySubClass.totalNumberOfUnoccupied(prefix, properties);
    }

    public String toString(PropertyCodeEnum prefix) {
        return "Total Number of all properties: " + totalNumberOfProperties() + '\n' +
                "Total Number of all " + PropertyName.propertyName(prefix) + " : " + totalNumberOfSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of bedrooms: " + totalNumberOfBedroomsInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of bathrooms: " + totalNumberOfBathroomsInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total rental income per month: " + totalRentalIncomeForSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of occupied properties: " + totalNumberOfOccupiedPropertiesInSpecifiedPropertySubclass(prefix) + '\n' +
                "Total Number of unoccupied properties: " + totalNumberOfUnoccupiedPropertiesInSpecifiedPropertySubclass(prefix) + '\n'
                ;
    }

}

