package Interfaces;

import Classes.Human;
import Enums.TimeType;

public interface IKeepable {
    default void keepUp(TimeType time, Human human){
        System.out.printf("Да-да, %s поспевает за %s...", time.getTimeType(), human.getName());
    }
}
