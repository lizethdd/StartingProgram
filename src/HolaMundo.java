
public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Hola alumnos de 2 de DAM");
        
        int ejVarInt=10;
        System.out.println(ejVarInt);
        ejVarInt=2;
        System.out.println(ejVarInt);
        
        String ejVarString= "Hola Alumno";
        System.out.println(ejVarString);
        
        //INFERENCIA DE TIPOS: uso de 'var' en la definición de variables
        var numEntero=15;
        System.out.println(numEntero);
        
        var cadenaDeTexto="Testeando la diferencia en Java";
        System.out.println(cadenaDeTexto);
        
        var cadenaDeTexto2= " en el curso de DAM CEEP";
        System.out.println("cadenaDeTexto2 = " + cadenaDeTexto2);
    }
    
}

