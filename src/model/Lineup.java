package model;

public class Lineup{
	
	private final static int FIELD_WIDTH = 7;
	private final static int FIELD_LENGTH = 10;
	
	private Date date;
	private Tactics tactic;
	private int[][] formation;
	private String lineup;
	
	/**
	* Constructor method for the Lineup class. <br>
	* Pre: <br>
	* Post: Creates an instance of Lineup. <br>
	*/
	public Lineup(int day, int month, int year, Tactics tactic, String lineup){
		
		date = new Date(day, month, year);
		this.tactic = tactic;
		formation = new int[FIELD_LENGTH][FIELD_WIDTH];
		setLineup(lineup);
		
	}
	
	/**
	* Returns the attribute date. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns the attribute date. <br>
	* @return date
	*/
	public Date getDate(){
		return date;
	}
	
	/**
	* Returns the attribute tactic. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns the attribute tactic. <br>
	* @return tactic
	*/
	public Tactics getTactic(){
		return tactic;
	}
	
	/**
	* Changes the attribute tactic. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Changes the attribute tactic. <br>
	*/
	public void setTactic(Tactics tactic){
		this.tactic = tactic;
	}
	
	/**
	* Returns the attribute formation. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns the attribute formation. <br>
	* @return formation
	*/
	public int[][] getFormation(){
		return formation;
	}
	
	/**
	* Returns the attribute lineup. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns the attribute lineup. <br>
	* @return lineup
	*/
	public String getLineup(){
		return lineup;
	}
	
	/**
	* Places the players in the respective rows and columns. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Places the players in the respective rows and columns. It depends on the attribute j, which is the amount of players placed in that row. <br>
	*/
	public void setLines(String[] values, int i, int j){
			switch(values[j]){
				case "1":
				formation[i][3] = 1;
				break;
				case "2":
				formation[i][1] = 1;
				formation[i][5] = 1;
				break;
				case "3":
				formation[i][1] = 1;
				formation[i][3] = 1;
				formation[i][5] = 1;
				break;
				case "4":
				formation[i][1] = 1;
				formation[i][2] = 1;
				formation[i][4] = 1;
				formation[i][5] = 1;
				break;
				case "5":
				formation[i][1] = 1;
				formation[i][2] = 1;
				formation[i][3] = 1;
				formation[i][4] = 1;
				formation[i][5] = 1;
				break;
				case "6":
				formation[i][0] = 1;
				formation[i][1] = 1;
				formation[i][2] = 1;
				formation[i][4] = 1;
				formation[i][5] = 1;
				formation[i][6] = 1;
				break;
				case "7":
				formation[i][0] = 1;
				formation[i][1] = 1;
				formation[i][2] = 1;
				formation[i][3] = 1;
				formation[i][4] = 1;
				formation[i][5] = 1;
				formation[i][6] = 1;
				break;
			}
	}
	
	/**
	* Selects which rows are going to be used to place the players. It is based on the lineup attribute. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Selects which rows are going to be used to place the players based on lineup, which is a String. <br>
	*/
	public void setLineup(String lineup){
		this.lineup = lineup;
		for(int i = 0; i < FIELD_WIDTH; i++){
			for(int j = 0; j < FIELD_LENGTH; j++){
				formation[j][i] = 0;
			}
		}
		String[] values = lineup.split("-");
		int j = 0;
		switch(values.length){
			case 2:
			for(int i = 2; i < FIELD_LENGTH; i += 5){
				setLines(values, i, j);
				j++;
			}
			break;
			case 3:
			for(int i = 1; i < FIELD_LENGTH; i += 3){
				setLines(values, i, j);
				j++;
			}
			break;
			case 4:
			for(int i = 1; i < FIELD_LENGTH-2; i += 2){
				setLines(values, i, j);
				j++;
			}
			break;
			case 5:
			for(int i = 1; i < FIELD_LENGTH; i += 2){
				setLines(values, i, j);
				j++;
			}
			break;
			case 6:
			for(int i = 2; i < FIELD_LENGTH-2; i ++){
				setLines(values, i, j);
				j++;
			}
			break;
			case 7:
			for(int i = 1; i < FIELD_LENGTH-2; i++){
				setLines(values, i, j);
				j++;
			}
			break;
			case 8:
			for(int i = 1; i < FIELD_LENGTH-1; i++){
				setLines(values, i, j);
				j++;
			}
			break;
			case 9:
			for(int i = 1; i < FIELD_LENGTH; i++){
				setLines(values, i, j);
				j++;
			}
			break;
			case 10:
			for(int i = 0; i < FIELD_LENGTH; i++){
				setLines(values, i, j);
				j++;
			}
			break;
		}
	}
	
	/**
	* Shows the lineup as a matrix of 0s and 1s. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns a String, showing the lineup as a matrix of 0s and 1s. <br>
	* @return msg The lineup shown as a matrix of 0s and 1s. It returns a String.
	*/
	public String showFormation(){
		String msg = "";
		for(int i = FIELD_LENGTH-1; i >= 0; i--){
			msg += "\n";
			for(int j = 0; j < FIELD_WIDTH; j++){
				msg += formation[i][j] + " ";
			}
		}
		return msg;
	}
	
	/**
	* Returns the lineup's information. <br>
	* Pre: Lineup has been initialized. <br>
	* Post: Returns the lineup's information. <br>
	* @return msg The lineup's information. It returns a String.
	*/
	public String showInfo(){
		String msg = "Date: " + date.getInfo();
		msg += "\nTactic: " + tactic;
		msg += "\nLineup: " + lineup;
		msg += "\n" + showFormation();
		return msg;
	}
	
}