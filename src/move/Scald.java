package move;

import ru.ifmo.se.pokemon.*;


public class Scald extends SpecialMove{
    public Scald(){
        super(Type.ICE, 120, 70);
    }

    @Override
    protected String describe(){
        return "использует Scald";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < .3f && !p.hasType(Type.FIRE)) {
            if (p.getCondition() == Status.FREEZE){
                p.setCondition(new Effect());
            }
            else{
                Effect.burn(p);
            }
        }
    }
}
