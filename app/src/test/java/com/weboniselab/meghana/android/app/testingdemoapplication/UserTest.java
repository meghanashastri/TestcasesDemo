package com.weboniselab.meghana.android.app.testingdemoapplication;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by webonise on 19/10/15.
 */
public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("meghana");

        Assert.assertEquals("meghana", u.getName());
    }




}
