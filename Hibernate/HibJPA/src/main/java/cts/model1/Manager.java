package cts.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("memp")
//@Table(name="memp")
//@Table(name="onlymemp")
public class Manager extends Employee {

	@Column(name="allowance")
	private double allowance;
	
	public Manager() {
	}

	public Manager(long eid, String ename, double basic, double allowance) {
		super(eid, ename, basic);
		this.allowance=allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	

}
