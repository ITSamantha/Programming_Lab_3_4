package Classes;

import Enums.ItemType;
import Exceptions.UnknownActionException;
import java.util.Objects;
import java.util.Random;

public class FrakenBok extends Human {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = new Item(item);
    }

    //Вложенный static
    public static class Item {
        private String caption;

        public String getCaption() {
            return caption;
        }

        private Item() {
            caption = ItemType.values()[new Random().nextInt(ItemType.values().length)].getItemType();
        }

        private Item(String caption) {
            this.caption = caption;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "caption='" + caption + '\'' +
                    '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(caption);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || !obj.getClass().equals(this.getClass())) {
                return false;
            }
            return caption.equals(((Item) obj).caption);
        }
    }

    public FrakenBok() {
        super("Фрекен Бок");
        item = new Item();
    }

    @Override
    public void rush(Human human) {
        try {
            if (!item.equals(new Item("выбивалка для ковров"))) {
                throw new UnknownActionException("\n{Мда...Предмет не совсем тот, но ладно...}");
            }
        } catch (UnknownActionException e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.printf("\n%s мчалась за %s с %s.", this.name, human.getName(), item.getCaption());
        }
    }

    @Override
    public String toString() {
        return "FrakenBok{" +
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
        return name.equals(((FrakenBok) obj).name);
    }


}

