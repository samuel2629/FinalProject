package com.udacity.gradle.builditbigger.backend;

import com.silho.ideo.jokeslib.Joke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joke myData;
    private MyBean mData;

    public MyBean(){
        myData = new Joke();
    }

    public String getData() {
        return myData.getRandomJoke();
    }

    public void setData(MyBean data) {
        mData = data;
    }
}