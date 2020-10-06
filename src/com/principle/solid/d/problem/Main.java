package com.principle.solid.d.problem;

public class Main {

    public static void main(String[] args) {

        Emailer emailer = new Emailer(new SpellChecker());
        emailer.checkEmail("dummy email body");

        //  Emailer emailer = new Emailer(new GreekSpellChecker());

        /*
         * Here we have two different implementations of spellcheckers we want to include. We have the default spell
         * checker and a new greek spell checker. With the current implementation, if I want to use GreekSpellCheck now
         * than refactoring is needed because the Emailer class uses only the SpellChecker class. A simple solution is
         * to create the interface for the different spell checkers to implement.
         *
         * DIP (Dependency Inversion Principle) states that we should depend on abstractions (interfaces and abstract
         * classes) instead of concrete implementations (classes).
         */
    }
}
