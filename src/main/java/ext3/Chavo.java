package ext3;

//Para llamar a la Inferface utilizamos la palabra implements
public class Chavo implements IPersonaje{
    @Override
    public void decirFraseComun() {
        System.out.println("Fue sin querer queriendo");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Es ron ramon");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Es kiko");
    }

    @Override
    public void decirSerie() {
        System.out.println("El chavo del 8");
    }
}
