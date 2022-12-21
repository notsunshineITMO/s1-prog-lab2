package ru.ifmo.se.pokemon;

public class Facade extends PhysicalMove {
    public final String describe() {
        return Messages.get("ATTACK");
    }
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition().equals(Status.PARALYZE) || pokemon.getCondition().equals(Status.BURN) || pokemon.getCondition().equals(Status.POISON)){
            v = v*2;
        }
        pokemon.setMod(Stat.HP, (int) v);
    }



}
