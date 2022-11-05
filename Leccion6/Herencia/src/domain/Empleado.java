package domain;

public class Empleado extends Persona {

    public int idEmpleado;
    public double sueldo;
    public static int contadorEmpleados; //Es para imcrementar el id 

    //Contructor 
    
    public Empleado(){//Constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    
    public Empleado(String nombre, double sueldo) {//Constructor 2
        //super(nombre);
        this();//Estamos llamando desde aqui al constructor vacio
        //(Llama costructor interno)
        this.nombre=nombre;
        this.sueldo = sueldo;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}