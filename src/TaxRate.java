public interface TaxRate {
	public void printTaxRate();
}

class TaxTenPercent implements TaxRate {
	public void printTaxRate() {
		System.out.println("TaxRate: 10%");
	}
}

class TaxTwentyPercent implements TaxRate {
	public void printTaxRate() {
		System.out.println("TaxRate: 20%");
	}
}

class TaxTwentySevenPointFivePercent implements TaxRate {
	public void printTaxRate() {
		System.out.println("TaxRate: 27,5%");
	}
}