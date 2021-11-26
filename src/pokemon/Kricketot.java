package pokemon;

import move.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kricketot extends Pokemon{
    public Kricketot(String name, int level){
        super(name, level);
        this.setType(Type.BUG);
        this.setStats(37, 25, 41, 25, 41, 25);
        this.setMove(new Blizzard(), new WorkUp(), new IceBeam());
    }
}
