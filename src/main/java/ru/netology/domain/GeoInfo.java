package ru.netology.domain;

public class GeoInfo {
    private String typ; // тип места
    private String coordinates; // координаты места
    private PlaceInfo place; // описание места (если оно добавлено)

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PlaceInfo getPlace() {
        return place;
    }

    public void setPlace(PlaceInfo place) {
        this.place = place;
    }
}
