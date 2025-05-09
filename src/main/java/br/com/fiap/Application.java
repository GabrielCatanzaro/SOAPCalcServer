package br.com.fiap;

import br.com.fiap.Service.Division;
import br.com.fiap.Service.Multiplication;
import br.com.fiap.Service.Subtraction;
import br.com.fiap.Service.Sum;
import jakarta.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/service/sum", new Sum());
        Endpoint.publish("http://localhost:8080/service/subtraction", new Subtraction());
        Endpoint.publish("http://localhost:8080/service/multiplication", new Multiplication());
        Endpoint.publish("http://localhost:8080/service/division", new Division());
    }
}
