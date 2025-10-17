package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        //Oppgave a
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0.0;

    }

    public void computeAmount() {
        //Oppgave b

        double amount = 0.0;
        double sum = 0.0;


        switch (c.getAgreement()){
            case SPOTPRICE:
                sum = MonthlyPower.computeSpotPrice(usage,prices);
                break;

            case NORGESPRICE:
                double NORGESPRICE = 0.5;
                sum = MonthlyPower.computeNorgesPrice(usage);

                break;

            case POWERSUPPORT:
               sum = MonthlyPower.computePowerSupport(usage,prices);

               break;

            default:
                sum = 0.0;
        }
        this.amount = sum;

    }

    public double getAmount() {
        return amount;
    }

    public void printInvoice() {
        System.out.println("==================");
        System.out.println("Customer number: " + c.getCustomer_id());
        System.out.println("Email:           " + c.getEmail());
        System.out.println("Agreement:       " + c.getAgreement());
        System.out.println();

        System.out.println("Month:           " + month);
        double totkwh = MonthlyPower.computePowerUsage(usage);
        System.out.printf("Usage:           %.2f kWh%n", totkwh);

        System.out.printf("Amount:          %.2f NOK%n", amount);
        System.out.println("====================");



        // TODO

    }
}
