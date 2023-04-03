package Classes;

import Enums.RoomType;
import Exceptions.FlatException;
import java.util.Objects;
import java.util.Random;

public class Flat extends Place {
    private Room room;

    public Room getRoom() {
        return room;
    }

    //Вложенный non-static
    public class Room extends Place {

        private RoomType roomType;

        public Room(RoomType type) {
            super("комната");
            this.roomType = type;
        }

        @Override
        public String toString() {
            return roomType.getRoomType() + " " + this.getCaption();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || !obj.getClass().equals(room.getClass())) {
                return false;
            }
            Room room = (Room) obj;
            return this.roomType.equals(room.roomType);
        }
    }

    private Carlson carlson;

    public Carlson getCarlson() {
        return carlson;
    }

    private Dog bimbo;

    public Dog getBimbo() {
        return bimbo;
    }

    private FrakenBok frakenBok;

    public FrakenBok getFrakenBok() {
        return frakenBok;
    }

    private Junior junior;

    public Junior getJunior() {
        return junior;
    }

    public Flat() {
        super("Квартира");
        this.room = new Room(RoomType.values()[new Random().nextInt(RoomType.values().length)]);
        if (!this.equals(new Flat(RoomType.BIG))) {
            throw new FlatException("Вы перепутали квартиру... Тут " +
                    this.room.getCaption() + " " + this.room.roomType.getRoomType() + "...");
        }
        carlson = new Carlson();
        bimbo = new Dog("Бимбо");
        frakenBok = new FrakenBok();
        junior = new Junior();
    }

    private Flat(RoomType type) {
        super("Квартира");
        this.room = new Room(type);
        carlson = new Carlson();
        bimbo = new Dog("Бимбо");
        frakenBok = new FrakenBok();
        junior = new Junior();
    }

    @Override
    public String toString() {
        return "Flat{" +
                "room=" + room +
                ", carlson=" + carlson +
                ", bimbo=" + bimbo +
                ", frakenBok=" + frakenBok +
                ", junior=" + junior +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(room);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        Flat flat = (Flat) obj;
        return this.room.equals(flat.room);
    }
}
