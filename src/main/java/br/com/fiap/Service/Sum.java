package br.com.fiap.Service;

public class Sum implements Operations {
    @Override
    public String opName() {
        return "SOMA";
    }

    @Override
    public String opSymbol() {
        return "+";
    }

    @Override
    public double opCalculate(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public String opMessage(double number1, double number2) {
        return "O RESULTADO DA: " + opName() + " ENTRE " + number1 +
                " E " + number2 + " É " + opCalculate(number1, number2);
    }

}