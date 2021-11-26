package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class RockTomb extends PhysicalMove{
    public RockTomb(){
      super(Type.ROCK, 60, 95);
    }

    @Override
    protected String describe(){
      return "использует RockTomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
      p.setMod(Stat.SPEED, -1);
    }
}
