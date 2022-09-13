package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class whenCreatingObjects {
    @Test
    public void describing_a_dog() {
        Dog describe = new Dog("Kobe", "Bugs Bunny", 2);
        Assert.assertEquals(describe.getName(), "Kobe");
        Assert.assertEquals(describe.getFavoriteToy(), "Bugs Bunny");
        Assert.assertEquals(describe.getAge(), 2);

    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
}
