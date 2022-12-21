package ru.ifmo.se.pokemon;

public class PowerGem extends SpecialMove {
    public final String describe() {
        return Messages.get("SPECIAL_ATTACK");
    }
    public PowerGem() {
        super(Type.ROCK, 80, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
}
