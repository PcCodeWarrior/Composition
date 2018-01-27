package com.softwarethatperforms;

public class Skier {
    private Boots boots;
    private Bindings bindings;
    private Poles poles;
    private Skis skis;

    public Skier(Boots boots, Bindings bindings, Poles poles, Skis skis) {
        this.boots = boots;
        this.bindings = bindings;
        this.poles = poles;
        this.skis = skis;
    }

    public void getBind(){
        bindings.testBinding();
    }

    public Boots getBoots() {
        return boots;
    }

    private Bindings getBindings() {
        return bindings;
    }

    public Poles getPoles() {
        return poles;
    }

    public Skis getSkis() {
        return skis;
    }
}
