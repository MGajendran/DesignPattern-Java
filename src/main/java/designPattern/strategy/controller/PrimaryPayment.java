package designPattern.strategy.controller;

import designPattern.strategy.payment.Payment;

public class PrimaryPayment {

    private Payment objPayment;

    public void setObjPayment(Payment objPayment) {
        this.objPayment = objPayment;
    }

    public void payment(){
        objPayment.pay();
    }
}