package exercise1;
/*
Se te pide que calcules la potencia de un número implementando una calculadora.
Crea la clase MyCalculator la cual consiste en un único método long power(int a,
int b). Este método recibe dos parámetros y eleve el primero por el segundo (a
elevado a la b). Si cualquiera de los dos números que se reciben es negativo,
entonces el método deberá lanzar una excepción que diga “Ninguno de los
números ingresados debe ser negativo”. También, si éstos tienen valor cero, el
método deberá lanzar una excepción que diga “Ninguno de los números
ingresados puede valer cero”.
 */
public class MyCalculator {

    public long power(int a, int b){

        if(a < 0 || b < 0){
            throw new RuntimeException("Ninguno de los números ingresados debe ser negativo");
        }else if(a == 0 || b == 0){
            throw new RuntimeException("Ninguno de los números ingresados puede valer cero");
        }
        return (long)Math.pow(a,b);
    }

}
