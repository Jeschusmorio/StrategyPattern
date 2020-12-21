
public abstract class Product {
	private TaxRate taxRate = new TaxTwentyPercent();
	
	public void setTaxRate(TaxRate taxRate) {
		this.taxRate = taxRate;
	}
	public void printTaxRate() {
		taxRate.printTaxRate();
	}
}