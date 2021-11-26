package move;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class IceBeam extends SpecialMove{
    public IceBeam(){
      super(Type.ICE, 120, 70);
    }

    @Override
    protected String describe(){
      return "использует IceBeam";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
      if (Math.random() < .1f && p.hasType(Type.ICE)){
        Effect.freeze(p);
      }
    }
}
