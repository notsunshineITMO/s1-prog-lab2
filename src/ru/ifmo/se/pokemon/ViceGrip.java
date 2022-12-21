package ru.ifmo.se.pokemon;

public class ViceGrip extends PhysicalMove {
    public final String describe() {
        return Messages.get("ATTACK");
    }
    public ViceGrip () {
        super(Type.NORMAL, 55, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }

}
