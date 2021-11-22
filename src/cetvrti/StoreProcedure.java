package cetvrti;

public class StoreProcedure {

	private int totalOrders;
	private double avgQuiantity;
	private double earnings;
	
	public StoreProcedure(int totalOrders, double avgQuiantity, double earnings) {
		super();
		this.totalOrders = totalOrders;
		this.avgQuiantity = avgQuiantity;
		this.earnings = earnings;
	}

	public StoreProcedure() {
		super();
	}

	public int getTotalOrders() {
		return totalOrders;
	}

	public void setTotalOrders(int totalOrders) {
		this.totalOrders = totalOrders;
	}

	public double getAvgQuiantity() {
		return avgQuiantity;
	}

	public void setAvgQuiantity(double avgQuiantity) {
		this.avgQuiantity = avgQuiantity;
	}

	public double getEarnings() {
		return earnings;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "StoreProcedure [totalOrders=" + totalOrders + ", avgQuiantity=" + avgQuiantity + ", earnings="
				+ earnings + "]";
	}
	
	
}
