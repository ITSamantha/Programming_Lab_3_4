package Classes;

import Interfaces.IEmotionable;
import Interfaces.IFlyable;
import Interfaces.IKeepable;
import Interfaces.IRushable;

public abstract class Human implements IRushable, IEmotionable, IKeepable {
    protected String name;

    protected Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
