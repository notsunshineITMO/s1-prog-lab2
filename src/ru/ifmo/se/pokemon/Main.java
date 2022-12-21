package ru.ifmo.se.pokemon;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        Slowpoke p1 = new Slowpoke("Leon", 1);
        Charjabug p2 = new Charjabug("Colt", 1);
        Slowking p3 = new Slowking("El Primo", 1);
        Grubbin p4 = new Grubbin("Shelly", 1);
        TapuBulu p5 = new TapuBulu("Spike", 1);
        Vikavolt p6 = new Vikavolt("Nita", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
