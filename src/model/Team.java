package model;

public class Team{
	
	private final static int MAX_PLAYERS = 25;
	private final static int MAX_HEAD_COACHES = 1;
	private final static int MAX_ASSISTANT_COACHES = 3;
	private final static int MAX_LINEUPS = 3;
	
	private String name;
	private Player[] playerList;
	private HeadCoach[] headCoachList;
	private AssistantCoach[] assistantCoachList;
	private Lineup[] lineupList;
	
	/**
	* Constructor method for the Team class. <br>
	* Pre: <br>
	* Post: Creates an instance of Team. <br>
	*/
	public Team(String name){
		
		this.name = name;
		playerList = new Player[MAX_PLAYERS];
		headCoachList = new HeadCoach[MAX_HEAD_COACHES];
		assistantCoachList = new AssistantCoach[MAX_ASSISTANT_COACHES];
		lineupList = new Lineup[MAX_LINEUPS];
		
	}
	
	/**
	* Returns the attribute name. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the attribute name. <br>
	* @return name
	*/
	public String getName(){
		return name;
	}
	
	/**
	* Changes the attribute name. <br>
	* Pre: Team has been initialized. <br>
	* Post: Changes the attribute name. <br>
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	* Returns the attribute playerList. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the attribute playerList. <br>
	* @return playerList
	*/
	public Player[] getPlayerList(){
		return playerList;
	}
	
	/**
	* Returns the attribute headCoachList. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the attribute headCoachList. <br>
	* @return headCoachList
	*/
	public HeadCoach[] getHeadCoachList(){
		return headCoachList;
	}
	
	/**
	* Returns the attribute assistantCoachList. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the attribute assistantCoachList. <br>
	* @return assistantCoachList
	*/
	public AssistantCoach[] getAssistantCoachList(){
		return assistantCoachList;
	}
	
	/**
	* Returns the attribute lineupList. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the attribute lineupList. <br>
	* @return lineupList
	*/
	public Lineup[] getLineupList(){
		return lineupList;
	}
	
	/**
	* It adds a player to the list of players. <br>
	* Pre: Team has been initialized. <br>
	* Post: It adds a player to the list of players. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addPlayer(Employee employee, int number){
		String msg = "Unsuccessful action.";
		boolean space = false;
		if(employee != null && employee instanceof Player){
			for (int i = 0; i < MAX_PLAYERS && !space; i++){
				if(playerList[i] != null){
					if(playerList[i].getIdentifier() == employee.getIdentifier()){
						space = true;
					}
				}
			}
			for (int i = 0; i < MAX_PLAYERS && !space; i++){
				if(playerList[i] == null){
					playerList[i] = (Player)employee;
					playerList[i].setNumber(number);
					space = true;
					msg = "Action done successfully.";
				}
			}
		}
		return msg;
	}
	
	/**
	* It adds a coach to the list of head coaches or assistant coaches. <br>
	* Pre: Team has been initialized. <br>
	* Post: It adds a coach to the list of head coaches or assistant coaches. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addCoach(Employee employee){
		String msg = "Unsuccessful action.";
		boolean space = false;
		if(employee != null && employee instanceof HeadCoach){
			for (int i = 0; i < MAX_HEAD_COACHES && !space; i++){
				if(headCoachList[i] != null){
					if(headCoachList[i].getIdentifier() == employee.getIdentifier()){
						space = true;
					}
				}
			}
			for (int i = 0; i < MAX_HEAD_COACHES && !space; i++){
				if(headCoachList[i] == null){
					headCoachList[i] = (HeadCoach)employee;
					space = true;
					msg = "Action done successfully.";
				}
			}
		}else if(employee != null && employee instanceof AssistantCoach){
			for (int i = 0; i < MAX_ASSISTANT_COACHES && !space; i++){
				if(assistantCoachList[i] != null){
					if(assistantCoachList[i].getIdentifier() == employee.getIdentifier()){
						space = true;
					}
				}
			}
			for (int i = 0; i < MAX_ASSISTANT_COACHES && !space; i++){
				if(assistantCoachList[i] == null){
					assistantCoachList[i] = (AssistantCoach)employee;
					space = true;
					msg = "Action done successfully.";
				}
			}
		}
		return msg;
	}
	
	/**
	* It removes an employee from the players, head coaches or assistant coaches list. <br>
	* Pre: Team has been initialized. <br>
	* Post: Removes an employee from the players, head coaches or assistant coaches list. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String removeEmployee(int identifier){
		String msg = "Unsuccessful action.";
		for (int i = 0; i < MAX_PLAYERS; i++){
			if(playerList[i] != null){
				if(playerList[i].getIdentifier() == identifier){
					playerList[i] = null;
					msg = "Action done successfully.";
				}
			}
		}
		for (int i = 0; i < MAX_HEAD_COACHES; i++){
			if(headCoachList[i] != null){
				if(headCoachList[i].getIdentifier() == identifier){
					headCoachList[i] = null;
					msg = "Action done successfully.";
				}
			}
		}
		for (int i = 0; i < MAX_ASSISTANT_COACHES; i++){
			if(assistantCoachList[i] != null){
				if(assistantCoachList[i].getIdentifier() == identifier){
					assistantCoachList[i] = null;
					msg = "Action done successfully.";
				}
			}
		}
		return msg;
	}
	
	/**
	* It adds a lineup to the list of lineups. <br>
	* Pre: Team has been initialized. <br>
	* Post: It adds a lineup to the list of lineups. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addLineup(int day, int month, int year, Tactics tactic, String lineup){
		String msg = "Unsuccessful action.";
		boolean space = false;
		for (int i = 0; i < MAX_LINEUPS && !space; i++){
			if(lineupList[i] == null){
				lineupList[i] = new Lineup(day, month, year, tactic, lineup);
				space = true;
				msg = "Action done successfully.";
			}
		}
		return msg;
	}
	
	/**
	* Returns the team's information. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the team's information. <br>
	* @return msg The team's information. It returns a String.
	*/
	public String showTeamInfo(){
		String msg = "Team's name: " + name;
		msg += "\nPlayers: ";
		for (int i = 0; i < MAX_PLAYERS; i++){
			if(playerList[i] != null){
				msg +=  "\n" + playerList[i].getName() + " - Number: " + playerList[i].getNumber() + " - Position: " + playerList[i].getPosition();
			}
		}
		msg += "\n\nHead coaches: ";
		for (int i = 0; i < MAX_HEAD_COACHES; i++){
			if(headCoachList[i] != null){
				msg += headCoachList[i].getName() + " ";
			}
		}
		msg += "\nAssistant coaches: ";
		for (int i = 0; i < MAX_ASSISTANT_COACHES; i++){
			if(assistantCoachList[i] != null){
				msg += assistantCoachList[i].getName() + " ";
			}
		}
		msg += "\n";
		return msg;
	}
	
	/**
	* Returns the lineup's information. <br>
	* Pre: Team has been initialized. <br>
	* Post: Returns the lineup's information. <br>
	* @return msg The lineup's information. It returns a String.
	*/
	public String showLineupInfo(){
		String msg = "\n";
		for (int i = 0; i < MAX_LINEUPS; i++){
			if(lineupList[i] != null){
				msg += "\nLineup " + (i+1) +":\n";
				msg += lineupList[i].showInfo() + "\n";
			}
		}
		return msg;
	}
	
}