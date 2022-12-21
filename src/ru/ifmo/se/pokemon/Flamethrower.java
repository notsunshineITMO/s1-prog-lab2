package ru.ifmo.se.pokemon;

public class Flamethrower extends SpecialMove {
    public final String describe(){
        return Messages.get("SPECIAL_ATTACK");
    }

    public Flamethrower (){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() * 100 < 10) {
                Effect.burn(pokemon);
            }
        }
    }
