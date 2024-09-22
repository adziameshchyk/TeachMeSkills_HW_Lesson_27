package by.tms.service;

public class CalcService {

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mult(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    public double calculate(double num1, double num2, String operation) {
        if (operation == null) {
            System.out.println("Operation cannot be null!");
            return 0;
        }


        switch (operation) {
            case "add" -> {
                return add(num1, num2);
            }
            case "sub" -> {
                return sub(num1, num2);
            }
            case "mult" -> {
                return mult(num1, num2);
            }
            case "div" -> {
                return div(num1, num2);
            }
            default -> {
                System.out.println("Wrong operation!");
                return 0;
            }
        }
    }

}
