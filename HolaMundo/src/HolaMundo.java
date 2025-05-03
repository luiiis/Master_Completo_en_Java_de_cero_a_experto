public class HolaMundo {
//metodo principal con el emtodo main

public static void main(String[] args) throws Exception {
    String saludar ="Hello, Mundo!";//tipo de dato cadena
    System.out.println(saludar);
    System.out.println(saludar.toUpperCase());//convertir todo a mayuscula

    int numero =10;
    int numero2 =5;

    boolean valor =true;
    if(valor){
        System.out.println("numero = "+numero);
        numero2 =10;
    }
    System.out.println("numero2 = "+numero2);

    //version 10 en java var puede ser de cual quier tipo de dato
    var numero3 = 15;
//se debe evitar asentos o ñ o carcacteres especiales, nombre de clases variables
    String nombre;
    nombre ="Luis";

    if(numero>10){
        nombre = "juan";
    }
    System.out.println("nombre = "+nombre);
}
}
