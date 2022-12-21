package ru.ifmo.se.pokemon;

public class EnergyBall extends SpecialMove {
    public final String describe() {
        return Messages.get("SPECIAL_ATTACK");
    }

    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() * 100 < 10) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
}