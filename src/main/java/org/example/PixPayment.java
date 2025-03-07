package org.example;
import java.util.Random;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        String pixCode = generatePixCode();
        System.out.println("Código do pix: ");
        System.out.println(pixCode);
        System.out.println("Valor pago: ");
        System.out.println("R$" + amount);
    }

    private String generatePixCode() {
        Random random = new Random();
        return "PIX " + random.nextInt(100000);
    }
}
