public class Circunferencia extends Forma{

    private float raio;

    public Circunferencia() {
    }

    public Circunferencia(float raio) {
        this.raio = raio;
    }


    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    float area() {
        return raio*raio*3.14f;
    }

    @Override
    void mostrar() {
        System.out.println("\t\t ** Circunferencia ** ");
        System.out.println("raio: "+getRaio());
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
        
    }

    float perimetro(){
        return 2*raio*3.14f;
    }
}