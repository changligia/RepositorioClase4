package ext1;

/*En que caso de usó encapsulamiento?
 R= Al generar getters y setters para poder acceder a los atributos de las clases

En que caso se usó abstracción?
R= Al mostrar solo los datos de la marca, peso y tienda sin tomar en cuanta el id.

En que caso se usó herencia?
R= En las clases (Cafetera, Licuadora y Microondas) que heredaron los atributos de
la clase padre (Electrodomestico)

En que caso se usó polimorfismo?
R= En las clases (Cafetera, Licuadora y Microondas) que heredaron de la clase abstracta Electrodomestico
para implementar los metodos abstractos (encender y apagar) usando la palabra Override.
*/

import ext1.exsub1.Cafetera;
import ext1.exsub1.Electrodomestico;
import ext1.exsub2.Licuadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Datos de la Cafetera*****");
        System.out.print("Ingrese la marca: ");
        var marca1 = scanner.nextLine();

        System.out.print("Ingrese la tienda: ");
        var tienda1 = scanner.nextLine();

        System.out.print("Ingrese el peso en Kg.: ");
        var peso1 = scanner.nextDouble();

        System.out.print("Ingrese el id: ");
        var id1 = scanner.nextLine();

        System.out.print("Ingrese Capacidad en Lt.: ");
        var capacidadLitros = scanner.nextDouble();

        System.out.print("Ingrese tiempo de Preparacion en minutos: ");
        var tiempoDePreparacion = scanner.nextDouble();

        System.out.print("Viene con Bolsa Café? true/false: ");
        var vieneConBolsaCafe = scanner.nextBoolean();

        System.out.println("*****Datos de la Licuadora*****");
        System.out.print("Ingrese la marca: ");
        var marca2 = scanner.nextLine();

        System.out.print("Ingrese la tienda: ");
        var tienda2 = scanner.nextLine();

        System.out.print("Ingrese el peso: ");
        var peso2 = scanner.nextDouble();

        System.out.print("Ingrese el id: ");
        var id2 = scanner.nextLine();

        System.out.print("Ingrese Numero de Aspas: ");
        var numeroDeAspas = scanner.nextInt();

        System.out.print("Ingrese Numero de Velocidades: ");
        var numeroDeVelocidades = scanner.nextInt();

        System.out.print("Es Contenedor Vidrio? true/false: ");
        var contenedorVidrio = scanner.nextBoolean();

        System.out.println("*****Datos del Microondas*****");
        System.out.print("Ingrese la marca: ");
        var marca3 = scanner.nextLine();

        System.out.print("Ingrese la tienda: ");
        var tienda3 = scanner.nextLine();

        System.out.print("Ingrese el peso: ");
        var peso3 = scanner.nextDouble();

        System.out.print("Ingrese el id: ");
        var id3 = scanner.nextLine();

        System.out.print("Ingrese Numero de Botones: ");
        var numeroDeBotones = scanner.nextInt();

        System.out.print("Ingrese calor Maximo: ");
        var calorMaximo = scanner.nextDouble();

        System.out.print("Viene plato de Vidrio? true/false: ");
        var vienePlatoVidrio = scanner.nextBoolean();
        scanner.close();

        //Instanciando una Cafetera con los datos leidos
        var cafetera = new Cafetera(marca1,peso1, id1, tienda1, capacidadLitros,
                tiempoDePreparacion, vieneConBolsaCafe);

        //Instanciando una Licuadora con los datos leidos
        var licuadora = new Licuadora(marca2, peso2, id2, tienda2, numeroDeAspas,
                numeroDeVelocidades, contenedorVidrio);

        //Instanciando un Microondas con los datos leidos
        var microondas = new Microondas (marca3, peso3, id3, tienda3, numeroDeBotones,
                calorMaximo, vienePlatoVidrio);

        System.out.println("La Capacidad en Litros es: " + cafetera.getCapacidadLitros());
        System.out.println();

        var listaElectrodomestico = new ArrayList<Electrodomestico>();

        //Pueblo la lista con 3 electrodomesticos
        listaElectrodomestico.add(cafetera);
        listaElectrodomestico.add(licuadora);
        listaElectrodomestico.add(microondas);

        for (Electrodomestico electrodomestico: listaElectrodomestico) { //recorro la lista con el for each
            electrodomestico.decirMarca();
            electrodomestico.decirPeso();
            electrodomestico.decirTienda();
        }
    }
}


