package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.print(" \nDag" + (i + 1));
            for (int j = 0; j < usage[i].length; j++) {
                System.out.print(" " + usage[i][j] + "kWh");
            }
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.print(" \nDag" + (i + 1));
            for (int j = 0; j < prices[i].length; j++) {
                System.out.print(" " + prices[i][j] + "kr");
            }
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                sum += usage[i][j];
            }
        }

        System.out.printf("Strømforbruket for hele måneden %.2f kWh %n", sum);

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int i = 0; i < powerusage.length; i++) {
            for (int j = 0; j < powerusage[i].length; j++) {
                usage += powerusage[i][j];
            }
        }

        if (usage > threshold){
            exceeded = true;
        }

        System.out.println(exceeded);

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                price = usage[i][j] * prices[i][j];

                System.out.printf("Spotpris: %.2f kr%n",price);
            }
        }
        
        return price;
    }

    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double prisTime = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                prisTime = usage[i][j] * prices[i][j];

                if (prisTime > THRESHOLD){
                    prisTime -= THRESHOLD;
                    support += (prisTime * PERCENTAGE);
                }
            }
        }

        System.out.println("Støtte er " + support + "kr");

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {
        //Med Norges pris betaler kunden en fast pris på 50 øre per kWh.
        double price = 0;

        for (double[] dag : usage){
            double prisDag = 0;
            for (double forburk : dag){
                prisDag += (forburk * 0.5);
                price += (forburk * 0.5);
            }
            System.out.printf("Dag prisen er %.2f kroner %n", prisDag);
        }

        System.out.printf("Norgespris i denne måneden er %.2f kroner %n", price);


        return price;
    }
}
