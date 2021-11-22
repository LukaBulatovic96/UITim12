package trinaesti;

public class Department {
	
	private int id;
	private int married;
	private int total;
	private int women;
	private int ukupnaStarost;
	private int ukupnoZaposlenje;
	
	public Department(int id) {
		
		this.id=id;
		this.married=0;
		this.total=0;
		this.ukupnaStarost=0;
		this.ukupnoZaposlenje=0;
		this.women=0;
		
		
	}
	
	public void incrementStarost(int godine) {
		this.ukupnaStarost+= godine;
	}
	
	public void incrementUkupnoZaposlenje(int godine) {
		this.ukupnoZaposlenje+= godine;
	}
	public double procenatUBraku() {
		return ((double)married/(double)total)*100;
	}
	
	public double prosecnoZaposlenje() {
		return ((double)ukupnoZaposlenje/(double)total);
	}
	
	
	public double womenPercentage() {
		return ((double)women/(double)total)*100;
	}
	
	public double starostProcenat() {
		return ((double)ukupnaStarost/(double)total);
	}
	
	public void incrementWomen() {
		this.women+=1;
	}
	
	public void incrementMarried() {
		this.married+=1;
		this.total+=1;
	}
	
	public void incrementTotal() {
		this.total+=1;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarried() {
		return married;
	}

	public void setMarried(int married) {
		this.married = married;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Department [id=" + id  + ", procenat u braku: "+procenatUBraku()+"%"+", zene%: "
	+womenPercentage()+"%"+", prosecna starost: "+starostProcenat()+", prosecno Zaposlenje: "+prosecnoZaposlenje()+" ]";
	}

	

}
