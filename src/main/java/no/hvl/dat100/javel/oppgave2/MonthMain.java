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

        //Oppg a
        MonthlyPower.print_PowerUsage(power_usage_month);

        //Oppg b
        MonthlyPower.print_PowerPrices(power_prices_month);

        //Oppg c
        double totalForbruk = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("Totalforbruk på en måned er %.2f %n" , totalForbruk);

        //Oppg d
        boolean over1000 = MonthlyPower.exceedThreshold(power_prices_month, 1000);
        System.out.println(over1000 ? "Terskel på 1000 kWh er overskredet." : "Terskel på 1000 kWh er ikke overskredet");
        boolean over5000 = MonthlyPower.exceedThreshold(power_prices_month, 5000);
        System.out.println(over5000 ? "Terskel på 5000 kWh er overskredet." : "Terskel på 5000 kWh er ikke overskredet");

        //Oppg e
        double spotSum = MonthlyPower.computeSpotPrice(power_usage_month,power_prices_month);
        System.out.printf("strømprisen er %.2f kr %n" , spotSum);

        //Oppg f
        double support = MonthlyPower.computePowerSupport(power_usage_month,power_prices_month);
        System.out.printf("Supporten er på %.2f kr%n", support);

        //Oppg g
        double norgesPrisSum = MonthlyPower.computeNorgesPrice((power_usage_month));
        System.out.printf("Prisen med norgespris er %.2f kr%n", norgesPrisSum);



         /*Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}