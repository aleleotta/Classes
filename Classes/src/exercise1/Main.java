package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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