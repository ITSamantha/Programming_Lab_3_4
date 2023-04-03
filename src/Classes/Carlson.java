package Classes;

import Enums.Emotions;
import Enums.PlaceToCircle;
import Enums.Position;
import Interfaces.IFlyable;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class Carlson extends Human implements IFlyable {

    public Carlson() {
        super("Карлсон");
    }

    public void triumph() {
        System.out.printf("%s ликовал.", this.name);
    }

    @Override
    public void circle(PlaceToCircle place) {
        System.out.printf("\n%s кружил %s.", this.name, place.getPlaceToCircle());
    }

    @Override
    public void fly(Position position) {
        System.out.printf("\n%s летел %s.", position.getPosition(), this.name);
    }

    @Override
    public void toss(Place place) {
        System.out.printf("\n%s метнулся в %s.", this.name, place);
    }

    @Override
    public void cackle() {
        System.out.printf("\n%s кудахтал.", this.name);
    }

    @Override
    public void squeal(Emotions emotion) {
        System.out.printf("\n%s визжал от %s.", this.name, emotion.getEmotion());
    }

    @Override
    public String toString() {
        return "Carlson{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return name.equals(((Carlson) obj).name);
    }
}
