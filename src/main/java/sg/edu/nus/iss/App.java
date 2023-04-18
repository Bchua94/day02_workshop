package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

       BankAccount bryBankAccount = new BankAccount("brybry","001-000-1111",10000);
       System.out.println(bryBankAccount.toString());

       bryBankAccount.deposit(10000);
       System.out.println(bryBankAccount.toString());

       bryBankAccount.withdraw(99);
       System.out.println(bryBankAccount.toString());

    }
}
