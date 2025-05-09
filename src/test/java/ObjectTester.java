import br.com.fiap.Service.Subtraction;
import br.com.fiap.Service.Sum;

public class ObjectTester {
    public static void main(String[] args) {
        Sum soma = new Sum();
        System.out.println(soma.opCalculate(10, 20));

        Subtraction subtração = new Subtraction();
        System.out.println(subtração.opMessage(10, 20));
    }
}
