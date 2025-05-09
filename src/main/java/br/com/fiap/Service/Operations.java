package br.com.fiap.Service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style = Style.RPC)

public interface Operations {

    @WebMethod
    String opName();

    @WebMethod
    String opSymbol();

    @WebMethod
    double opCalculate(double number1, double number2);

    @WebMethod
    String opMessage(double number1, double number2);
}
