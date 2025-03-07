package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        String codBoleto = codigoBoletoAleatorio();
        System.out.println("Código do boleto: ");
        System.out.println(codBoleto);
        System.out.println("Valor pago: ");
        System.out.println("R$" + amount);
    }

    private String codigoBoletoAleatorio(){
        Random random = new Random();
        return "" + random.nextInt(100000);
    }
}