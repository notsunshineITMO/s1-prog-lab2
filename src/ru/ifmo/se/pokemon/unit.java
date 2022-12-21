package ru.ifmo.se.pokemon;

record PersonData(
        String name,
        String surname
) {}

class Test{

    public static void main(String[] args) {
        var a = new PersonData("Name", "Surname");
    }

}