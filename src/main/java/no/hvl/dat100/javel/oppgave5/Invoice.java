package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthMain;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {
    

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;
    }

    public void computeAmount() {
        if (c.getAgreement() == PowerAgreementType.NORGESPRICE) {
//            for(double[] dag : usage) {
//                for (double forbruk : dag){
//                    amount += (forbruk * NORGESPRIS_KWH);
//                }
            amount = MonthlyPower.computeNorgesPrice(usage);
        } else if (c.getAgreement() == PowerAgreementType.SPOTPRICE){
//                for (int i = 0; i < usage.length; i++) {
//                    for (int j = 0; j < usage[i].length; j++) {
//                        amount += (usage[i][j] * prices[i][j]);
            amount = MonthlyPower.computeSpotPrice(usage,prices);
        } else if (c.getAgreement() == PowerAgreementType.POWERSUPPORT) {
            amount = MonthlyPower.computePowerSupport(usage,prices);
        }
    }

    public void printInvoice() {
        c.skrivUt();
        System.out.println();
        System.out.println("Month: " + month);
        MonthlyPower.computePowerUsage(usage);
        computeAmount();
    }
}
