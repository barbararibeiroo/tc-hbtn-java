public class Program {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(7);
        retangulo.setAltura(4);
        System.out.println("Retangulo eh uma subclasse de FormaGeometrica");
        System.out.printf("Area: %.2f\n", retangulo.area());
        System.out.println(retangulo.toString()); }
}