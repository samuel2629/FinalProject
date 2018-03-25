package com.silho.ideo.jokeslib;

import java.util.Random;

public class TellingJoke {

    private String[] jokes;
    private Random random;

    public TellingJoke() {
        jokes = new String[3];
        jokes[0] = "Tu connais l'histoire a 2 balles ? Pan Pan";
        jokes[1] = "Comment fait un zoophile pour sauter ? Il prend son elan";
        jokes[2] = "C'est l'histoire du chien Paf qui traverse, et paf le chien.";
        random = new Random();
    }

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
