package ru.ifmo.se.pokemon;

public class SweetScent extends StatusMove {
    public final String describe() {
        return Messages.get("ATTACK");
    }
    public SweetScent() {
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION,-1);
    }
}
