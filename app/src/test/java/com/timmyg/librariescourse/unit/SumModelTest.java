package com.timmyg.librariescourse.unit;

import com.timmyg.librariescourse.lesson7.SumModel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumModelTest {

    private SumModel sumModel;

@Before
public void beforeTest() {
    sumModel = new SumModel(5, 7);
}

@Test
public void sum_whenSome_correct(){
    int result = sumModel.sum();
    Assert.assertEquals(12, result);
}

    @Test
    public void sum_whenSome_incorrect(){
        int result = sumModel.sum();
        Assert.assertNotEquals(-3, result);
    }

}
