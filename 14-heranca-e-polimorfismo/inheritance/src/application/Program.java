package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bAcc = new BusinessAccount(1001, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "John", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        // acc5.loan(200.);  --> isso lancaria um erro pois a variável acc3 não é do tipo business account e não possui o metodo loan

        /* a condicao dos ifs abaixo sempre será mesma devido a forma como as variaveis foram definas
        * Entretando, em um caso onde acc3 é uma varial que pode vir de outro servico o método instanceof pode se usado
        * para verificar a que classe esta instancia pertence, e a partir disso executar a acao correta
        */

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.);
            System.out.println("Loan");
        }

        if(acc3 instanceof  SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
