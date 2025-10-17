package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave5.Invoice;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        /*//Tester oppg b
        Customer kunde1 = new Customer("Alice Smith", "alice@example.com", 1001, PowerAgreementType.SPOTPRICE);

        double [][] usage = CustomerPowerUsageData.usage_month_customer1;
        double [][] prices = MonthPowerData.powerprices_month;

        Invoice faktura1 =  new Invoice(kunde1,"Januar", usage,prices);
        faktura1.computeAmount();
        System.out.printf("%.2f kr%n", faktura1.getAmount());
        */





        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */
        Customer kunde1 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);

        double [][] usage = CustomerPowerUsageData.usage_month_customer1;
        double [][] prices = MonthPowerData.powerprices_month;

        Invoice faktura1 =  new Invoice(kunde1,"Januar", usage,prices);
        faktura1.computeAmount();
        faktura1.printInvoice();


        Invoice[] fakturaer = new Invoice[3];

        Invoices.processInvoices(fakturaer);

    }
}
