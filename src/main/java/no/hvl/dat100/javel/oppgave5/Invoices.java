package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {
        Customer kunde1 = new Customer("Ethan Hunt", "ethan@example.com", 1005, PowerAgreementType.SPOTPRICE);
        Customer kunde2 = new Customer("Charlie Rose", "charlie@example.com",1003,PowerAgreementType.POWERSUPPORT);
        Customer kunde3 = new Customer("Diana Prince", "Diana@example.com",1004,PowerAgreementType.NORGESPRICE);


        double [][] usage = CustomerPowerUsageData.usage_month_customer1;
        double [][] prices = MonthPowerData.powerprices_month;

        Invoice faktura1 =  new Invoice(kunde2,"Januar", usage,prices);//Bare snur rekkefølgen på kundene istedet for å skrive om.
        Invoice faktura2 = new Invoice(kunde3, "Januar", usage,prices);
        Invoice faktura3 = new Invoice(kunde1,"Januar", usage, prices);

        faktura1.computeAmount();
        faktura2.computeAmount();
        faktura3.computeAmount();

        faktura1.printInvoice();
        faktura2.printInvoice();
        faktura3.printInvoice();

        // TODO

    }
}
