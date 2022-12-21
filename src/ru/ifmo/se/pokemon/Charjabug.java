package ru.ifmo.se.pokemon;

public class Charjabug extends Pokemon {
    public Charjabug(String name, int level) {
        super(name, level);
        setStats(9500, 1, 95,55, 75, 36);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new ViceGrip(), new  Facade(), new Discharge());
    }
}
