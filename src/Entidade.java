public class Entidade {
    private double vida;

    public Entidade(double vida) {
        this.vida = vida;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
        if (this.getVida() < 0){
            this.setVida(0);
        }
    }
}
