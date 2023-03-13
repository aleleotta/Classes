package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String DNI;
		String name;
		double balance;
		char option;
		int option1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to introduce your name alongside your DNI and your balance?\nY(Yes) or N(No): ");
		option = sc.next().charAt(0);
		while(option != 'Y' || option != 'N') {
			switch(option) {
			case 'Y': //Procedure with name.
				System.out.print("Introduce your DNI: ");
				DNI = sc.next();
				System.out.print("Introduce your name: ");
				name = sc.next();
				System.out.print("Introduce your balance: ");
				balance = sc.nextDouble();
				BankAccount nameIncluded = new BankAccount(DNI, name, balance);
				break;
			case 'N': //Procedure without name.
				System.out.print("Introduce your DNI: ");
				DNI = sc.next();
				System.out.print("Introduce your balance: ");
				balance = sc.nextDouble();
				BankAccount nameExcluded = new BankAccount(DNI, balance);
				break;
			default: //Error message
				System.out.println("Please introduce Y(Yes) or N(No).");
				break;
			}
			char update = 'Y';
			System.out.print("Do you want to update anything in your bank account information? ");
			update = sc.next().charAt(0);
			if(update == 'N') {
				break;
			} else {
				System.out.println("Y: Include name.\nN: Exclude name.");
				option = sc.next().charAt(0);
			}
		}
		while(option1 == 1 || option1 == 2 || option1 == 3) {
			System.out.println("1) Deposit money.\n2) Withdraw money.\n3) Print information");
			option1 = sc.nextInt();
			switch(option1) {
			case 1: //Deposit
				break;
			case 2: //Withdraw
				break;
			case 3: //Print
				break;
			default: //Error message
				System.out.println("Please introduce a valid option.");
				break;
			}
		}
		sc.close();
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