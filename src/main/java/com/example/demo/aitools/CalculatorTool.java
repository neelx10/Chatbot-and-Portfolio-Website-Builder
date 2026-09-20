package com.example.demo.aitools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component 
public class CalculatorTool {
    @Tool(description = """
        Performs basic arithmetic operations: add, subtract, multiply, 
        divide, power, and mod.
        """)
    public double calculate(
        @ToolParam(description = "Operation: add, subtract, multiply, divide, power, mod") 
        String operation, 
        @ToolParam(description = "First number") 
        double a, 
        @ToolParam(description = "Second number") 
        double b
    ){
        System.out.println("CalculatorTool called with operation: " + operation + ", a: " + a + ", b: " + b);
        if(operation.equals("add")){
            return a + b;
        } else if(operation.equals("subtract")){
            return a - b;
        } else if(operation.equals("multiply")){
            return a * b;
        } else if(operation.equals("divide")){
            if(b == 0){
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;
        } else if(operation.equals("power")){
            return Math.pow(a, b);
        } else if(operation.equals("mod")){
            if(b == 0){
                throw new IllegalArgumentException("Cannot perform modulus by zero");
            }
            return a % b;
        } 
        else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
