package Enums;

import Classes.Place;

public enum Position {

    AHEAD("Впереди"),
    BEHIND("Позади"),
    BEHIND_ALL("Позади всех"),
    NOT_CLEAR_WHERE("Непонятно где"),
    ALL_FLAT("По всей квартире");


    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
