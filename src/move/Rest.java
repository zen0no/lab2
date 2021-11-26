package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;

public class Rest extends PhysicalMove{
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e1 = new Effect().turns(0).stat(Stat.HP, -99999);
        Effect e2 = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e1);
        p.setCondition(e2);
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}
