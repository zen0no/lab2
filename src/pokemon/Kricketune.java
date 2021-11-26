package pokemon;

import move.*;

public class Kricketune extends Kricketot{
    public Kricketune(String name, int level){
        super(name, level);
        this.setStats(77, 85, 51, 55, 51, 65);
        this.addMove(new EggBomb());
    }
}
