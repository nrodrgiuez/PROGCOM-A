import java.util.*;
import java.lang.*;
import java.io.*;

class Main {Ejercicios clase {
    public static void main(String[] args) {
        int numero = 10; 
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número no es positivo");
        }
        String resultado = (numero > 0) ? "Positivo" : "No positivo";
        System.out.println(resultado);

        int edad = 20; 
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);

        int num1 = 15;
        int num2 = 10; 
        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales");
        }
        int mayor = (num1 > num2) ? num1 : num2;
        System.out.println("El mayor es: " + mayor);

        int calificacion = 75; 
        if (calificacion >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        String estado = (calificacion >= 60) ? "Aprobado" : "Reprobado";
        System.out.println(estado);

        int numeroPar = 7; 
        if (numeroPar % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        String tipo = (numeroPar % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es " + tipo);

        int num1Tres = 5;
        int num2Tres = 10;
        int num3Tres = 7; 
        if (num1Tres >= num2Tres && num1Tres >= num3Tres) {
            System.out.println("El mayor es: " + num1Tres);
        } else if (num2Tres >= num1Tres && num2Tres >= num3Tres) {
            System.out.println("El mayor es: " + num2Tres);
        } else {
            System.out.println("El mayor es: " + num3Tres);
        }
        int mayorTres = (num1Tres >= num2Tres && num1Tres >= num3Tres) ? num1Tres : (num2Tres >= num3Tres) ? num2Tres : num3Tres;
        System.out.println("El mayor es: " + mayorTres);

        int ano = 2020; 
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        String esBisiesto = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) ? "Bisiesto" : "No bisiesto";
        System.out.println("El año es " + esBisiesto);

        int caracteres = 8; 
        if (caracteres >= 8) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }
        String validacion = (caracteres >= 8) ? "Contraseña válida" : "Contraseña inválida";
        System.out.println(validacion);

        int numeroFizz = 15; 
        if (numeroFizz % 3 == 0 && numeroFizz % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numeroFizz % 3 == 0) {
            System.out.println("Fizz");
        } else if (numeroFizz % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(numeroFizz);
        }
        String resultadoFizz = (numeroFizz % 3 == 0 && numeroFizz % 5 == 0) ? "FizzBuzz" : (numeroFizz % 3 == 0) ? "Fizz" : (numeroFizz % 5 == 0) ? "Buzz" : String.valueOf(numeroFizz);
        System.out.println(resultadoFizz);

        double saldo = 1000.0;
        double montoRetiro = 500.0; 
        if (montoRetiro <= saldo) {
            System.out.println("Retiro posible");
        } else {
            System.out.println("Retiro no posible");
        }
        String posibilidad = (montoRetiro <= saldo) ? "Retiro posible" : "Retiro no posible";
        System.out.println(posibilidad);
    }
}