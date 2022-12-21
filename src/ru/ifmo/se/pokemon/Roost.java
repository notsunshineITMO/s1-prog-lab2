package ru.ifmo.se.pokemon;

public class Roost extends StatusMove {
    public final String describe() {
        return Messages.get("ATTACK");
    }
    public Roost() {
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, (int)(pokemon.getHP() - pokemon.getStat(Stat.HP)));
        pokemon.setMod(Stat.HP, (int) (pokemon.getStat(Stat.HP))/2);
        pokemon.setType(Type.NONE);
    }
}
