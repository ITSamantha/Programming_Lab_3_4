package Interfaces;

import Enums.PlaceToCircle;
import Enums.Position;

public interface IFlyable {
    void circle(PlaceToCircle place);

    void fly(Position position);
}
