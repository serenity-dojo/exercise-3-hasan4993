package com.serenitydojo;


public class Dog {
    private String name;
    private String favoriteToy;
    private int age;

    public String food;


    public static final String DOG_NOISE = "Woof";

    public static String feed() {
        return "Beef";

    }

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
        this.food = feed();


    }

    public Dog(String name, String favoriteToy, int age, String food) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }


    public int getAge() {
        return age;
    }

    public void makeNoise() {

        System.out.println(name + " The Dog makes the noise of " + DOG_NOISE);
    }


}
