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
    private double entraceFee;
    private boolean handicappe;
    private double preis;
    private City city;
    private String[] myArray;
    private Map<String, String> myMap;



    @PostConstruct
    public void init(){
        this.sightID = 1;
        this.sightName = "Hafen";
        this.preis = 12.5;
        this.city = new City("Elmshorn");
        myMap = new HashMap<>();
        myMap.put("Eins", "Erster Wert");
        myMap.put("Zwei", "Zweiter Wert");
        myMap.put("Drei", "Dritter Wert");
        myArray = new String[] {"Eins", "Zwi", "Drei"};
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

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
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

    public double getEntraceFee() {
        return entraceFee;
    }

    public void setEntraceFee(double entraceFee) {
        this.entraceFee = entraceFee;
    }

    public boolean isHandicappe() {
        return handicappe;
    }

    public void setHandicappe(boolean handicappe) {
        this.handicappe = handicappe;
    }
}
