package move;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
    public Blizzard(){
      super(Type.ICE, 110, 70);
    }

    @Override
    protected String describe(){
      return "использует Blizzard";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < .1f && p.hasType(Type.ICE)){
            Effect.freeze(p);
        }
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        p.setMod(Stat.HP, (int) damage);
    }
}
