package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        System.out.println("Escolher método: ");

        int option = scanner.nextInt();

        System.out.print("Informe o valor da transação: ");
        double amount = scanner.nextDouble();

        try{
            PaymentStrategy strategy = PaymentFactory.getPaymentMethod(option);
            PaymentProcessor processor = new PaymentProcessor(strategy);
            processor.processPayment(amount);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}