import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args){
        Battle battle = new Battle();
        battle.addFoe(new pokemon.Arceus("Arceus", 7));
        battle.addAlly(new pokemon.Kricketot("Kricketot", 5));
        battle.addAlly(new pokemon.Kricketune("Kricketune", 4));
        battle.addFoe(new pokemon.Vikavolt("Vikavolt", 8));
        battle.addAlly(new pokemon.Grubbin("Grubbin", 3));
        battle.addAlly(new pokemon.Charjabug("Charjabug", 6));
        battle.go();
    }
}
