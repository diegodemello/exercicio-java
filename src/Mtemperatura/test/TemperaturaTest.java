package Mtemperatura.test;

import Mtemperatura.dominio.Temperatura;

import java.util.Scanner;

public class TemperaturaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();

        System.out.print("Digite a temperatura em Fahrenheit: ");
        temperatura.setTemperatura(scanner.nextDouble());
        System.out.println(temperatura.conversor());
    }
}
