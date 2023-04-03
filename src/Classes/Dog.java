package Classes;

import Enums.Position;

import java.util.Objects;
import java.util.Random;

public class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public void jump(Position position) {
        System.out.printf("\n%s скакал %s.", position.getPosition(), this.name);
    }

    public void yelp() {

        //Локальный класс
        class Mood {
            private boolean isMood;

            public String getMood() {
                return isMood ? "бешено" : "спокойно";
            }

            public Mood(boolean isMood) {
                this.isMood = isMood;
            }

            public void changeMood() {
                isMood = isMood ? false : true;
            }

            @Override
            public String toString() {
                return "Mood{" +
                        "isMood=" + isMood +
                        "\nMood=" + (isMood ? "бешено" : "спокойно") +
                        '}';
            }

            @Override
            public int hashCode() {
                return Objects.hash(isMood);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Mood mood = (Mood) o;
                return isMood == mood.isMood;
            }
        }
        Mood mood = new Mood(new Random().nextBoolean());
        System.out.printf("\n%s %s тявкал.", this.name, mood.getMood());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }
}
