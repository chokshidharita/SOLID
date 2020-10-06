package com.principle.solid.d.solution;

public class Main {

    public static void main(String[] args) {

        Emailer emailer = new Emailer(new SpellChecker());
        emailer.checkEmail("dummy email body");

        emailer = new Emailer(new GreekSpellChecker());
        emailer.checkEmail("dummy email body");

    }
}
