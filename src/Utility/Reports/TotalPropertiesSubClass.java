package Utility.Reports;

import BaseClass.Property;
import Enums.PropertyCodeEnum;

import java.util.ArrayList;
import java.util.List;

public class TotalPropertiesSubClass {
  private PropertyCodeEnum prefix;

    public static int totalNumberOfSpecifiedProperty(PropertyCodeEnum prefix, List<Property> properties) {
        ArrayList<Property> storage = new ArrayList<>();
        for (Property property : properties) {
            if (property.getPrefix().equals(prefix)) {
                storage.add(property);
            }
        }
        return storage.size();
    }


    /**
     *   public int apartmentTotalNumberOfBedrooms() {
     *         int bedroomCount = 0;
     *         for (Property property : properties) {
     *             if (property instanceof Apartment) {
     *                bedroomCount += property.getNumberOfBedrooms();
     *             }
     *         }
     *         return bedroomCount;
     *     }
     *
     *        public int totalNumberOfApartments() {
     *         ArrayList<Apartment> apartments = new ArrayList<>();
     *         for (Property property : properties) {
     *             if (property instanceof Apartment) {
     *                 apartments.add((Apartment) property);
     *             }
     *         }
     *         return apartments.size();
     *     }
     *
     */
}
