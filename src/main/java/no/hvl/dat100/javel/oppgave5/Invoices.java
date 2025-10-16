package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        for (Invoice I: invoices){
            System.out.println("==============");
            I.printInvoice();
            System.out.println("==============");

        }

    }
}
