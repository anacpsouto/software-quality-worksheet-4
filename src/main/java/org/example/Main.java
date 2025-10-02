package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DescriptiveStatistics stats = new DescriptiveStatistics();

        System.out.println("Digite números (um por linha, 'fim' para terminar):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("fim")) break;

            try {
                double value = Double.parseDouble(input);
                stats.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Número inválido, tente novamente.");
            }
        }

        System.out.println("Média: " + stats.getMean());
        System.out.println("Mediana: " + stats.getPercentile(50));
        System.out.println("Desvio Padrão: " + stats.getStandardDeviation());
    }
}