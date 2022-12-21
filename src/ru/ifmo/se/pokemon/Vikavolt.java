package ru.ifmo.se.pokemon;

public class Vikavolt extends Pokemon {
    public Vikavolt(String name, int level) {
        super(name, level);
        setStats(9500, 1, 90,145, 75, 43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new ViceGrip(), new  Facade(), new Discharge(), new Roost());
    }
}
