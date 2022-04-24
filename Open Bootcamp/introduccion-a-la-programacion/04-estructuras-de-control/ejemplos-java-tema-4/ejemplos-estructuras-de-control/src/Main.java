// Ejemplo condicionales de selección de Java
public class Main {
    public static void main(String[] args) {
        String estacion = "verano";
        int temperatura = 21;

        if (estacion == "invierno") {
            System.out.println ("Estamos en la estación de invierno");
        } else if (estacion == "primavera" && (temperatura <= 19)) {
            System.out.println ("Estamos en la estación de primavera y hacen 19 ºC o menos");
        } else {
            System.out.println ("Vete a la playa");
        }
    }
}