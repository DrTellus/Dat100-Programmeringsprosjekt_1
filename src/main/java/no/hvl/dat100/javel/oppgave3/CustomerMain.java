package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO
         Write code that creates a Customer object and teste the methods implemented in the class
        */
        Customer kunde1 = new Customer("Adam", "adam@epost.no",243, PowerAgreementType.NORGESPRICE);
        System.out.println(kunde1);

        Customer kunde2 = new Customer("Kain", "kain@epost.no", 66, PowerAgreementType.SPOTPRICE);
        System.out.println(kunde2);

        Customer kunde3 = new Customer("Abel", "abel@epost.no", 02, PowerAgreementType.POWERSUPPORT);
        System.out.println(kunde3);
    }
}
