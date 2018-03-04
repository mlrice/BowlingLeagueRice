package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="team")

public class Team {


	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Team(String teamName, String teamType, String preferredNight) {
		super();
		this.teamName = teamName;
		this.teamType = teamType;
		this.preferredNight = preferredNight;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teamId")
	public int teamId;
	@Column(name="teamName")
	public String teamName;
	@Column(name="teamType")
	public String teamType;
	@Column(name="preferredNight")
	public String preferredNight;
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamType() {
		return teamType;
	}
	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}
	public String getPreferredNight() {
		return preferredNight;
	}
	public void setPreferredNight(String preferredNight) {
		this.preferredNight = preferredNight;
	}
	
	
	
}
