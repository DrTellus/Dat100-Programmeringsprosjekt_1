package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

import java.awt.*;

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
        }
        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int i = 0;

        while(i < powerusage.length && usage < threshold) { //kapeittel 3 i boka om while-løkker
            for(int j = 0; j < powerusage[i].length; j++) {
                usage += powerusage[i][j];
                if (usage >= threshold) {

                    return true;
                }
            }
            i++;
        }

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



        return strompris;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;
        double stromPris = 0;
        double threshold = 0.9375;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                stromPris = prices[i][j];

                if (stromPris > threshold) {
                    support += (stromPris-threshold) * usage[i][j];
                }
            }
        }
        return support;
    }
    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0.5;
        double forbruk = 0.0;

        // TODO
        for (double[] uke:usage) {
            for (double time : uke){
                forbruk += time;
            }

        }
        double totpris = forbruk * price;
        return totpris;

    }
}
