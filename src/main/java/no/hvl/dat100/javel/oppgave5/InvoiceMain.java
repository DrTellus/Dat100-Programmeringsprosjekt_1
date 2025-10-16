package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {
        
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month_customer1 = CustomerPowerUsageData.usage_month_customer1;

        double[][] power_usage_month_customer2 = CustomerPowerUsageData.usage_month_customer2;

        double[][] power_usage_month_customer3 = CustomerPowerUsageData.usage_month_customer3;



        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("test", "TestMail", 0, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("test2","mail2",1,PowerAgreementType.SPOTPRICE);
        Customer customer3 = new Customer("Test3","mail3",2,PowerAgreementType.POWERSUPPORT);


        Invoice invoice1 = new Invoice(customer1, "Januar", power_usage_month_customer1, power_prices_month);
        Invoice invoice2 = new Invoice(customer2,"januar", power_usage_month_customer2,power_prices_month);
        Invoice invoice3 = new Invoice(customer3,"januar", power_usage_month_customer3,power_prices_month);

//        invoice1.computeAmount();
//        invoice2.computeAmount();
//        invoice3.computeAmount();

//        invoice3.printInvoice();

        Invoice[] invoiceArray = new Invoice[3];
        invoiceArray[0] = invoice1;
        invoiceArray[1] = invoice2;
        invoiceArray[2] = invoice3;

        Invoices.processInvoices(invoiceArray);



        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */

    }
}
