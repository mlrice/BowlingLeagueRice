
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")

public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "playerId")
	private int playerId;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	@Column(name = "screenName")
	private String screenName;
	@Column(name = "teamId")
	private int teamId;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String firstName, String lastName, String phoneNumber, String screenName, int teamId) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
		this.teamId = teamId;
	}

	public Player(String firstName, String lastName, String phoneNumber, String screenName, int teamId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
		this.teamId = teamId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", screenName=" + screenName + ", teamId=" + teamId + "]";
	}
	
	

}
