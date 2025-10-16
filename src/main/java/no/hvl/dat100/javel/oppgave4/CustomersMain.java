package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer("Test1","Mail1",1,PowerAgreementType.NORGESPRICE);

        Customer customer2 = new Customer("Test2","mail2",2,PowerAgreementType.SPOTPRICE);

        Customer customer3 = new Customer();

        //Tester metoden for å sette size på customers
        Customers customers = new Customers(3);
        System.out.println(customers);

        //Tester countNonNull
        customers.addCustomer(customer1);
        System.out.println(customers.countNonNull());


        //Tester å sjekke om customer1 har blitt lagt til
//        Customer id_1 = customers.getCustomer(1);
//        id_1.skrivUt();

        //Tester om standard verdien blir lagt til
        customers.addCustomer(customer3);
//        customers.getCustomer(0).skrivUt();



        //Tester remove og får feilmelding på utskrft, så antar at customer3 har blitt removed.
        customers.removeCustomer(0);
//        customers.getCustomer(0).skrivUt();



        //Added customer2 etter at customer3 har blitt fjernet og lager en tabell med alle customers og skriver ut
        customers.addCustomer(customer2);

//        Customer[] allCustomers = customers.getCustomers();
//
//        for (int i = 0; i < allCustomers.length; i++) {
//            allCustomers[i].skrivUt();
//        }


        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */



    }
}
