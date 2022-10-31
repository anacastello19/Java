
package domian;

class Empleado extends Persona {
    
    protected int idEmpleado;
    protected double sueldo ;
    protected static int contadorEmpleados; //Es para incrementar
    
    //Constructor
    public Empleado(String nombre, double sueldo){
        super (nombre);
        this.idEmpleado = ++Empleado.contadorEmpleados;
        this.sueldo=sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }

   
    
}
