package ru.ifmo.se.pokemon;

public class CalmMind extends StatusMove {

    @Override
    protected String describe() {
        return "применяет CalmMind";
    }
    public CalmMind () {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_DEFENSE, +1);
        pokemon.setMod(Stat.SPECIAL_ATTACK, +1);
    }
}
