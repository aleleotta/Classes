package exercise1;
import java.util.*;

public class BankAccount {
	
	final String DNI; //Declaration of all global attributes within class. This attributes will later be constructed within constructors.
	String name;
	double balance;
	
	public BankAccount(String DNI, double balance){ //First object constructed without name attribute.
		this.DNI = DNI;
		this.balance = balance;
	}
	
	public BankAccount(String DNI, String name, double balance){ //Second object constructed with name attribute.
		this.DNI = DNI;
		this.name = name;
		this.balance = balance;
	}
	
	public void depositMoney(double balance) { //This method will check if the account balance is positive and if true it will add a certain amount that the user introduces.
		double addBalance;
		Scanner sc = new Scanner(System.in);
		if(balance > 0) {
			System.out.print("Introduce the amount of money you want to deposit into your account balance: ");
			addBalance = sc.nextDouble();
			balance = balance + addBalance;
		}
	}
	
	public void withdrawMoney(double balance) { //This method will check if the account balance is positive and if true it will subtract a certain amount that the user introduces.
		double subtractBalance;
		Scanner sc = new Scanner(System.in);
		if(balance > 0) {
			System.out.print("Introduce the amount of money you want to withdraw from your account balance: ");
			subtractBalance = sc.nextDouble();
			balance = balance - subtractBalance;
		}
	}
	
	public void printInformation(String DNI, double balance) { //Prints all account information without name.
		System.out.println("DNI: " + DNI + "\nBalance: " + balance);
	}
	
	public void printInformation(String DNI, String name, double balance) { //Prints all account information.
		System.out.println("DNI: " + DNI + "\nName: " + name + "\nBalance: " + balance);
	}
}

/*
Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre y el saldo. 
Añade los siguientes constructores:
	Con el DNI del titular de la cuenta y un saldo inicial.
	Con el DNI, nombre y el saldo inicial.
Las operaciones típicas de una cuenta corriente son:
	Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación,
	si existe saldo suficiente. Si es posible llevar a cabo la operación se resta la cantidad a sacar al saldo de la cuenta.
	Ingresar dinero: se incrementa el saldo.
	Mostrar información: muestra la información disponible de la cuenta corriente.
 */