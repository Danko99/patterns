package structure.fly_weight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightGarage {
    private Map<String,Mercedes> mercedesMap;

    public FlyWeightGarage() {
        mercedesMap = new HashMap<>();
    }

    public Mercedes getMercedesByColour(String color){
        Mercedes mercedes = mercedesMap.get(color);
        if (mercedes==null){
            mercedes = new Mercedes(color);
            mercedesMap.put(color,mercedes);
        }
        return mercedes;
    }
}
