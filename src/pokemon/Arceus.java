package pokemon;

import move.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Arceus extends Pokemon{
    public Arceus(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(120, 120, 120, 120, 120, 120);
        this.setMove(new IceBeam(), new RockTomb(), new FocusBlast(), new Confide());
    }
}