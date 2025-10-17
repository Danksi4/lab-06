package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* This is a class that keeps a list of city objects
*/
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *  This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * @param city
     * @return
     *  Return a boolean that tells us if the given city is in the list
     */
    boolean hasCity(City city) {
        if (cities.contains(city)) return true;
        else return false;
    }

    /**
     *
     * @param city
     * Removes the city if it is present in the list
     * If the city is not present, an exception is thrown
     */
    void delete(City city)
    {
        if (hasCity(city)) cities.remove(city);
        else throw new IllegalArgumentException();
    }

    /**
     *
     * @return
     *  Returns the number of cities in the CityList
     */
    int countCities()
    {
        return cities.size();
    }
}
