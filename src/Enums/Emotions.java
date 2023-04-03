package Enums;

public enum Emotions {
    FEAR("страха"),
    PLEASURE("удовольствия"),
    NOTHING_TO_DO("нечего делать");

    private String emotion;

    Emotions(String emotion) {
        this.emotion = emotion;
    }

    public String getEmotion() {
        return emotion;
    }
}
