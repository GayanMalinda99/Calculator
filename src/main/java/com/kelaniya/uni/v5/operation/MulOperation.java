package com.kelaniya.uni.v5.operation;

public class MulOperation implements Operation {
    public Double execute(Double[] numbers){

        if((numbers[0]==0.0) || (numbers[1]==0.0)){
            return 0.0;
        }else{
            return numbers[0] * numbers[1];
        }

    }
}
