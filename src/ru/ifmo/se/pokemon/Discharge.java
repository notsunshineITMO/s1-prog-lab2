package ru.ifmo.se.pokemon;

import java.util.concurrent.locks.Condition;

public class Discharge extends SpecialMove {
    public final String describe() {
        return Messages.get("SPECIAL_ATTACK");
    }
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() * 100 < 30) {
            Effect.paralyze(pokemon);
        }
    }
}
