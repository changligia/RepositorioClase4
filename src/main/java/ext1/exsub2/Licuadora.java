package ext1.exsub2;

import ext1.exsub1.Electrodomestico;

public class Licuadora extends Electrodomestico {
    private int numeroAspas;
    private int numeroDeVelocidades;
    private boolean contenedorVidrio;

    public Licuadora(String marca, double peso, String id, String tienda, int numeroDeAspas,
                     int numeroDeVelocidades, boolean contenedorVidrio) {
        super(marca, peso, id, tienda);
        this.numeroAspas = numeroDeAspas;
        this.numeroDeVelocidades = numeroDeVelocidades;
        this.contenedorVidrio = contenedorVidrio;
    }

    @Override
    public void encender(){
        System.out.println("Hola Soy una licuadora y me prendí");
    }

    @Override
    public void apagar(){
        System.out.println("Hola Soy una licuadora y me apagué");
    }

    public int getNumeroAspas() {
        return numeroAspas;
    }

    public void setNumeroAspas(int numeroAspas) {
        this.numeroAspas = numeroAspas;
    }

    public int getNumeroDeVelocidades() {
        return numeroDeVelocidades;
    }

    public void setNumeroDeVelocidades(int numeroDeVelocidades) {
        this.numeroDeVelocidades = numeroDeVelocidades;
    }

    public boolean contenedorVidrio() {
        return contenedorVidrio;
    }

    public void setcontenedorVidrio(boolean contenedorVidrio) {
        this.contenedorVidrio = contenedorVidrio;
    }
}
