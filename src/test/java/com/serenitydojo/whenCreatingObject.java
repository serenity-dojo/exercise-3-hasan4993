package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Dog.feed;

public class whenCreatingObject {
    @Test
    public void describing_a_dog() {
        Dog describe = new Dog("Kobe", "Bugs Bunny", 2, "Beef");
        Assert.assertEquals(describe.getName(), "Kobe");
        Assert.assertEquals(describe.getFavoriteToy(), "Bugs Bunny");
        Assert.assertEquals(describe.getAge(), 2);

    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5, "Beef");
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }

    /*
    TODO: In this exercise, you will add some methods to the Dog class you created previously. To ensure they work, complete the new tests in the WhenCreatingObjects class:
         Add a method called makeNoise() to your Dog class that returns "Woof"
         Refactor your makeNoise() method to use a static constant called DOG_NOISE
         Add a new method called feed() method that sets the isFed field to true
    */
    @Test
    public void dog_making_noise() {
        Dog describe = new Dog("Kobe", "Bugs Bunny", 2);
        describe.makeNoise();
        System.out.println("Dog is fed " + feed());



    }
}

