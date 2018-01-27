package com.softwarethatperforms;

public class Settings {
    private int forward;
    private int sideways;

    public Settings(int forward, int sideways) {
        this.forward = forward;
        this.sideways = sideways;
    }

    public int getForward() {
        return forward;
    }

    public int getSideways() {
        return sideways;
    }

    public void printSettings(){
        System.out.println(forward+" "+sideways);
    }
}
