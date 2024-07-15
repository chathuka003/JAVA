import java.util.*;
class bank{
    private double balance;
    public bank(double openingBalance)
    {
        balance = openingBalance;
    }

public void display()
{
System.out.println("Opening Balance : " + balance);
}

public void displayName(String accName)
{
System.out.println("Account Name : " +accName);
}

public void deposit(double amount)
{
    balance = balance + amount;
}

public void withdrawal(double amount2)
{
    balance = balance - amount2;
}

public void display1()
{
System.out.println("Current Balance : " + balance);
}

public void display2()
{
System.out.println("Current Balance : " + balance);
}


    public static void main(String[] args)
    {
        bank bal = new bank(100.00);

bal.displayName("chathuka");
bal.display();
bal.deposit(2000.00);
bal.display1();
bal.withdrawal(1000.00);
bal.display2();


bal.displayName("S");
bal.display();
bal.deposit(2000.00);
bal.display1();
bal.withdrawal(1000.00);
bal.display2();


    }
}