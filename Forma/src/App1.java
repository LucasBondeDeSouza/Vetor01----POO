public class App1 {
    public static void main(String[] args) throws Exception {
       Circunferencia c = new Circunferencia(2.3f);
       Triangulo t = new Triangulo(2.3f, 7.4f);
       Retangulo r = new Retangulo(3f, 2f);

       c.mostrar();
       t.mostrar();
       r.mostrar();
    }
}