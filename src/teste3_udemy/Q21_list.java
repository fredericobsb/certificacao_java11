package teste3_udemy;

import java.util.ArrayList;
import java.util.List;

public class Q21_list {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add(0, "BLUE");
        trafficLight.add(1, "RED");
        trafficLight.add(2, "ORANGE");
        trafficLight.add(3, "GREEN");
        
        trafficLight.remove(Integer.valueOf(2));
        
        System.out.println(trafficLight);
    }
}
