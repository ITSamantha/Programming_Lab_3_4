package Classes;

import Enums.TimeType;

public class Junior extends Human{
    public Junior() {
        super("Малыш");
    }

    @Override
    public void keepUp(TimeType time, Human human) {
        System.out.printf("\n%s %s поспевал за %s. ",this.name, time.getTimeType(),human.getName());
    }

    @Override
    public String toString() {
        return "Junior{" +
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
