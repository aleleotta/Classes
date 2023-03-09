package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
}

/*Crea un programa con una clase llamada Articulo con los siguientes atributos:
nombre, precio (sin IVA), iva (siempre será 21) y cuantosQuedan (representa cuántos quedan en el almacén).
Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y cuantosQuedan.
Dicho constructor deberá mostrar un mensaje de error si alguno de los valores nombre, precio, iva o cuantosQuedan no son válidos.
Añade también los siguientes métodos:
	Método para imprimir la información del artículo por pantalla.
	Método getPVP que devuelva el precio de venta al público (PVP) con iva incluido. 
	Método getPVPDescuento que devuelva el PVP con un descuento pasado como argumento. 
	Método vender que actualiza los atributos del objeto tras vender una cantidad ‘x’ (si es posible).
	Devolverá true si ha sido posible (false en caso contrario). 
	Método almacenar que actualiza los atributos del objeto tras almacenar una cantidad ‘x’.
*/