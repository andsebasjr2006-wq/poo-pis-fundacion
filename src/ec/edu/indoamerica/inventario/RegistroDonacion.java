package ec.edu.indoamerica.inventario;

import java.util.Locale;
import java.util.Scanner;

/**
 * Universidad Tecnológica Indoamérica
 * Carrera: Ingeniería en Tecnologías de la Información
 * Materia: Programación Orientada a Objetos
 * Autor: Andrés Jaramillo
 * Fecha: 24 de octubre de 2026
 * Descripción: Programa de consola que registra una donación aplicando lectura por teclado y salida tabulada con printf.
 */
public class RegistroDonacion {

    // Método principal que gestiona la lectura de datos y muestra el comprobante
    public static void main(String[] args) {
        // Inicialización del objeto Scanner para leer datos desde el teclado
        Scanner entradaTeclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== REGISTRO DE DONACIÓN ===");

        // Lectura del nombre del donante y del producto (cadenas de texto)
        System.out.print("Nombre del donante: ");
        String nombreDonante = entradaTeclado.nextLine();

        System.out.print("Producto donado: ");
        String productoDonado = entradaTeclado.nextLine();

        // Lectura de la cantidad en unidades (número entero) y valor unitario (decimal)
        System.out.print("Cantidad (unidades): ");
        int cantidadUnidades = entradaTeclado.nextInt();

        System.out.print("Valor unitario ($): ");
        double valorUnitario = entradaTeclado.nextDouble();

        // Corrección del salto de línea pendiente en el búfer tras leer datos numéricos
        entradaTeclado.nextLine();

        // Lectura de la fecha de registro de la donación
        System.out.print("Fecha de donación (dd/mm/aaaa): ");
        String fechaDonacion = entradaTeclado.nextLine();

        // Cálculo del valor total estimado de la donación mediante un método auxiliar
        double valorTotalDonacion = calcularValorTotal(cantidadUnidades, valorUnitario);

        // Impresión del comprobante tabulado aplicando formato con printf
        imprimirComprobanteTabulado(
                nombreDonante,
                productoDonado,
                cantidadUnidades,
                valorUnitario,
                valorTotalDonacion,
                fechaDonacion
        );

        // Cierre del recurso Scanner al finalizar la lectura
        entradaTeclado.close();
    }

    // Método que calcula el monto total multiplicando la cantidad por el valor unitario
    public static double calcularValorTotal(int cantidad, double precioUnitario) {
        return cantidad * precioUnitario;
    }

    // Método que muestra en consola el comprobante de donación alineado con printf
    public static void imprimirComprobanteTabulado(
            String donante,
            String producto,
            int cantidad,
            double valorUnitario,
            double valorTotal,
            String fecha) {

        System.out.println();
        System.out.printf("====================================================================%n");
        System.out.printf("                 COMPROBANTE OFICIAL DE DONACIÓN                    %n");
        System.out.printf("====================================================================%n");
        System.out.printf("%-22s : %-40s%n", "Donante", donante);
        System.out.printf("%-22s : %-40s%n", "Fecha de registro", fecha);
        System.out.printf("--------------------------------------------------------------------%n");
        System.out.printf("%-25s %10s %14s %14s%n", "PRODUCTO", "CANTIDAD", "V. UNITARIO", "V. TOTAL");
        System.out.printf("--------------------------------------------------------------------%n");
        System.out.printf("%-25s %10d %13s%.2f %13s%.2f%n",
                producto, cantidad, "$", valorUnitario, "$", valorTotal);
        System.out.printf("====================================================================%n");
        System.out.printf("Registrado por: Andrés Jaramillo%n");
        System.out.printf("====================================================================%n");
    }
}
