package Interfaces;

import Enums.Emotions;

public interface IEmotionable {

    default void cackle(){
        System.out.println("Зачем кудахтать-то...");
    }

    default void squeal(Emotions emotion){
        System.out.printf("Ну визжать от %s можно только Карлсону...", emotion.getEmotion());
    }

}
