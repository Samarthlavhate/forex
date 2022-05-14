package com.niit.masterychallenge1;
import java.util.Scanner;

public class SmartTravelForex {
static final double JPY=0.67;
static final double USD=74.3;
static final double GBP=94.5;
static final double EUR=85.37;
static final double AED=20.25;

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {

double result=0;

//System.out.println("choice btao");
//System.out.println("maal kitna hai");
if(amount>0){
switch(choice){
case 1:
result=amount*JPY;
break;
case 2:
result=amount*EUR;
break;
case 3:
result=amount*GBP;
break;
case 4:
result=amount*USD;
break;
case 5:
result=amount*AED;
break;
	
	}

}
else {
	result=-1;
}

   return result;
    }
 /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
    

double money=0;
double source=0;
double target=0;
if(sourceCurrency==targetCurrency){
	money=-1;

}
else{
switch(sourceCurrency){
    case 1:
	source=JPY;
	break;
	case 2:
	source=EUR;
	break;
	case 3:
	source=GBP;
	break;
	case 4:
	source=USD;
	break;
	case 5:
	source=AED;
	break;
}
  
switch(targetCurrency){
    case 1:
	target=JPY;
	break;
	case 2:
	target=EUR;
	break;
	case 3:
	target=GBP;
	break;
	case 4:
	target=USD;
	break;
	case 5:
	target=AED;
	break;
}



money=amountToBeConverted*source/target;
}

return money;

	}
    


    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
	System.out.println("\t 1\t10 \t20\t50\t100");
    System.out.println("JPY\t0.67\t6.7\t13.4\t33.5\t67.0");
    System.out.println("EUR\t85.37\t853.7\t1707.4\t4268.5\t8537.0");
    System.out.println("GBP\t94.5\t945.0\t1890.0\t4725.0\t9450.0");
    System.out.println("USD\t74.3\t743.0\t1486.0\t3715.0\t7430.0");
    System.out.println("AED\t20.25\t202.5\t405.0\t1012.5\t2025.0");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source;
        int target;
        double amountToBeConverted ;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the sourc(e currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = sc.nextInt();
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target=sc.nextInt();
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted =sc.nextDouble();
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}

