package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] values = new double[] {65, 51, 16, 11, 6519, 191,0, 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        for (double v : values) {
            descriptiveStatistics.addValue(v);
        }

        double mean = descriptiveStatistics.getMean();
        double median = descriptiveStatistics.getPercentile(50);
        double standardDeviation = descriptiveStatistics.getStandardDeviation();

// Adicione prints para ver os resultados
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}