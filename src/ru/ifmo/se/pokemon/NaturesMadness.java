package ru.ifmo.se.pokemon;

public class NaturesMadness extends SpecialMove {
    public final String describe() {
        return Messages.get("SPECIAL_ATTACK");
    }

    public NaturesMadness() {
        super(Type.FAIRY, 0, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        double minusHP = pokemon.getHP()/2;
        pokemon.setMod(Stat.HP, (int) minusHP);
    }
}