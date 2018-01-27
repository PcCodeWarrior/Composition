package com.softwarethatperforms;

public class Main {

    public static void main(String[] args) {
	  Bindings bindings = new Bindings("miller", new Settings (5,10));
	  Boots boots = new Boots("Hanson", 315.5);
	  Poles poles = new Poles("Fries", 52);
	  Skis  skis  = new Skis("K2",205);

	  Skier skier = new Skier(boots,bindings,poles,skis);
	  skier.getBind();
    }
}
