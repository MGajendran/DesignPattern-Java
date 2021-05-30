package designPattern.strategy.controller;

import designPattern.strategy.payment.CreditCard;
import designPattern.strategy.payment.Payment;

public class Main extends PrimaryPayment { //shopping cart example

    /* The case study :

        As the service provider once the customer has added all the things to cart
        & when he tries to check out we need provide multiple payment service

     */
    public static void billAmt (int amount){
        System.out.println( "The total bill amount is " + amount + "$.");
    }

    public static void pay( Payment paymentType) {
        PrimaryPayment objPrimary = new PrimaryPayment();
        objPrimary.setObjPayment(paymentType);
        objPrimary.payment();
    }
    public static void main(String[] args) {
        billAmt(5);
        pay(new CreditCard());
        // the below one is the second way of payment
//        pay(new UPI());
    }

}

