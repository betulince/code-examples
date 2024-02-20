package datastructuresandalgorithms.iv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class itinerarySolution {

    public List<String> createItinerary(List<List<String>> itineraries, String startingPoint) {
        // [["Lisbon", "Amsterdam"], ["Berlin", "Lisbon"], ["Barcelona", "London"], ["London", "Berlin"]] 
        // startingPoint = Barcelona, create an itinerary using every city from the given list, and return the result
        // ["Barcelona", "London", "Berlin", "Lisbon", "Amsterdam"] -- return if you can visit all the cities

        HashMap<String, String> routeMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        Set<String> cities = new HashSet<>();

        for (List<String> itinerary : itineraries) {
            routeMap.put(itinerary.get(0), itinerary.get(1));
            cities.add(itinerary.get(0));
            cities.add(itinerary.get(1));
        }

        String next = startingPoint;
        while (next != null) {
            result.add(next);
            cities.remove(next);
            startingPoint = routeMap.get(next);
        }

        return cities.isEmpty() ? result : null;

    }
}
