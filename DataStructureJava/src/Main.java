import java.util.Scanner;
import Packages.Arrays;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String option;
        do{
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("Menú principal");
            System.out.println("----------------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Candenas de caracteres");
            System.out.println("2. Vectores");
            System.out.println("3. Listas ligadas");
            System.out.println("4. Pilas y colas");
            System.out.println("5. Recursividad");
            System.out.println("6. Árboles y grafos");
            System.out.println("Ingresa la opción que deseas usar: ");
            option = input.nextLine();

            switch(option){
                case "0":
                    System.out.println("Saliste del programa...");
                    break;
                case "1":
                    menuStrings();
                    break;
                case "2":
                    //menuVectors();
                    break;
                default:
                    System.out.println();
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("0"));
    }

    public static void menuStrings(){
//        string option, chain;
//        Strings str = new Strings();
//        Palindrome palin = new Palindorome ();

    }
}