// Ejemplo condicionales de selección de Java
public class Main {
    public static void main(String[] args) {
        String estacion = "verano";
        int temperatura = 21;
        int contador = 25;
        int asignaturas = 25;
        int fila = 15;

        if (estacion == "invierno") {
            System.out.println ("Estamos en la estación de invierno");
        } else if (estacion == "primavera" && (temperatura <= 19)) {
            System.out.println ("Estamos en la estación de primavera y hacen 19 ºC o menos");
        } else {
            System.out.println ("Vete a la playa" + " - " + "Ejemplo if/else if/else");
        }

        while (temperatura > 0) {
            System.out.println (temperatura + " - " + "Ejemplo while");
            temperatura = temperatura - 5; // Esta expresión sería equivalente a escribir 5 veces la orden " temperatura--; "
                                            // Otra expresión equivalente para esto sería escribir " temperatura-=5; "
        }

        while (contador > 0) {
            System.out.println (contador + " - " + "Ejemplo while con expresión corta");
            contador--;
            contador--;
            contador--;
            contador--;
            contador--;
            // Ejemplo con la expresión corta.

        }

        while (asignaturas > 0) {
            System.out.println (asignaturas + " - " + "Ejemplo while con expresión corta múltiple");
            asignaturas-=5;
            // Ejemplo con la otra expresión .

        }

        do {
            System.out.println(fila + " - " + "Ejemplo do while");
            fila = fila - 1;
        } while (fila > 10);

        for (int lista = 1; lista <= 10; lista = lista + 1) {
            System.out.println(lista + " - " + "Ejemplo for");
        }
    }

}