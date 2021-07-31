package entities;

public class Terceirizados extends Employee {
	
	private Double additional;
	
	public Terceirizados() {
		super();
	}
	
	public Terceirizados(String name, Integer hours, Double valuePerHour, Double additional) {
		super(name, hours, valuePerHour);
		this.additional = additional;
	}


	public Double getAdditional() {
		return additional;
	}

	public void setAdditional(Double additional) {
		this.additional = additional;
	}

	@Override
	public double payment() {
//		return hours * valuePerHour + additional * 1.1;
		return super.payment() + additional * 1.1;
	}
}
