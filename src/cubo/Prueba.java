package cubo;

public class Prueba {

    public static void main(String[] args) {
        Cubo cubo = new Cubo(3,2,6);
        int res = cubo.CalcularVolumen(cubo.ancho, cubo.alto, cubo.profundo);
        System.out.println("El volumen del cubo es = "+res);
    }
}
