package Enums;

import com.sun.source.doctree.BlockTagTree;

public enum TimeType {

    BARELY("еле"),
    EXACT("точно"),
    LITTLE("немного"),
    AGAIN("снова");
    private String timeType;

    TimeType(String timeType) {
        this.timeType = timeType;
    }

    public String getTimeType() {
        return timeType;
    }
}
