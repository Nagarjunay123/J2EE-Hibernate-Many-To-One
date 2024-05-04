package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	private String stateName;
	private String stateCapital;
	private String stateCM;
	private int stateDisticts;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Country country;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCapital() {
		return stateCapital;
	}

	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}

	public String getStateCM() {
		return stateCM;
	}

	public void setStateCM(String stateCM) {
		this.stateCM = stateCM;
	}

	public int getStateDisticts() {
		return stateDisticts;
	}

	public void setStateDisticts(int stateDisticts) {
		this.stateDisticts = stateDisticts;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", stateCapital=" + stateCapital
				+ ", stateCM=" + stateCM + ", stateDisticts=" + stateDisticts + ", country=" + country + "]";
	}
	
	
}
