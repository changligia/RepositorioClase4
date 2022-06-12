package ext3;

//Para llamar a la Inferface utilizamos la palabra implements
public class Batman implements IPersonaje{
    @Override
    public void decirFraseComun() {
        System.out.println("Soy la Venganza");
    }

    @Override
    public void decirEnemigo() {
        System.out.println("Es joker");
    }

    @Override
    public void decirMejorAmigo() {
        System.out.println("Es Alfred");
    }

    @Override
    public void decirSerie() {
        System.out.println("Dark Night");
    }
}
