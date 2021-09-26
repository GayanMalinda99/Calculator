package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MulOperationTest {

    @Test
    public void should_multiply_positive_values()  {

        MulOperation mulOperation=new MulOperation();
        Double result = mulOperation.execute(new Double[]{4.0,2.0});

        assertThat(result, is(8.0));
    }

    @Test
    public void should_multiply_negative_values()  {

        MulOperation mulOperation=new MulOperation();
        Double result = mulOperation.execute(new Double[]{-3.0,-6.0});

        assertThat(result, is(18.0));
    }

    @Test
    public void should_multiply_positive_values_and_negative_values()  {

        MulOperation mulOperation=new MulOperation();
        Double result = mulOperation.execute(new Double[]{-8.0,3.0});

        assertThat(result, is(-24.0));
    }

    @Test
    public void should_multiply_zero()  {

        MulOperation mulOperation=new MulOperation();
        Double result = mulOperation.execute(new Double[]{-4.0,0.0});

        assertThat(result, is(0.0));
    }

}