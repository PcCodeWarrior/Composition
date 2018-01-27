package com.softwarethatperforms;

public class Bindings {
    private String model;
    private Settings settings;

    public Bindings(String model, Settings settings) {
        this.model = model;
        this.settings = settings;
    }

    public String getModel() {
        return model;
    }

    public Settings getSettings() {
        return settings;
    }

    public void testBinding (){
        System.out.println("Bindings look good");
    }
}
