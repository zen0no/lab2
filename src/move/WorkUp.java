package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class WorkUp extends StatusMove{
    public WorkUp(){
      super();
      this.type = Type.NORMAL;
    }

    @Override
    protected String describe(){
      return "использует WorkUp";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
      p.setMod(Stat.ATTACK, 1);
      p.setMod(Stat.SPECIAL_ATTACK, 1);
    }
}
