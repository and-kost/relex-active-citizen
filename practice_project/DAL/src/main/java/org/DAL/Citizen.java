package org.DAL;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "citizenId", referencedColumnName = "id")
public class Citizen extends User {
	
	//private long citizenId;
	
	@Column(name = "firstName", unique = false, nullable = false, insertable = true, 
			updatable = true, length = 45)
	private String firstName;
	
	@Column(name = "lastName", unique = false, nullable = false, insertable = true, 
			updatable = true, length = 45)
	private String lastName;
	
	@Temporal(value = TemporalType.DATE)
	@Column(name = "registrationDate", unique = false, nullable = false, insertable = true, 
			updatable = true, length = 45)
	private Date registrationDate;
	
	@Column(name = "bonusPoint", unique = false, nullable = false, insertable = true, 
			updatable = true)
	private long bonusPoint;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "InerviewToCitizen", joinColumns = {@JoinColumn(name = "citizenId",
			referencedColumnName = "citizenId")}, inverseJoinColumns = {@JoinColumn(
					name = "inretviewId", referencedColumnName = "id")})
	private List<Interview> interviews = new ArrayList<Interview>();
	
	public List<Interview> getInterviews() {
		return interviews;
	}

	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}

	public Citizen() {}

	/*public long getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(long citizenId) {
		this.citizenId = citizenId;
	}*/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public long getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(long bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	

}