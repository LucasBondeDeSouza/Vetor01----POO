public class Triangulo extends Forma{
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    float area() {
        return (base*altura)/2;
    }

    @Override
    void mostrar() {
        System.out.println("\t\t ** Triangulo ** ");
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
        
    }
}