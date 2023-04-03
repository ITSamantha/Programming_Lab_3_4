package Interfaces;

import Enums.ChaseType;
import Enums.Position;
import Enums.TimeType;

public interface Chase {
    void start(TimeType timeType, ChaseType chaseType, Position position);
}
