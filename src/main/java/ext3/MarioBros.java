package ext3;

//Para llamar a la Inferface utilizamos la palabra implements
public class MarioBros implements IPersonaje {
    @Override
    public void decirFraseComun() {
        System.out.println("Mama mia");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Browser");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Toad");
    }

    @Override
    public void decirSerie() {
        System.out.println("Super Mario Bross");
    }
}
