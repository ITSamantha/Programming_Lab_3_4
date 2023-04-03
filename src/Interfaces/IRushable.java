package Interfaces;

import Classes.Human;
import Classes.Place;

public interface IRushable {
     default void toss(Place place){
          System.out.println("Да, не только Карлсон умеет метаться...");
     }

     default void rush(Human human) {
          System.out.print("Тяжело будет %s убежать от человека...");
     }
}
