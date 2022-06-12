package ext2;
/*En que caso se usó polimorfismo
R= En la clase Calculadora al definir el mismo metodo calcularSuma pero con distinto numero de parametros
y en la clase StringUtilities al definir el metodo concatenarStrings pero con distinto numero de parametros.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Polimorfismo*****");
        System.out.print("Ingrese double1: ");
        var double1 = scanner.nextDouble();

        System.out.print("Ingrese double2: ");
        var double2 = scanner.nextDouble();

        System.out.print("Ingrese double3: ");
        var double3 = scanner.nextDouble();

        System.out.print("Ingrese int1: ");
        var int1 = scanner.nextInt();

        System.out.print("Ingrese int2: ");
        var int2 = scanner.nextInt();

        System.out.print("Ingrese int3: ");
        var int3 = scanner.nextInt();

        System.out.print("Ingrese String1: ");
        var string1 = scanner.nextLine();

        System.out.print("Ingrese String2: ");
        var string2 = scanner.nextLine();

        System.out.print("Ingrese String3: ");
        var string3 = scanner.nextLine()
        scanner.close();

        double sumar3Doubles = Calculadora.calcularSuma(double1, double2, double3);
        double sumar2Doubles = Calculadora.calcularSuma(double1, double2);
        int sumar2Enteros = Calculadora.calcularSuma(int1, int2);
        int sumar3Enteros = Calculadora.calcularSuma(int1, int2, int3);

        String concatenar2Strings = StringUtilities.concatenarStrings(string1, string2);
        String concatenar3Strings = StringUtilities.concatenarStrings(string1, string2, string3);

        System.out.println("La suma de los 3 Doubles es: " + sumar3Doubles);
        System.out.println("La suma de los 2 Doubles es: " + sumar2Doubles);
        System.out.println("La suma de los 2 Enteros es: " + sumar2Enteros);
        System.out.println("La suma de los 3 Enteros es: " + sumar3Enteros);
        System.out.println("La concatenacion de los 2 String es: " + concatenar2Strings);
        System.out.println("La concatenacion de los 3 String es: " + concatenar3Strings);
    }
}
