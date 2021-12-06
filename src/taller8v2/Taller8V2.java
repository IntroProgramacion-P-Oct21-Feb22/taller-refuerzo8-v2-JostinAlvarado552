/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8v2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Taller8V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String tipo;
        String nombrecliente;
        String nombreproducto;
        String tipocliente;
        String cadena1 = "";
        double porcentaje1 = 1;
        double porcentaje2 = 5;
        double porcentaje3 = 10;
        double porcentaje4 = 15;
        double descuento1;
        double descuento2;
        double descuento3;
        double descuento4;
        int cantidad = 0;
        double subtotal = 0;
        double costofinal = 0;
        boolean bandera = true;
        int salida = 0;
        double precioproducto = 0;
        int cedula = 0;
        double sumatotal = 0;
        String cadena2 = " ";

        do {
            System.out.println("Ingrese  nombre");
            nombrecliente = entrada.nextLine();
            System.out.println("Ingrese tipo de cliente");
            tipocliente = entrada.nextLine();
            System.out.println("Ingrese su número de cédula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese la cantidad deseada del producto");
            cantidad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese el número que corresponda al producto deseado\n"
                    + "1.Computadora1 = $1000\n"
                    + "2.Computadora2 = $1100\n"
                    + "3.Computadora = $900\n");
            nombreproducto = entrada.nextLine();
            if (nombreproducto.equals("1")) {
                precioproducto = 1000;
            }
            if (nombreproducto.equals("2")) {
                precioproducto = 1100;
            }
            if (nombreproducto.equals("3")) {
                precioproducto = 900;
            }
            subtotal = (cantidad * precioproducto);

            descuento1 = (subtotal * porcentaje1) / 100;
            descuento2 = (subtotal * porcentaje2) / 100;
            descuento3 = (subtotal * porcentaje3) / 100;
            descuento4 = (subtotal * porcentaje4) / 100;
            if (subtotal < 0 && cantidad < 0) {
                System.out.println("Valor fuera de rango");
            } else {
                if (tipocliente.equals("tipo1")) {
                    costofinal = subtotal - descuento1;

                } else {
                    if (tipocliente.equals("tipo2")) {
                        costofinal = subtotal - descuento2;

                    } else {
                        if (tipocliente.equals("tipo3")) {
                            costofinal = subtotal - descuento3;

                        } else {
                        }
                        if (tipocliente.equals("tipo4")) {
                            costofinal = subtotal - descuento4;

                        }
                    }
                }
            }
            sumatotal = sumatotal + costofinal;
            cadena1 = String.format("%s\nVenta \n"
                    + "Nombre del cliente:%s\n"
                    + "Cédula del cliente:%d\n"
                    + "Tipo de producto:%s\n"
                    + "Cantidad: %d\n"
                    + "Precio unitario: %.2f\n"
                    + "Subtotal: %.2f\n"
                    + "Precio final: %.2f\n",
                    cadena1,
                    nombrecliente,
                    cedula, nombreproducto, cantidad,
                    precioproducto, subtotal, costofinal);
            System.out.println("Ingrese (-1) si ya no va a ordenar nada mas, caso contrario pulse cualquier numero");
            salida = entrada.nextInt();
            if (salida == -1) {
                bandera = false;
            }
            entrada.nextLine();

            System.out.println(cadena1);
        } while (bandera);
        System.out.printf("La suma final de las ventas es:%.2f", sumatotal);
    }
}
