package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor

    public Customers(int size) {
        customers = new Customer[size];



    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for (int i = 0; i< customers.length; i++){
             Customer c = customers[i];
             if (c!=null){
                 count++;
             }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        // TODO
        for (int i = 0; i < customers.length; i++) {
            Customer kunde = customers[i];//Henter kunden på plass i.

            if (kunde != null && kunde.getCustomer_id() == customer_id){
                return kunde;//hvis kunden ikke er null OG id er eksisterende, return kunde. Altså kunden finnes.
            }

        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        // TODO
        for (int i = 0; i < customers.length; i++){
            if (customers[i]==null) {// Det er ledig plass
                customers[i] = c;// Setter inn c på i plass
                return true;
            }
        }
        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        // TODO
        for (int i =0; i < customers.length; i++){
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                return  c;

            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] kunder = null;

        int antKunder = 0;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] !=null) {
                antKunder += antKunder;
            }
        }

        kunder = new Customer[antKunder];
        int posisjon = 0;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                kunder[posisjon] = customers[i];
                posisjon++;
            }
        }

        return kunder;
    }
}