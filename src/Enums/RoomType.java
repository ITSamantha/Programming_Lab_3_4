package Enums;

public enum RoomType {
    BIG("большая"),
    SMALL("маленькая"),
    SQUARED("30x40 кв м");

    private String roomType;

    public String getRoomType() {
        return roomType;
    }

    private RoomType(String room) {
        this.roomType = room;
    }

}
