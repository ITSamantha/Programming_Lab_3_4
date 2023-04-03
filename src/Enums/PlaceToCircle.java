package Enums;

public enum PlaceToCircle {

    AROUND_LAMP("вокруг лампы"),
    UNDER_CEILING("под потолком"),
    UNDER_TABLE("под столом");

    private String placeToCircle;

    public String getPlaceToCircle() {
        return placeToCircle;
    }

    PlaceToCircle(String place) {
        this.placeToCircle = place;
    }
}
