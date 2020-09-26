package de.designexe.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@ApplicationScoped
public class EditSightView {
    private int sightID ;
    private String sightName;
    private double entranceFee;
    private boolean handicapped;
    private double price;
    private City city;
    private String[] myArray;
    private Map<String, String> myMap;


    @PostConstruct
    public void init(){
        this.sightID = 1;
        this.sightName = "Hafen";
        this.price = 12.5;
        this.city = new City("Elmshorn");
        myMap = new HashMap<>();
        myMap.put("Eins", "Erster Wert");
        myMap.put("Zwei", "Zweiter Wert");
        myMap.put("Drei", "Dritter Wert");
        myArray = new String[] {"Eins", "Zwei", "Drei"};
    }

    public String[] getMyArray() {
        return myArray;
    }

    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSightID() {
        return sightID;
    }

    public void setSightID(int sightID) {
        this.sightID = sightID;
    }

    public String getSightName() {
        return sightName;
    }

    public void setSightName(String sightName) {
        this.sightName = sightName;
    }

    public double getEntranceFee() {
        return entranceFee;
    }

    public void setEntranceFee(double entranceFee) {
        this.entranceFee = entranceFee;
    }

    public boolean isHandicapped() {
        return handicapped;
    }

    public void setHandicapped(boolean handicapped) {
        this.handicapped = handicapped;
    }
}
