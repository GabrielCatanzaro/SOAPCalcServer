package br.com.fiap.Service;

import jakarta.jws.WebService;

@WebService()
public class Subtraction implements Operations{
    @Override
    public String opName() {
        return "SUBTRAÇÃO";
    }

    @Override
    public String opSymbol() {
        return "-";
    }

    @Override
    public double opCalculate(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public String opMessage(double number1, double number2) {
        return "O RESULTADO DA: " + opName() + " ENTRE " + number1 + " E " + number2 + " É " + opCalculate(number1, number2);
    }

}
