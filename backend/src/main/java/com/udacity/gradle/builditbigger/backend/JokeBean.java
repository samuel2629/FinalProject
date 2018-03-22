package com.udacity.gradle.builditbigger.backend;

import com.silho.ideo.jokeslib.Joke;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private Joke myData;
    private JokeBean mData;

    public JokeBean(){
        myData = new Joke();
    }

    public String getData() {
        return myData.getRandomJoke();
    }

    public void setData(JokeBean data) {
        mData = data;
    }
}