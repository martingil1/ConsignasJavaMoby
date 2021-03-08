package exercise2;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
Dados dos números enteros x e y como inputs deberás realizar la operación x/y. Si
x e y no son números enteros o si y vale cero, se producirá una excepción y deberás
informarla. Las excepciones son java.util.InputMismatchException y
java.lang.ArithmeticException
 */
public class exercise2 {

    public static void main(String[] args) {

        int x, y;
        try{
            System.out.println("Valor para x:");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            System.out.println("Valor para y:");
            y = scanner.nextInt();
            System.out.println( x + " dividido " + y + " es: " + x / y);
        }catch (InputMismatchException ie){
            System.out.println("Se solicita numero entero !");
            main(args);
        }catch (ArithmeticException ae){
            System.out.println("No se puede dividir por cero !!!");
            main(args);
        }

    }
}
