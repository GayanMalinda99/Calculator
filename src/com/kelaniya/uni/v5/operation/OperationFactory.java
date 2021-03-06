package com.kelaniya.uni.v5.operation;

//Factory design pattern
public class OperationFactory {

    public Operation getInstance(String operator){

        //OR USE SWITCH CASE
        //Decision Making + Coordination
        Operation operation = null;
        if (operator.equals("add")){
            operation = new AddOperation();
        }else if (operator.equals("sub")){
            operation = new SubOperation();
        }else if (operator.equals("mul")){
            operation = new MulOperation();
        }else if (operator.equals("div")){
            operation = new DivOperation();
        } // Violation of OCP -> This is a known violation

        return operation;

    }

}
