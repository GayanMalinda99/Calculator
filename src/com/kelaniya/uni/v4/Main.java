package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.*;

import java.io.IOException;

//LISKOV Substitution Principle
public class Main {
    public static void main(String[] args) throws IOException {

        // Main class is the coordinator now...
        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator  = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumber();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);
    }
}
