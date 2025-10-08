package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(int i = 0; i < usage.length; i++) {
            System.out.print("Dag " + (i+1) + " har forbruk: ");
            for(int j = 0; j < usage[i].length; j++) {
                double pris = usage[i][j];

                System.out.print(pris + " kWh ");


            }System.out.println();

        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for(int i = 0; i < prices.length; i++) {
            System.out.print("Dag " + (i+1) + " har pris: ");
            for(int j = 0; j < prices[i].length; j++) {
                double pris = prices[i][j];

                System.out.print(pris + " NOK ");


            }System.out.println();

        }





    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        for (int i = 0; i< usage.length; i++) {
            for (int j = 0; j< usage[i].length; j++) {
                sum += usage[i][j];
            }
        }System.out.printf("Totalforbruk på en måned er %.2f %n" , sum);



        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;

        while(i < powerusage.length && usage < threshold) {
            for(int j = 0; j < powerusage[i].length; j++) {
                usage += powerusage[i][j];
                if (usage >= threshold) {
                    System.out.println("Terskel på " + threshold + " kWh er overskredet.");
                    return true;
                }
            }
            i++;
        }
        System.out.println("Terskel på " + threshold + " kWh er ikke overskredet.");
        return false;


    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {
        double strompris = 0;
        for (int i = 0; i<usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                strompris += usage[i][j]*prices[i][j];//kWh*kr/kwh=kostnad
            }
        }


        System.out.printf("strømprisen er %.2f kr %n" , strompris);
        return strompris;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // TODO

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        // TODO

        return price;
    }
}
