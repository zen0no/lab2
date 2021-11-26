package pokemon;

import move.*;

public class Vikavolt extends Charjabug {
    public Vikavolt(String name, int level){
        super(name, level);
        this.setStats(57, 82, 95, 55, 75, 36);
        this.addMove(new MagicalLeaf());
    }}
