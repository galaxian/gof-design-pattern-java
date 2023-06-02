package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ElectronicFactory {
    private static Map<String, ElectronicAppliance> electronicCache = new HashMap<String, ElectronicAppliance>();

    private ElectronicFactory() {

    }

    public static ElectronicAppliance createElectronic(String color) {
        ElectronicAppliance electronicAppliance = electronicCache.get(color);

        if (electronicAppliance == null) {
            Controller controller = new Controller();
            electronicAppliance = new Computer(controller, color);
            electronicCache.put(color, electronicAppliance);

            return electronicAppliance;
        }

        return electronicAppliance;
    }
}
