package cebyrdfootball.model;

public class Team
{
	private String teamName;
	private double avgPPG;
	private int numberOfPlayers;
	private boolean winningRecord;
	
	public Team()
	{
		teamName = "";
		avgPPg = 0.0;
		numberOfPlayers = 0;
		winningRecord = false;
	}

	public Team(String teamName, double avgPPg, int numberOfPlayers,)
	{
		this.teamName = teamName;
		this.avgPPG = avgPPG;
		this.numberOfPlayers = numberOfPlayers;
		this.winningRecord = winningRecord;
	}
}	
	