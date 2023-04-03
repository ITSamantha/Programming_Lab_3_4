package Enums;

public enum ChaseType {

    MAD("бешеная"),
    SLOW("медленная");

    private String chaseType;

    public String getChaseType() {
        return chaseType;
    }

    ChaseType(String chaseType) {
        this.chaseType = chaseType;
    }
}
