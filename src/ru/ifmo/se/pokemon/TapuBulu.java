package ru.ifmo.se.pokemon;

public class TapuBulu extends Pokemon {
    public TapuBulu(String name, int level) {
        super(name, level);
        setStats(9500, 1, 115,85, 95, 75);
        setType(Type.GRASS, Type.FAIRY);
        setMove(new EnergyBall(), new SweetScent(), new NaturesMadness(), new FocusBlast());
    }
}
