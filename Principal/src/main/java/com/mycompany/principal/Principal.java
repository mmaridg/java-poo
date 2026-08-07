package com.mycompany.principal;

public class Principal {
      
    public static void main(String[] args) {
        // Criando a conta 1 com 8000 reais
        Conta c1 = new Conta(222, 898, 8000.00);
        
        // Criando a conta 2 zerada
        Conta c2 = new Conta(333, 999, 0.0);
        
        System.out.println("Saldo inicial C1: " + c1.getSaldo());
        System.out.println("Saldo inicial C2: " + c2.getSaldo());
                
        // Operações na Conta 1
        c1.creditar(500.00); // Adiciona 500
        c1.debitar(100.00);  // Tira 100
        
        // Transferência : A conta c1 está transferindo 400 reais para a c2
        c1.transferir(400.00, c2); 
        
        System.out.println("-------------------------");
        System.out.println("Saldo final C1: " + c1.getSaldo());
        System.out.println("Saldo final C2: " + c2.getSaldo());
    }
}