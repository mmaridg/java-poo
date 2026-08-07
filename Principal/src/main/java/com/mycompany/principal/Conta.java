/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

public class Conta {
    private int agencia, numero;
    private double saldo;
    
    // Construtor vazio
    Conta() {
    }
  
    // Construtor completo
    Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    void creditar (double valor){
	saldo = saldo + valor;
}

    void debitar (double valor) {
            if(valor <= saldo){
                            saldo = saldo - valor;
                            return true;
                    }

            else {
                    System.out.println("Saldo Insuficiente");

            }
    }

    // A transferência fazemos 2 operções: debito da minha conta pra creditar em outra, porém para isso ocorrer, é preciso verificar primeiro se há saldo na conta, e se nÃO TIVER SALDO, a operação de crédito NÃO DEVE OCORRER.
    // Agora a transferência, usamos o método de débito já pronto.

    void transferir (double valor, Conta destino){
            if debitar(valor) {
                    destino.creditar(valor);

            }
            else {
                    sout ("Transferência negada");
            }
    }