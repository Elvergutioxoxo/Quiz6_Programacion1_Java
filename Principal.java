public class Principal {

    public static void main(String[] args) {
        System.out.println("\n--------------------------");
        Circulo circulo= new Circulo( "Circulo", "Amarillo",25);
        circulo.obtenerArea();
        circulo.obtenerPerimetro();
        System.out.println("\n--------------------------");
        Triangulo triangulo= new Triangulo("Triangulo", "Purpura", 25,30 );
        triangulo.obtenerArea();
        triangulo.obtenerPerimetro();
        System.out.println("\n--------------------------");
        Rectangulo rectangulo= new Rectangulo("Rectangulo", "Negro", 12, 28);
        rectangulo.obtenerArea();
        rectangulo.obtenerPerimetro();
    }
}