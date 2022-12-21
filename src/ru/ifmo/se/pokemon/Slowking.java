package ru.ifmo.se.pokemon;

public class Slowking extends Pokemon {
    public Slowking(String name, int level) {
        super(name, level);
        setStats(9500, 1, 80,100, 110, 30);
        setType(Type.WATER, Type.PSYCHIC);
        setMove(new Flamethrower(), new  CalmMind(), new  DreamEater(), new  PowerGem());
    }
}
