package ru.ifmo.se.pokemon;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int level) {
        super(name, level);
        setStats(9500, 1, 45,55, 45, 46);
        setType(Type.BUG);
        setMove(new ViceGrip(), new  Facade());
    }

}
