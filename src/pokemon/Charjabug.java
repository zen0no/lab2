package pokemon;


import move.Scald;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Grubbin {
    public Charjabug(String name, int level){
        super(name, level);
        this.addType(Type.ELECTRIC);
        this.setStats(57, 82, 95, 55, 75, 36);
        this.addMove(new Scald());
    }
}
