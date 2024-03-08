import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Variável
        double lado, area;
        // Entrada de dados
        System.out.println("Informe o lado do cubo em metros: ");
        lado = input.nextDouble();
        // Chamada do método calcularArea()
        area = calcularArea(lado);
        System.out.printf("A área de superfície do cubo é de %.1fm.", area);
    }
    public static double calcularArea(double lado) {
        double area;
        area = (lado * lado) * 6;
        return area;
    }
}
