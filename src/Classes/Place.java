package Classes;

public abstract class Place {
    private String caption;

    public Place(String place){
        this.caption=place;
    }
    public String getCaption() {
        return caption;
    }
}
