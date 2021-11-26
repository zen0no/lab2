package pokemon;

import move.Rest;
import move.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon{
    public Grubbin(String name, int level){
        super(name, level);
        this.setType(Type.BUG);
        this.setStats(47, 62, 45, 55, 45, 46);
        this.setMove(new Facade(), new Rest());
    }
}
