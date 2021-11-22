package peti;

import java.util.Arrays;
import java.util.Date;

public class SalesFromTerritory {
	
	private double maxSales;
	private int salesPersonId;
	private int territoryId;
	private double salesQuota;;
	private double bonus;
	private double commissionPct;
	private double salesLastYear;
	private byte[] rowguid;
	private Date modifiedDate;
	
	public SalesFromTerritory(double maxSales, int salesPersonId, int territoryId, double salesQuota, double bonus,
			double commissionPct, double salesLastYear, byte[] rowguid, Date modifiedDate) {
		super();
		this.maxSales = maxSales;
		this.salesPersonId = salesPersonId;
		this.territoryId = territoryId;
		this.salesQuota = salesQuota;
		this.bonus = bonus;
		this.commissionPct = commissionPct;
		this.salesLastYear = salesLastYear;
		this.rowguid = rowguid;
		this.modifiedDate = modifiedDate;
	}

	public SalesFromTerritory() {
		super();
	}
	
	public double getMaxSales() {
		return maxSales;
	}

	public void setMaxSales(double maxSales) {
		this.maxSales = maxSales;
	}

	public int getSalesPersonId() {
		return salesPersonId;
	}

	public void setSalesPersonId(int salesPersonId) {
		this.salesPersonId = salesPersonId;
	}

	public int getTerritoryId() {
		return territoryId;
	}

	public void setTerritoryId(int territoryId) {
		this.territoryId = territoryId;
	}

	public double getSalesQuota() {
		return salesQuota;
	}

	public void setSalesQuota(double salesQuota) {
		this.salesQuota = salesQuota;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public double getSalesLastYear() {
		return salesLastYear;
	}

	public void setSalesLastYear(double salesLastYear) {
		this.salesLastYear = salesLastYear;
	}

	public byte[] getRowguid() {
		return rowguid;
	}

	public void setRowguid(byte[] rowguid) {
		this.rowguid = rowguid;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "SalesFromTerritory [maxSales=" + maxSales + ", salesPersonId=" + salesPersonId + ", territoryId="
				+ territoryId + ", salesQuota=" + salesQuota + "\n" + ", bonus=" + bonus + ", commissionPct=" + commissionPct
				+ ", salesLastYear=" + salesLastYear + ", rowguid=" + Arrays.toString(rowguid) + ", modifiedDate="
				+ modifiedDate + "]";
	}
	
	

}
