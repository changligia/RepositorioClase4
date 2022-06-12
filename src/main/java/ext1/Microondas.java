package ext1;

import ext1.exsub1.Electrodomestico;

public class Microondas extends Electrodomestico {
    private int numeroDeBotones;
    private double calorMaximo;
    private boolean vienePlatoVidrio;

    public Microondas(String marca, double peso, String id, String tienda, int numeroDeBotones,
                      double calorMaximo, boolean vienePlatoVidrio) {
        super(marca, peso, id, tienda);
        this.numeroDeBotones = numeroDeBotones;
        this.calorMaximo = calorMaximo;
        this.vienePlatoVidrio = vienePlatoVidrio;
    }

    @Override
    public void encender(){
        System.out.println("Hola Soy un Microondas y me prendí");
    }

    @Override
    public void apagar(){
        System.out.println("Hola Soy un Microondas y me apagué");
    }

    public int getNumeroDeBotones() {
        return numeroDeBotones;
    }

    public void setNumeroDeBotones(int numeroDeBotones) {
        this.numeroDeBotones = numeroDeBotones;
    }

    public double getCalorMaximo() {
        return calorMaximo;
    }

    public void setCalorMaximo(double calorMaximo) {
        this.calorMaximo = calorMaximo;
    }

    public boolean vienePlatoVidrio() {
        return vienePlatoVidrio;
    }

    public void setVienePlatoVidrio(boolean vienePlatoVidrio) {
        this.vienePlatoVidrio = vienePlatoVidrio;
    }
}
