package ru.ifmo.se.pokemon;

import java.util.concurrent.locks.Condition;

public class DreamEater extends SpecialMove {
    @Override
    protected String describe() {
        return "применяет DreamEater";
    }
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.SLEEP) {
            pokemon.setMod(Stat.HP, -100);
        }
    }
}
