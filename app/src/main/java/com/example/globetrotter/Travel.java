package com.example.globetrotter;

public class Travel {
    private String country;
    private String city;
    private String travel_date;

    public Travel() {
    }

    public Travel(String country, String city, String travel_date) {
        this.country = country;
        this.city = city;
        this.travel_date = travel_date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTravel_date() {
        return travel_date;
    }

    public void setTravel_date(String travel_date) {
        this.travel_date = travel_date;
    }
}
