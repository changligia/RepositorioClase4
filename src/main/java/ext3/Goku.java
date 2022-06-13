package ext3;

public class Goku implements IPersonaje{
    @Override
    public void decirFraseComun() {
        System.out.println("Soy un saiyajin");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Es freezer");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Es krilin");
    }

    @Override
    public void decirSerie() {
        System.out.println("Dragon Ball");
    }
}
