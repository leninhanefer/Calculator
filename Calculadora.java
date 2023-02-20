import java.util.Scanner;

public class Calculadora {

    /* - - - - - -
    Desenvolver uma calculadora na consola:
    Operação:
    + - * / >>>> nextLine
    Numeros:
    a = 10 >>>> nextLine
    b = 20 >>>> nextLine
    a = 10 e b = 20 por isso a + b = 30  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double resultado = 0;

        System.out.println("Introduza 1º número inteiro: ");
        String a = scanner.nextLine();
        double num1 = Integer.parseInt(a);

        System.out.println("Selecione a operação ( +, -, *, / ): ");
        String op = scanner.nextLine();
        char simbolo = ' ';

        System.out.println("Introduza 2º número inteiro: ");
        String b = scanner.nextLine();
        double num2 = Integer.parseInt(b);

        switch (op) {
            case "+":
                resultado = Integer.parseInt(a) + Integer.parseInt(b);
                break;
            case "-":
                resultado = Integer.parseInt(a) - Integer.parseInt(b);
                break;
            case "*":
                resultado = Integer.parseInt(a) * Integer.parseInt(b);
                break;
            case "/":
                resultado = Integer.parseInt(a) / Integer.parseInt(b);
                break;
            default:
        }
        String rsp = "\na = " + a + "\nb = " + b + "\nPor isso: a " + op + " b = " + resultado;

        System.out.println(rsp);

        /*Scanner scanner = new Scanner(System.in);

        double resultado = 0;

        System.out.println("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Escolha uma operação:");
        int indexOp = scanner.nextInt();

        switch (indexOp) {
            case 1:
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                resultado = num1/num2;
                break;
        }
        System.out.println("Total: " + resultado); */
    }
}







