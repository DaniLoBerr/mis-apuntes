public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche(); //Esto es un objeto
        // Nombre de la clase + nombre de la variable = new tipo de clase
        System.out.println(coche.velocidadActual);
        coche.acelerar(); // Invocación de un método de la clase (se llama a la función)
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche();
        System.out.println(coche.velocidadActual);
    }
}
class Coche { //Esto es una clase
    int numeroDePuertas; //Esto son las propiedades de la clase
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){
        // Esto es un constructor.
    }

    public void acelerar(){
        velocidadActual +=15; // Expresión corta para sumar el valor 15 a una variable
    } //Esto son los métodos de la clase
    public void decelerar(){}
}