import java.util.Scanner;

public class Coche {

    int puerta= 4; //Creamos la variable numérica puerta

    public void incrementoPuerta(){
        this.puerta++;
    }

    public static void main(String[] args) {

        Coche miCoche = new Coche(); //creamos un objeto coche

        miCoche.incrementoPuerta(); //llamamos a la función para aumentar el número de puertas

        System.out.println("Mi coche tiene " + miCoche.puerta + " puertas");
    }

}
