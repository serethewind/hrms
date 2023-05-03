package Repository;

import BaseClass.Property;
import SubClasses.Apartment;
import SubClasses.Condo;
import SubClasses.House;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class RentalRepository {

    private List<Property> properties;

    public RentalRepository() {
        this.properties = new ArrayList<>();
    }

    //add Method
    public List<Property> addProperty(Property property) {
        properties.add(property);
        return properties;
    }

    //update Method
    public List<Property> updateProperty(Property updatedProperty) {
        //say we can create an upDatedProperty, however the propertyCode of the updated property will not change.
//        try {
//            if (properties.contains(property)) {
//                property.setRentPerMonth(value);
////                property.setOccupiedStatus(!property.isOccupiedStatus());
//            }
//        } catch (Exception exception) {
//            exception.getMessage();
//        }
        for (int i = 0; i < properties.size(); i++) {
            Property property = properties.get(i);
            if (property.getPropertyCode().equalsIgnoreCase(updatedProperty.getPropertyCode())) {
                properties.set(i, updatedProperty);
            }
        }
        return properties;
    }

    public List<Property> deleteProperty(String propertyCode) {
        for (Property property : properties){
            if (property.getPropertyCode().equalsIgnoreCase(propertyCode)){
                properties.remove(property);
            }
        }
//        try {
//            if (properties.contains(property)) {
//                properties.remove(property);
//            }
//        } catch (Exception exception) {
//            exception.getMessage();
//        }
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

    public List<House> viewAllHouses() {
        ArrayList<House> houses = new ArrayList<>();
        for (Property property : properties) {
            if (property instanceof House) {
                houses.add((House) property);
            }
        }
        return houses;
    }

    public List<Condo> viewAllCondos() {
        ArrayList<Condo> condos = new ArrayList<>();
        for (Property property : properties) {
            if (property instanceof Condo) {
                condos.add((Condo) property);
            }
        }
        return condos;
    }

    public List<Apartment> viewAllApartments() {
        ArrayList<Apartment> apartments = new ArrayList<>();
        for (Property property : properties) {
            if (property instanceof Apartment) {
                apartments.add((Apartment) property);
            }
        }
        return apartments;
    }

    public List<Property> viewOccupiedProperties() {
        ArrayList<Property> occupiedProperties = new ArrayList<>();
        for (Property property : properties) {
            if (!property.isOccupiedStatus()) {
                occupiedProperties.add(property);
            }
        }
        return occupiedProperties;
    }

    public List<Property> viewUnOccupiedProperties() {
        ArrayList<Property> unOccupiedProperties = new ArrayList<>();
        for (Property property : properties) {
            if (property.isOccupiedStatus()) {
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
}

