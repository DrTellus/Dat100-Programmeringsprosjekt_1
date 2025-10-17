package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        //oppg a
        Customers liste = new Customers(5);
        System.out.println(liste.countNonNull());


        //Satt inn alle kundene
        Customers liste2 = new Customers(5);
        Customer c1 = new Customer("Alice Smith", "alice@example.com",1001,PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson", "bob@example.com",1002,PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose", "charlie@example.com",1003,PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince", "diana@example.com",1004,PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt", "ethan@example.com",1005,PowerAgreementType.POWERSUPPORT);

        boolean ok = liste2.addCustomer(c1);
        System.out.println(ok ? "Kunde lagt til." : "Ingen ledig plass.");
        /*ternary operator ? gir en type forloop. Om boolean er true, printer
        den venstre side av kolon. Om false printer den høyre.
         */






    }
}
