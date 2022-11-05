package domian;

public class Persona {
    public final static int CONSTANTE_AQUI=15;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir() {
        System.out.println("Metodo imprimir");
    }

    public String setNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
