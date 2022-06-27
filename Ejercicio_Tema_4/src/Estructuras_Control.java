import java.util.Scanner;

public class Estructuras_Control {
    public static void main(String[] args) {

        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        int numeroIf = sc.nextInt();

        if(numeroIf > 0){
            System.out.println("El número es positivo");
        }else if(numeroIf < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es 0");
        }

        System.out.println("Introduce otro número");
        int numeroWhile = sc.nextInt();

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("Tu número incrementado vale " + numeroWhile);
        }

        System.out.println("Introduce otro número");
        int numeroWhile2 = sc.nextInt();

        do {
            numeroWhile2++;
            System.out.println("Tu número incrementado vale " + numeroWhile2);
            break;
        }while (numeroWhile2<3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Tu número vale " + numeroFor);
        }

        System.out.println("Introduce una estación");
        String estacion = sc.next();

        switch (estacion.toLowerCase()){
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            default:
                System.out.println("No es ninguna estación");
        }
    }
}
