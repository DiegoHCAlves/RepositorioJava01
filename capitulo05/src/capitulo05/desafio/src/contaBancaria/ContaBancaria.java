/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaBancaria;
// depositar, sacar, verificarsaldo
/**
 *
 * @author diego
 */
public class ContaBancaria {

    private int numeroConta;
    private double saldoConta;

    public ContaBancaria(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double saldoConta() {
        return saldoConta;
    }

    public void depositar(double saldoConta) {
        this.saldoConta = this.saldoConta() + saldoConta ;
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldoConta){
            System.out.println("Saque de " + valor + " R$ realizado com sucesso");
            saldoConta = saldoConta - valor;
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

}
