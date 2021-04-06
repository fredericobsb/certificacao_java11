package teste3_udemy;

import java.util.ArrayList;
import java.util.List;

public class Q12_list_remove {
    public static void main(String[] args) {
        List<String> places = new ArrayList<>();
        places.add("Austin");//
        places.add("Okinawa");
        places.add("Giza");//
        places.add("Manila");
        places.add("Batam");
        places.add("Giza");
        
        if(places.remove("Giza"))
            places.remove("Austin");
        
        System.out.println(places);
    }
}

//What will be the result of compiling and executing Test class?
