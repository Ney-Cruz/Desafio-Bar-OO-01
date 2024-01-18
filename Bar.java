package package06_OrientacaoObjeto1.challenge.bar;

import java.util.Locale;
import java.util.Scanner;

import package06_OrientacaoObjeto1.challenge.bar.entities.Bill;

public class Bar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Sexo: ");
		char gender = scan.next().charAt(0);
		
		while (gender != 'm' && gender != 'M' && gender != 'f' && gender != 'F') {
			System.out.print("Digite M ou F para definir o gênero: ");
			gender = scan.next().charAt(0);
		}
		
		System.out.print("Qantidade de cervejas: ");
		int beer = scan.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		int softDrink = scan.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		int barbecue = scan.nextInt();

		Bill bill = new Bill(gender, beer, barbecue, softDrink);
		
		System.out.println(bill.toString());
		
		scan.close();

	}

}
