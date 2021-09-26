package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SubOperationTest {

    @Test
    public void should_subtract_positive_values()  {

        SubOperation subOperation=new SubOperation();
        Double result = subOperation.execute(new Double[]{5.0,6.0});

        assertThat(result, is(-1.0));
    }

    @Test
    public void should_subtract_zeros()  {

        SubOperation subOperation=new SubOperation();
        Double result = subOperation.execute(new Double[]{0.0,-2.0});

        assertThat(result, is(2.0));
    }

    @Test
    public void should_subtract_negative_values()  {

        SubOperation subOperation=new SubOperation();
        Double result = subOperation.execute(new Double[]{-1.0,-2.0});

        assertThat(result, is(1.0));
    }

}