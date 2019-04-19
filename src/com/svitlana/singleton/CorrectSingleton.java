package com.svitlana.singleton;

public class CorrectSingleton {

    public static CorrectSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public int getData(){
        return 42;
    }

    private static class Holder {
        static final CorrectSingleton INSTANCE = new CorrectSingleton();
    }

}
