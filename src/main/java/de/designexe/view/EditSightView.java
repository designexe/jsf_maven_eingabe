package de.designexe.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class EditSightView {
    private int sightID ;
    private String sightName;
    private double entraceFee;
    private boolean handicappe;
    private double preis;
    private City city;



    public EditSightView() {
        this.sightID = 1;
        this.sightName = "Hafen";
        this.preis = 12.5;
        this.city = new City("Elmshorn");

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
