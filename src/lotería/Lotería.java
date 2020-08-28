package lotería;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Lotería {

    int contador = 0, elemento, ayu, n = 0;
    Scanner entrada = new Scanner(System.in);
    int[] vector = new int[5];
    Random r = new Random();
    int ram = r.nextInt(10) + 1;

    public void generar() {
        while (n < 5) {
            for (int i = 0; i < vector.length; i++) {
                System.out.print("\033[34mIngrese 5 números afortunados:\033[m ");
                vector[i] = entrada.nextInt();
                for (int j = 0; j < i; j++) {
                    if (vector[i] == vector[j]) {
                        contador = 1;

                    } else {
                        n++;
                    }
                }
            }
            if (contador == 1) {
                System.out.println("\033[35mUsted no puede ingresar números que ya existen en su boletín.\033[m");
                n--;
                ayu = 1;

            } else {
                n++;
            }
        }
        if (ayu != 1) {
            System.out.println("=============================================================");
            System.out.println("\033[31mLos números que usted ingresó fueron: \033[m");
            System.out.println(Arrays.toString(vector));
        }
    }

    public void comparar() {
        if (contador != 1) {

            System.out.println("=============================================================");
            System.out.println("\033[36mEl número afortunado es: \033[m" + ram);
            for (int i = 0; i < vector.length; i++) {
                if (ram == vector[i]) {
                    System.out.println("=============================================================");
                    System.out.println("\033[32mFelicidades acabas de ganar la lotería!!!\033[m");
                    elemento = vector[i];
                }
            }
            System.out.println("=============================================================");
            if (ram != elemento) {
                System.out.println("\033[32mDesafortunadamente no tuvo ningún acierto, inténtelo en otra ocasión.\033[m");
            }
        }
    }
}
