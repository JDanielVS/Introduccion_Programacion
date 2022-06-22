import java.util.Scanner;

public class Tarea1 {

    public static int suma(int a, int b, int c){ // Se crea la función suma con los tres parámetros

        return a + b + c;
    }

    public static void main(String[] args) { //En la clase principal asignamos valores a los parámetros y llamamos a suma

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Dime tres números y los sumo: ");

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println(suma(a,b,c));
    }
}
