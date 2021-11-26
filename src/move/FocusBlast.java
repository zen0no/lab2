package move;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class FocusBlast extends SpecialMove{
  public FocusBlast(){
      super(Type.FIGHTING, 120, 70);
  }

  @Override
  protected String describe(){
      return "использует FocusBlast";
  }

  @Override
  protected void applyOppEffects(Pokemon p){
      p.setMod(Stat.SPECIAL_DEFENSE, -1);
  }
}
