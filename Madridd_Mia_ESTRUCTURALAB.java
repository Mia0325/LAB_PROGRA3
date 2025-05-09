/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cw.pkg04.pkg28.pkg25;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mia
 */
public class Madridd_Mia_ESTRUCTURALAB {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random random = new Random();

        int opcion;
        int conteo_palabras = 0;
        int conteo_numeroperfecto = 0;
        int conteo_primos = 0;
        int conteo_votaciones = 0;

        boolean salir = false;

        while (!salir) {
            // Mostrar el Menú principal
            System.out.println("\n****************************");
            System.out.println("        MENU PRINCIPAL        ");
            System.out.println("******************************");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Elige una opcio5n: ");
            opcion = scr.nextInt();
            scr.nextLine(); 

            if (opcion == 1) {
                conteo_palabras++;

                System.out.print("¿Cuantas palabras vas a ingresar?: ");
                int cantidad_palabras = scr.nextInt();
                scr.nextLine();

                String palabra_MasLarga = "";
                int mayor_longitud = 0;

                int contador = 0;
                while (contador < cantidad_palabras) {
                    System.out.print("Palabra #" + (contador + 1) + ": ");
                    String palabra = scr.nextLine();

                    // Imprimir la palabra al revés
                    String alreves = "";
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        alreves += palabra.charAt(i);
                    }
                    System.out.println("Al reves: " + alreves);

                    if (palabra.length() > mayor_longitud) {
                        palabra_MasLarga = palabra;
                        mayor_longitud = palabra.length();
                    }

                    contador++;
                }

                System.out.println("Palabra mas larga: " + palabra_MasLarga);

                // Verificar si la palabra es palíndromo
                String invertida = "";
                for (int i = palabra_MasLarga.length() - 1; i >= 0; i--) {
                    invertida += palabra_MasLarga.charAt(i);
                }

                if (palabra_MasLarga.equalsIgnoreCase(invertida)) {
                    System.out.println("Es un palindromo.");
                } else {
                    System.out.println("No es un palindromo.");
                }
           
             // Opcion 2: Proceso Números Perfectos
            } else if (opcion == 2) {
                conteo_numeroperfecto++;

                System.out.print("Ingresa un numero: ");
                int num = scr.nextInt();

                int suma = 0;
                int i = 1;
                while (i < num) {
                    if (num % i == 0) {
                        suma += i;
                    }
                    i++;
                }

                if (suma == num) {
                    System.out.println(num + " es un numero perfecto.");
                } else {
                    System.out.println(num + " no es un numero perfecto.");
                }

            //Opción 3: Proceso Números Primos
            } else if (opcion == 3) {
                conteo_primos++;

                int numero = random.nextInt(100) + 1;
                System.out.println("Numero generado: " + numero);

                int divisores = 0;
                String lista = "";

                int i = 1;
                while (i <= numero) {
                    if (numero % i == 0) {
                        divisores++;
                        lista += i + " ";
                    }
                    i++;
                }

                if (divisores == 2) {
                    System.out.println("El numero es primo.");
                } else {
                    System.out.println("El numero no es primo.");
                }

                System.out.println("Divisores de " + numero + ": " + lista);
                System.out.println("Total de divisores: " + divisores);

            //Opción 4: Proceso Votaciones
            } else if (opcion == 4) {
                conteo_votaciones++;

                System.out.print("¿Cuantos votantes hay?: ");
                int votantes_total = scr.nextInt();
                scr.nextLine();

                int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0;
                int votos = 0;

                while (votos < votantes_total) {
                    System.out.print("Voto #" + (votos + 1) + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                    String voto = scr.nextLine().toUpperCase();

                    if (voto.equals("AZUL")) azul++;
                    else if (voto.equals("ROJO")) rojo++;
                    else if (voto.equals("NEGRO")) negro++;
                    else if (voto.equals("AMARILLO")) amarillo++;
                    else nulo++;

                    votos++;
                }

                int planilla_validas = azul + rojo + negro + amarillo;
                double porcentaje_votantes = (planilla_validas * 100.0) / votantes_total;

                if (porcentaje_votantes >= 60) {
                    String ganador_planilla = "AZUL";
                    int maximo = azul;

                    if (rojo > maximo) {
                        ganador_planilla = "ROJO";
                        maximo = rojo;
                    }
                    if (negro > maximo) {
                        ganador_planilla = "NEGRO";
                        maximo = negro;
                    }
                    if (amarillo > maximo) {
                        ganador_planilla = "AMARILLO";
                    }

                    System.out.println("Planilla ganadora: " + ganador_planilla);
                } else {
                    System.out.println("VOTACION FALLIDA");
                }

            //Opción 5: Procesos Salida
            } else if (opcion == 5) {
                salir = true;

                System.out.println("***** Estadisticas de uso *****");
                System.out.println("1. Palabra Alreves: " + conteo_palabras + " veces.");
                System.out.println("2. Numero Perfecto: " + conteo_numeroperfecto + " veces.");
                System.out.println("3. Primos: " + conteo_primos + " veces.");
                System.out.println("4. Votaciones: " + conteo_votaciones + " veces.");
                System.out.println("Gracias por usar el sistema.");
            } else {
                System.out.println("Opcion invalida, intente de nuevo.");
            }
        }

        scr.close();
    }
}
 

