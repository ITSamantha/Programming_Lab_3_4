package Enums;

import java.sql.Struct;

public enum ItemType {
    CARPET_BEATER("выбивалка для ковров"),
    WHIP("плётка"),
    PAN_WITH_DUMPLINGS("кастрюля с пельменями");

    ItemType(String itemType) {
        this.itemType = itemType;
    }

    private String itemType;

    public String getItemType() {
        return itemType;
    }
}
