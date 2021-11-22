package sedmi;

public class CustomerRegions {
	
	private String regionName;
	private int customerCount;
	private double avgSales;
	private double avgSpent;
	
	public CustomerRegions(String regionName, int customerCount, double avgSales, double avgSpent) {
		
		this.customerCount = customerCount;
		this.avgSales = avgSales;
		this.avgSpent = avgSpent;
		this.regionName = regionName;
	}

	public CustomerRegions() {
		
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public double getAvgSales() {
		return avgSales;
	}

	public void setAvgSales(double avgSales) {
		this.avgSales = avgSales;
	}

	public double getAvgSpent() {
		return avgSpent;
	}

	public void setAvgSpent(double avgSpent) {
		this.avgSpent = avgSpent;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "CustomerRegions [regionName=" + regionName + ", customerCount=" + customerCount + ", avgSales="
				+ avgSales + ", avgSpent=" + avgSpent + "]" + "\n";
	}

	
	
	

}
