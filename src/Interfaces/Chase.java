package Interfaces;

import Enums.ChaseType;
import Enums.Emotions;
import Enums.Position;
import Enums.TimeType;
import Exceptions.UnknownActionException;

public interface Chase {
    void start(TimeType timeType, ChaseType chaseType,Position position);
}
