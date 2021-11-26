package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;


public class Confide extends StatusMove{
    public Confide(){
      super();
      this.type = Type.NORMAL;
    }

    @Override
    protected String describe(){
      return "использует Confide";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}
