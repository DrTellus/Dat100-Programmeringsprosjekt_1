package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //a)
//        MonthlyPower.print_PowerUsage(power_usage_month);

        //b)
//        MonthlyPower.print_PowerPrices(power_prices_month);

        //c)
//        MonthlyPower.computePowerUsage(power_usage_month);

        //d)
//        MonthlyPower.exceedThreshold(power_usage_month, 1000);

        //e)
//        MonthlyPower.computeSpotPrice(power_usage_month,power_prices_month);

        //f)
//        MonthlyPower.computePowerSupport(power_usage_month,power_prices_month);

        //g)
        MonthlyPower.computeNorgesPrice(power_usage_month);

        /*

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}