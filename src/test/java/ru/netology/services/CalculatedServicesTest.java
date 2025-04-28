package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculatedServicesTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void calculated(int expected, int income, int expenses, int treshold) {
        CalculatedServices service = new CalculatedServices();

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(expected, actual);
    }
}