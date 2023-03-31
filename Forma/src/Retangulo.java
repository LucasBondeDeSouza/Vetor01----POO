public class Retangulo extends Triangulo{

    public Retangulo(float base, float altura) {
        super(base, altura);
    }

    public Retangulo() {
    }

    @Override
    float area() {
        return getBase()*getAltura();
    }

    @Override
    void mostrar() {
        System.out.println("\t\t ** Retangulo** ");
        System.out.println("Base: "+getBase());
        System.out.println("Altura: "+getAltura());
        System.out.println("Area: "+area());
        System.out.println("Perimetro: "+perimetro());
    }

    @Override
    float perimetro() {
        return getBase()+getBase()+getAltura()+getAltura();
    }
}