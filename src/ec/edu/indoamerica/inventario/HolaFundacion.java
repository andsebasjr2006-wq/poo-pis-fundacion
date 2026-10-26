package ec.edu.indoamerica.inventario;

/**
 * Universidad Tecnológica Indoamérica
 * Carrera: Ingeniería en Tecnologías de la Información
 * Materia: Programación Orientada a Objetos
 * Autor: Andrés Jaramillo
 * Fecha: 24 de octubre de 2026
 * Descripción: Primer programa en Java (Hola mundo personalizado) para el sistema de inventario de la Fundación.
 */
public class HolaFundacion {

    // Método principal que inicia la ejecución del programa
    public static void main(String[] args) {
        // Declaración de variables con nombres significativos
        String nombreEstudiante = "Andrés Jaramillo";
        String carreraEstudiante = "Ingeniería en Tecnologías de la Información";
        String nombreSistema = "Sistema de Inventario y Donaciones de la Fundación";

        // Llamada al método que muestra el saludo personalizado en consola
        mostrarSaludoPersonalizado(nombreEstudiante, carreraEstudiante, nombreSistema);
    }

    // Método que imprime en consola el mensaje de bienvenida con formato
    public static void mostrarSaludoPersonalizado(String autor, String carrera, String sistema) {
        System.out.println("==============================================================");
        System.out.println("   ¡Hola Mundo! Bienvenido al " + sistema);
        System.out.println("   Desarrollado por: " + autor);
        System.out.println("   Carrera: " + carrera);
        System.out.println("   Estado del entorno Java: Activo y funcionando correctamente");
        System.out.println("==============================================================");
    }
}