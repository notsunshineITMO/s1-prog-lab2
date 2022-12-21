package ru.ifmo.se.pokemon;

public class Slowpoke extends Pokemon {
    public Slowpoke(String name, int level) {
        super(name, level);
        setStats(9500, 1, 65,40, 40, 15);
        setType(Type.WATER, Type.PSYCHIC);
        setMove(new Flamethrower(), new  CalmMind(), new  DreamEater());
    }
}