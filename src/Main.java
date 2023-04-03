import Classes.*;
import Enums.*;
import Exceptions.FlatException;
import Exceptions.UnknownActionException;
import Interfaces.Chase;

import java.util.Random;

/*796. Карлсон, ликуя, кружил вокруг лампы. Карлсон метнулся в большую комнату,
 и снова началась бешеная погоня по всей квартире.
 Впереди летел Карлсон -- он кудахтал и визжал от удовольствия,
 за ним мчалась фрекен Бок с выбивалкой для ковров, за ней еле поспевал Малыш,
 а позади всех скакал Бимбо, бешено тявкая.*/
public class Main {
    public static void main(String[] args) {
        try {
            //Анонимный класс
            Chase chase = new Chase() {
                @Override
                public void start(TimeType timeType, ChaseType chaseType, Position position) {
                    try {
                        if (!chaseType.equals(ChaseType.MAD)) {
                            throw new UnknownActionException("\n{Погоня-то бешеная, но ладно...}");
                        }
                    } catch (UnknownActionException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.printf("%s %s началась %s погоня. ", position.getPosition(),
                                timeType.getTimeType(),
                                chaseType.getChaseType());
                    }
                }
            };

            Flat flat = new Flat();
            flat.getCarlson().triumph();
            flat.getCarlson().circle(PlaceToCircle.values()[new Random()
                    .nextInt(PlaceToCircle.values().length)]);
            flat.getCarlson().toss(flat.getRoom());
            chase.start(TimeType.values()[new Random().nextInt(TimeType.values().length)],
                    ChaseType.values()[new Random().nextInt(ChaseType.values().length)],
                    Position.values()[new Random().nextInt(Position.values().length)]);
            flat.getCarlson().fly(Position.values()[new Random().nextInt(Position.values().length)]);
            flat.getCarlson().cackle();
            flat.getCarlson().squeal(Emotions.values()[new Random().nextInt(Emotions.values().length)]);
            flat.getFrakenBok().rush(flat.getCarlson());
            flat.getJunior().keepUp(TimeType.values()[new Random().nextInt(TimeType.values().length)],
                    flat.getFrakenBok());
            flat.getBimbo().jump(Position.values()[new Random().nextInt(Position.values().length)]);
            flat.getBimbo().yelp();
        } catch (FlatException ex) {
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
    }
}