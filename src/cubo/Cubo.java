
package cubo;

public class Cubo {
    int ancho, alto, profundo;

    public Cubo() {
    }

    public Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    //METODO QUE CALCULA EL VOLUMEN DEL CUBO
    public int CalcularVolumen(int ancho, int alto, int profundo){
        return ancho * alto * profundo;
    }

    
}
