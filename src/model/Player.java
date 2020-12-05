package model;

public class Player extends Employee{
	
	private int goals;
	private double averageRating;
	private Positions position;
	private int number;
	
	/**
	* Constructor method for the Player class. <br>
	* Pre: <br>
	* Post: Creates an instance of Player. <br>
	*/
	public Player(String name, int identifier, int salary, int goals, double averageRating, Positions position, int number){
		
		super(name, identifier, salary);
		this.goals = goals;
		this.averageRating = averageRating;
		this.position = position;
		this.number = number;
		
	}
	
	/**
	* Returns the attribute goals. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the attribute goals. <br>
	* @return goals
	*/
	public int getGoals(){
		return goals;
	}
	
	/**
	* Changes the attribute goals. <br>
	* Pre: Player has been initialized. <br>
	* Post: Changes the attribute goals. <br>
	*/
	public void setGoals(int goals){
		this.goals = goals;
	}
	
	/**
	* Returns the attribute averageRating. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the attribute averageRating. <br>
	* @return averageRating
	*/
	public double getAverageRating(){
		return averageRating;
	}
	
	/**
	* Changes the attribute averageRating. <br>
	* Pre: Player has been initialized. <br>
	* Post: Changes the attribute averageRating. <br>
	*/
	public void setAverageRating(double averageRating){
		this.averageRating = averageRating;
	}
	
	/**
	* Returns the attribute position. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the attribute position. <br>
	* @return position
	*/
	public Positions getPosition(){
		return position;
	}
	
	/**
	* Changes the attribute position. <br>
	* Pre: Player has been initialized. <br>
	* Post: Changes the attribute position. <br>
	*/
	public void setPosition(Positions position){
		this.position = position;
	}
	
	/**
	* Returns the attribute number. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the attribute number. <br>
	* @return number
	*/
	public int getNumber(){
		return number;
	}
	
	/**
	* Changes the attribute number. <br>
	* Pre: Player has been initialized. <br>
	* Post: Changes the attribute number. <br>
	*/
	public void setNumber(int number){
		this.number = number;
	}
	
	/**
	* Returns the price of the player. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the price of the player. <br>
	* @return price
	*/
	public int getPrice(){
		int price = 0;
		switch(position){
			case Goalkeeper:
			price = (int)((getSalary()*12) + (averageRating*150));
			break;
			case Defender:
			price = (int)((getSalary()*13) + (averageRating*125) + (goals*100));
			break;
			case Midfielder:
			price = (int)((getSalary()*14) + (averageRating*135) + (goals*125));
			break;
			case Forward:
			price = (int)((getSalary()*15) + (averageRating*145) + (goals*150));
			break;
		}
		return price;
	}
	
	/**
	* Returns the level of the player. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the level of the player. <br>
	* @return level
	*/
	public double getLevel(){
		double level = 0;
		switch(position){
			case Goalkeeper:
			level = (averageRating*0.9);
			break;
			case Defender:
			level = (averageRating*0.9) + (goals/100);
			break;
			case Midfielder:
			level = (averageRating*0.9) + (goals/90);
			break;
			case Forward:
			level = (averageRating*0.9) + (goals/80);
			break;
		}
		return level;
	}
	
	/**
	* Changes the attribute position based on the parameter position. <br>
	* Pre: Player has been initialized. <br>
	* Post: Changes the attribute position based on the parameter position, which is an integer. <br>
	*/
	public void changePosition(int position){
		switch(position){
			case 1:
			this.position = Positions.Goalkeeper;
			break;
			case 2:
			this.position = Positions.Defender;
			break;
			case 3:
			this.position = Positions.Midfielder;
			break;
			case 4:
			this.position = Positions.Forward;
			break;
		}
	}
	
	/**
	* Returns the player's information. <br>
	* Pre: Player has been initialized. <br>
	* Post: Returns the player's information. <br>
	* @return msg The player's information. It returns a String.
	*/
	@Override
	public String getInfo(){
		String msg = super.getInfo();
		msg += "Goals: " + goals + "\n";
		msg += "Average rating: " + averageRating + "\n";
		msg += "Player's position: " + position + "\n";
		msg += "Number: " + number + "\n";
		msg += "Price: " + getPrice() + "\n";
		msg += "Level: " + getLevel() + "\n";
		return msg;
	}
	
}