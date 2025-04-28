package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        CalculatedServices service = new CalculatedServices();
        System.out.println(service.calculate(10000,3000, 20000));
    }
}