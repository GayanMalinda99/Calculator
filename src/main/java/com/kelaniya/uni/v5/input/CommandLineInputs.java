package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments){

        this.args = arguments;
    }

    public String getOperator() throws InvalidInputException {
        if(args.length == 0){
            throw new InvalidInputException("Please provide the operation as an argument");
        }

        String operation = args[0];

        if(!( operation.equals("add") || operation.equals("sub") || operation.equals("mul") || operation.equals("div"))){  // Violation of OCP
            throw new InvalidInputException("Please provide add, sub , mul , div as operator argument");

        }

        return operation;
    }
}
