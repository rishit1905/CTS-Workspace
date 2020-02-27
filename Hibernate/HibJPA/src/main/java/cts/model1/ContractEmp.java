package cts.model1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("cemp")
//@Table(name="cemp")
//@Table(name="onlycemp")
public class ContractEmp extends Employee {

	@Column(name="duration")
	private int duration;

	public ContractEmp() {
		super();
	}

	public ContractEmp(long eid, String ename, double basic, int duration) {
		super(eid, ename, basic);
		this.duration=duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	

}
