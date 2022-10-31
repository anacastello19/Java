
public class HolaMundo {

    public static void main(String[] args) {
        /*
       // Clase 1
       
        System.out.println("Hola mundo desde Java");

        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo string
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programacion";
        System.out.println(miVariableCadena);
         */
        //Clase 2
        //Var-Inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        /*
        //soutv+ tab
        // SHIFT + f6 para ejecutar el codigo

//Reglas para definir una variable en java
        var String usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
//Caracteres especiales
        var nombre = "Juan";
        System.out.println("Nueva linea: \n" + nombre + "\n");//"Salto de linea": Diagonal inversa y letra "n"
        System.out.println("Tabulador: \t" + nombre);//"Tabulacion": Diagonal inversa y letra "t"
        System.out.println("MENU: \t\t");
        System.out.println("Retroceso: \b" + nombre);//"Retroceso": Diagonal inversa y letra "b"
        System.out.println("Comillas simples \'" + nombre + "\'");//Comillas simples
        System.out.println("Comillas dobles: \"" + nombre + "\"");//Comillas dobles

//Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);

        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del float: "+Float.MIN_VALUE);
        System.out.println("Valor maximo del float: "+Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del double: "+Double.MIN_VALUE);
        System.out.println("Valor maximo del double: "+Double.MAX_VALUE);
       
        var numEntero = 20;//Las literales sin punto son automaticamente enteros
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F;
//Las literales con punto son automaticamente de tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
        
        //Tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar); 
        char varCaracter = '\u0024';//Indicamos la asignacion del codigo unicode
        System.out.println("varCaracter = " + varCaracter); 
        char varCaracterSimbolo = 36;//Indicamos el valor decimal del dodigo unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo); 
        
        //Tipos primitivos tipos booleanos
        boolean varBoole = false;
        System.out.println("varBool = " + varBoole);
        if (varBoole)
        {System.out.println("La bandera es verde");}
        else
        {System.out.println("Labandera es roja");}
        
        //Algoritmo es mayor de edad?
        var edad = 17;
        //var adulto = edad >= 18;//Expresion booleana
        
        if (edad>= 18)
         {System.out.println("Eres mayor de edad");}
        else
        {System.out.println("No eres mayor de edad");}
        
        //Conversiones de tipos primitivos
        
        System.out.
        edad = Integer.parseInt("20");
        
        System.out.println("edad = " + edad);
   

//Converciones de tipos primitivos en Java parte 2
        String edadTexto = String.valueOf(4);
        System.out.println("edadTexto =" + edadTexto);
        
        var fraseChar = "programadores".charAt(4);
        System.out.println("Digite un caracter");
        fraseChar=entrada.nextLine().charAt(0);    
        System.out.println("fraseChar=" + fraseChar);
         */
 /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solucion de la suma=" + solucion);
        solucion = num1- num2;
        System.out.println("solucion de la resta" + solucion);
        solucion = num1 * num2 ;
        System.out.println("solucion de la multiplicacion" +solucion);
        solucion = num1 /num2;
        System.out.println("solucion de la division"+ solucion);
        solucion = num1% num2;
        System.out.println("solucion =" + solucion);
        
        System.out.println("Es un numero par");
        //Falta
         
        //operadores de asignacion
        int varnum1 =1, varnum2 = 4;
        
        int varnum3= varnum1 + 6 - varnum2; //una operacion
        System.out.println("varnim3="+ varnum3);
        
        varnum1 += 1;  
        System.out.println("varnum1 = " + varnum1);
        
        varnum2-= 2;
        //Terminar

        //Operadores condicionales son el ant y el or
        var valorA = 7;
        var valorMin = 0;
        var valorMax = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta)
        System.out.println("Esta dentro del valor establecido");
        else
        System.out.println("Esta fuera del ranfo establecido");
        
        
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre)
            System.out.println("Papa puede asistir");
        else 
            System.out.println("Papa no puede asistir");
        //
        
       //Operador Ternario segun la condcion vamos a tener dos opciones falso o verdadero
            
       var resultadoT = (5>8)? "Verdadero": "Falso";
       System.out.println("resultado="+ resultadoT);
            
       var numT = 7; 
       resultadoT = (numT % 2 == 0)? "Par": "Impar";
       System.out.println("resultadoT=" + resultadoT);
         */
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x=" + x);//6
        System.out.println("y=" + y);
        System.out.println("z=" + z);

        var solucionAritmetica = 4 + 5 * 6 / 3; //14
        System.out.println("La solucion es=" + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("La solucion es=" + solucionAritmetica);

    }
}
