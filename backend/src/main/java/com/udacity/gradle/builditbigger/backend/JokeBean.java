package com.udacity.gradle.builditbigger.backend;

import com.silho.ideo.jokeslib.TellingJoke;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private TellingJoke myData;
    private JokeBean mData;

    public JokeBean(){
        myData = new TellingJoke();
    }

    public String getData() {
        return myData.getRandomJoke();
    }

    public void setData(JokeBean data) {
        mData = data;
    }
}