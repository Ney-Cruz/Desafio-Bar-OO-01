package package06_OrientacaoObjeto1.challenge.bar.entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public Bill() {

	}
	
	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer; // 7
		this.barbecue = barbecue; // 2
		this.softDrink = softDrink; // 1
	}
	
	
	public double couvert() {
		if (feeding() > 30.00) {
			return 0.00;
		} else {
			return 4.00;
		}
	}
	
	public double feeding() {
		return (beer * 5.00) + (barbecue * 7.00) + (softDrink * 3.00);
	}

	public double ticket() {
		if (gender == 'm' || gender == 'M') {
			return 10.00;
		} else {
			return 8.00;
		}
	}

	public double total() {
		return feeding() + couvert() + ticket();
	}
	
	public String toString() {

				if (couvert()  == 4.00) {
			return String.format("%nRELATORIO:%n"
					+ "Consumo = R$ %.2f%n"
					+ "Couvert = R$ %.2f%n"
					+ "Ingresso = R$ %.2f%n%n"
					+ "Valor à pagar = R$ %.2f%n", feeding(), couvert(), ticket() , total());
		} else {
			return String.format("%nRELATORIO:%n"
					+ "Consumo = R$ %.2f%n"
					+ "Isento de Couvert%n"
					+ "Ingresso = R$ %.2f%n%n"
					+ "Valor à pagar = R$ %.2f%n", feeding(), ticket(), total());
		}
		
	}

}
	

