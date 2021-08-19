package com.github.hiltonfarias.bancodigital;

public class Main {
    public static void main(String[] args) {
        Cliente hilton = new Cliente();
        hilton.setNome("Hilton");

        Conta contaCorrente = new ContaCorrente(hilton);
        Conta contaPoupanca = new ContaCorrente(hilton);
        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
