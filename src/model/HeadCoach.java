package model;

public class HeadCoach extends Coach{
	
	private int teamAmount;
	private int wonChampionships;
	
	/**
	* Constructor method for the HeadCoach class. <br>
	* Pre: <br>
	* Post: Creates an instance of HeadCoach. <br>
	*/
	public HeadCoach(String name, int identifier, int salary, int experienceYears, int teamAmount, int wonChampionships){
		
		super(name, identifier, salary, experienceYears);
		this.teamAmount = teamAmount;
		this.wonChampionships = wonChampionships;
		
	}
	
	/**
	* Returns the attribute teamAmount. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Returns the attribute teamAmount. <br>
	* @return teamAmount
	*/
	public int getTeamAmount(){
		return teamAmount;
	}
	
	/**
	* Changes the attribute teamAmount. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Changes the attribute teamAmount. <br>
	*/
	public void setTeamAmount(int teamAmount){
		this.teamAmount = teamAmount;
	}
	
	/**
	* Returns the attribute wonChampionships. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Returns the attribute wonChampionships. <br>
	* @return wonChampionships
	*/
	public int getWonChampionships(){
		return wonChampionships;
	}
	
	/**
	* Changes the attribute wonChampionships. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Changes the attribute wonChampionships. <br>
	*/
	public void setWonChampionships(int wonChampionships){
		this.wonChampionships = wonChampionships;
	}
	
	/**
	* Returns the price of the coach. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Returns the price of the coach. <br>
	* @return price
	*/
	public int getPrice(){
		int price = (getSalary()*10) + (getExperienceYears()*100) + (wonChampionships*50);
		return price;
	}
	
	/**
	* Returns the level of the coach. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Returns the level of the coach. <br>
	* @return level
	*/
	public int getLevel(){
		int level = 5 + (wonChampionships/10);
		return level;
	}
	
	/**
	* Returns the coach's information. <br>
	* Pre: HeadCoach has been initialized. <br>
	* Post: Returns the coach's information. <br>
	* @return msg The coach's information. It returns a String.
	*/
	@Override
	public String getInfo(){
		String msg = super.getInfo();
		msg += "Teams he has been in charge of: " + teamAmount + "\n";
		msg += "Won championships: " + wonChampionships + "\n";
		msg += "Price: " + getPrice() + "\n";
		msg += "Level: " + getLevel() + "\n";
		return msg;
	}
	
}