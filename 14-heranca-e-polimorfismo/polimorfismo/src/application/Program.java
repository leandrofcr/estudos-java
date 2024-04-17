package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1001, "Maria", 1000.0,0.01);

        /*Aqui temos um exemplo de polimorfimos, dois objetos diferentes com o mesmo tipos
        * Abaixo temos um exemplo de implementaćão em que estes objetos do mesmo tipo se comportam de forma diferente.
        * como o método de withdrawal em SavingsAccount foi sobrescrito (override) temos entao um comportamento difernte
        */

        x.withdrawal(50.0); // cobranca extra de 5 da taxa de saque
        y.withdrawal(50.0); // sem cobranca de taxa

        System.out.println(x.getBalance()); // -> 945.0
        System.out.println(y.getBalance()); // -> 950.0
    }

}
