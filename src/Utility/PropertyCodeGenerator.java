package Utility;

import Enums.PropertyCode;

public class PropertyCodeGenerator {
    private static int houseCount = 1;
    private static int condoCount = 1;
    private static int apartmentCount = 1;

    public static String generatePropertyCode(PropertyCode prefix) {
        String code = "";

        switch (prefix) {
            case APA: {
                code = "APA" + String.format("%03d", apartmentCount++);
            }
            break;
            case CON: {
                code = "CON" + String.format("%03d", condoCount++);
            }
            break;
            case HOU: {
                code = "HOU" + String.format("%03d", houseCount++);
            }
            break;
            default:
        }
        return code;
    }
}
