package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int countryId;
	private String countryName;
	private String countryCapital;
	private String countryPM;
	private int countryStates;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	public String getCountryPM() {
		return countryPM;
	}
	public void setCountryPM(String countryPM) {
		this.countryPM = countryPM;
	}
	public int getCountryStates() {
		return countryStates;
	}
	public void setCountryStates(int countryStates) {
		this.countryStates = countryStates;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryCapital=" + countryCapital
				+ ", countryPM=" + countryPM + ", countryStates=" + countryStates + "]";
	}
	
	
	
}
