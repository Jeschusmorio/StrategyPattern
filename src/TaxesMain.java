public class TaxesMain {

	public static void main(String[] args) {
		RentACar bmw = new RentACar();
		Book myBiography = new Book();
		Interest bank = new Interest();
		
		bmw.printTaxRate();						//20%
		myBiography.printTaxRate();				//10%
		bank.printTaxRate();					//27,5%
		
		bmw.setTaxRate(new TaxTenPercent());
		bmw.printTaxRate();						//10%
	}

}
