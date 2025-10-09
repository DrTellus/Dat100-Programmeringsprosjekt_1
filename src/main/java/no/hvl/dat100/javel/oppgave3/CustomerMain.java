package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        //Tester å lage en customer
        Customer customer1 = new Customer("Hei","test",0,PowerAgreementType.POWERSUPPORT);
        customer1.skrivUt();

        //Tester get og set metoder
        System.out.println(customer1.getName());
        customer1.setName("TestNavn");
        System.out.println(customer1.getName());

        //Tester standard verdi
        Customer customer2 = new Customer();
        customer2.skrivUt();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
