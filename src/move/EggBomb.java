package move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class EggBomb extends PhysicalMove{
    public EggBomb(){
      super(Type.NORMAL, 100, 75);
    }

    @Override
    protected String describe(){
      return "использует EggBomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
      p.setMod(Stat.HP, (int) this.power);
    }
}
