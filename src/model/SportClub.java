package model;

public class SportClub{
	
	private final static int ROOM_WIDTH = 7;
	private final static int ROOM_A_LENGTH = 6;
	private final static int ROOM_B_LENGTH = 7;
	private final static int OFFICE_WIDTH_LENGTH = 6;
	private final static int MAX_EMPLOYEES = 58;
	
	private String name;
	private int NIT;
	private Date foundationDate;
	private Team teamA;
	private Team teamB;
	private Player[][] dressingRoomA;
	private Player[][] dressingRoomB;
	private Coach[][] offices;
	private Employee[] employeeList;
	
	/**
	* Constructor method for the SportClub class. <br>
	* Pre: <br>
	* Post: Creates an instance of SportClub. <br>
	*/
	public SportClub(String name, int NIT, int day, int month, int year, String teamNameA, String teamNameB){
		
		this.name = name;
		this.NIT = NIT;
		foundationDate = new Date(day, month, year);
		teamA = new Team(teamNameA);
		teamB = new Team(teamNameB);
		dressingRoomA = new Player[ROOM_WIDTH][ROOM_A_LENGTH];
		dressingRoomB = new Player[ROOM_WIDTH][ROOM_B_LENGTH];
		offices = new Coach[OFFICE_WIDTH_LENGTH][OFFICE_WIDTH_LENGTH];
		employeeList = new Employee[MAX_EMPLOYEES];
		
	}
	
	/**
	* Returns the attribute name. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute name. <br>
	* @return name
	*/
	public String getName(){
		return name;
	}
	
	/**
	* Changes the attribute name. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Changes the attribute name. <br>
	*/
	public void setName(String name){
		this.name = name;
	}
	
	/**
	* Returns the attribute NIT. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute NIT. <br>
	* @return NIT
	*/
	public int getNIT(){
		return NIT;
	}
	
	/**
	* Changes the attribute NIT. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Changes the attribute NIT. <br>
	*/
	public void setNIT(int NIT){
		this.NIT = NIT;
	}
	
	/**
	* Returns the attribute foundationDate. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute foundationDate. <br>
	* @return foundationDate
	*/
	public Date getFoundationDate(){
		return foundationDate;
	}
	
	/**
	* Returns the attribute teamA. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute teamA. <br>
	* @return teamA
	*/
	public Team getTeamA(){
		return teamA;
	}
	
	/**
	* Returns the attribute teamB. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute teamB. <br>
	* @return teamB
	*/
	public Team getTeamB(){
		return teamB;
	}
	
	/**
	* Returns the attribute dressingRoomA. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute dressingRoomA. <br>
	* @return dressingRoomA
	*/
	public Player[][] getDressingRoomA(){
		return dressingRoomA;
	}
	
	/**
	* Returns the attribute dressingRoomB. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute dressingRoomB. <br>
	* @return dressingRoomB
	*/
	public Player[][] getDressingRoomB(){
		return dressingRoomB;
	}
	
	/**
	* Returns the attribute offices. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute offices. <br>
	* @return offices
	*/
	public Coach[][] getOffices(){
		return offices;
	}
	
	/**
	* Returns the attribute employeeList. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the attribute employeeList. <br>
	* @return employeeList
	*/
	public Employee[] getEmployeeList(){
		return employeeList;
	}
	
	/**
	* It hires a player. It adds a player to the list of employees. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: It adds a player to the list of employees. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addEmployee(String name, int identifier, int salary, int goals, double averageRating, Positions position){
		String msg = "Unsuccessful action.";
		boolean space = false;
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] != null){
				if(employeeList[i].getIdentifier() == identifier){
					space = true;
				}
			}
		}
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] == null){
				employeeList[i] = new Player(name, identifier, salary, goals, averageRating, position, 0);
				space = true;
				msg = "Action done successfully.";
			}
		}
		return msg;
	}
	
	/**
	* It hires a head coach. It adds a head coach to the list of employees. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: It adds a head coach to the list of employees. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addEmployee(String name, int identifier, int salary, int experienceYears, int teamAmount, int wonChampionships){
		String msg = "Unsuccessful action.";
		boolean space = false;
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] != null){
				if(employeeList[i].getIdentifier() == identifier){
					space = true;
				}
			}
		}
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] == null){
				employeeList[i] = new HeadCoach(name, identifier, salary, experienceYears, teamAmount, wonChampionships);
				space = true;
				msg = "Action done successfully.";
			}
		}
		return msg;
	}
	
	/**
	* It hires an assistant coach. It adds an assistant coach to the list of employees. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: It adds an assistant coach to the list of employees. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addEmployee(String name, int identifier, int salary, int experienceYears, boolean professionalPlayer, Specialty specialty){
		String msg = "Unsuccessful action.";
		boolean space = false;
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] != null){
				if(employeeList[i].getIdentifier() == identifier){
					space = true;
				}
			}
		}
		for (int i = 0; i < MAX_EMPLOYEES && !space; i++){
			if(employeeList[i] == null){
				employeeList[i] = new AssistantCoach(name, identifier, salary, experienceYears, professionalPlayer, specialty);
				space = true;
				msg = "Action done successfully.";
			}
		}
		return msg;
	}
	
	/**
	* It dismisses an employee / Removes an employee from all avaiable lists. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Removes an employee from the dressing rooms, offices, list of employees and teams. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String removeEmployee(int identifier){
		String msg = "Unsuccessful action.";
		boolean found = false;
		for (int i = 0; i < MAX_EMPLOYEES && !found; i++){
			if(employeeList[i] != null && employeeList[i].getIdentifier() == identifier){
				employeeList[i] = null;
				found = true;
				msg = "Action done successfully.";
			}
		}
		for(int i = 0; i < ROOM_A_LENGTH; i++){
			if(i%2 == 0){
				for(int j = 0; j < ROOM_WIDTH; j += 2){
					if(dressingRoomA[j][i] != null){
						if(dressingRoomA[j][i].getIdentifier() == identifier){
							dressingRoomA[j][i] = null;
						}
					}
				}
			}else{
				for(int j = 1; j < ROOM_WIDTH; j += 2){
					if(dressingRoomA[j][i] != null){
						if(dressingRoomA[j][i].getIdentifier() == identifier){
							dressingRoomA[j][i] = null;
						}
					}
				}
			}
		}
		for(int i = 0; i < ROOM_B_LENGTH; i++){
			if(i%2 == 0){
				for(int j = 0; j < ROOM_WIDTH; j += 2){
					if(dressingRoomB[j][i] != null){
						if(dressingRoomB[j][i].getIdentifier() == identifier){
							dressingRoomB[j][i] = null;
						}
					}
				}
			}else{
				for(int j = 1; j < ROOM_WIDTH; j += 2){
					if(dressingRoomB[j][i] != null){
						if(dressingRoomB[j][i].getIdentifier() == identifier){
							dressingRoomB[j][i] = null;
						}
					}
				}
			}
		}
		for(int i = 0; i < OFFICE_WIDTH_LENGTH; i++){
			if(i%2 == 0){
				for(int j = 0; j < OFFICE_WIDTH_LENGTH; j += 2){
					if(offices[j][i] != null){
						if(offices[j][i].getIdentifier() == identifier){
							offices[j][i] = null;
						}
					}
				}
			}else{
				for(int j = 1; j < OFFICE_WIDTH_LENGTH; j += 2){
					if(offices[j][i] != null){
						if(offices[j][i].getIdentifier() == identifier){
							offices[j][i] = null;
						}
					}
				}
			}
		}
		
		teamA.removeEmployee(identifier);
		teamB.removeEmployee(identifier);
		
		return msg;
	}
	
	/**
	* It looks for an employee in the list of employees. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Searchs for an employee in the list of employees using their identifier. <br>
	* @return employee The instance of that employee.
	*/
	public Employee searchEmployee(int identifier){
		Employee employee = null;
		boolean found = false;
		for (int i = 0; i < MAX_EMPLOYEES && !found; i++){
			if(employeeList[i] != null && employeeList[i].getIdentifier() == identifier){
				employee = employeeList[i];
				found = true;
			}
		}
		return employee;
	}
	
	/**
	* Returns the employees' information. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the employees' information. <br>
	* @return msg The employees' information. It returns a String.
	*/
	public String showEmployeeInfo(){
		String msg = "";
		for (int i = 0; i < MAX_EMPLOYEES; i++){
			if(employeeList[i] != null){
				msg += employeeList[i].getInfo();
			}
		}
		return msg;
	}
	
	/**
	* Adds a player to the dressing rooms. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Adds a player to the dressing rooms. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addToDressingRoom(int identifier, boolean room){
		Player[][] dressingRoom;
		int length = 0;
		if(room){
			dressingRoom = dressingRoomA;
			length = ROOM_A_LENGTH;
		}else{
			dressingRoom = dressingRoomB;
			length = ROOM_B_LENGTH;
		}
		String msg = "Unsuccessful action.";
		Employee employee = searchEmployee(identifier);
		boolean space = false;
		if(employee instanceof Player && employee != null){
			for(int i = 0; i < length && !space; i++){
				if(i%2 == 0){
					for(int j = 0; j < ROOM_WIDTH && !space; j += 2){
						if(dressingRoom[j][i] != null){
							if(dressingRoom[j][i].getIdentifier() == identifier){
								space = true;
							}
						}
					}
				}else{
					for(int j = 1; j < ROOM_WIDTH && !space; j += 2){
						if(dressingRoom[j][i] != null){
							if(dressingRoom[j][i].getIdentifier() == identifier){
								space = true;
							}
						}
					}
				}
			}
			for(int i = 0; i < length && !space; i++){
				if(i%2 == 0){
					for(int j = 0; j < ROOM_WIDTH && !space; j += 2){
						if(dressingRoom[j][i] == null){
							dressingRoom[j][i] = (Player)employee;
							space = true;
							msg = "Action done successfully.";
						}
					}
				}else{
					for(int j = 1; j < ROOM_WIDTH && !space; j += 2){
						if(dressingRoom[j][i] == null){
							dressingRoom[j][i] = (Player)employee;
							space = true;
							msg = "Action done successfully.";
						}
					}
				}
			}
		}
		return msg;
	}
	/**
	* Adds a coach to the offices. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Adds a coach to the offices. <br>
	* @return msg A message for the user. It returns a String.
	*/
	public String addToOffices(int identifier){
		String msg = "Unsuccessful action.";
		Employee employee = searchEmployee(identifier);
		boolean space = false;
		if(employee instanceof Coach && employee != null){
			for(int i = 0; i < OFFICE_WIDTH_LENGTH && !space; i++){
				if(i%2 == 0){
					for(int j = 0; j < OFFICE_WIDTH_LENGTH && !space; j += 2){
						if(offices[j][i] != null){
							if(offices[j][i].getIdentifier() == identifier){
								space = true;
							}
						}
					}
				}else{
					for(int j = 1; j < OFFICE_WIDTH_LENGTH && !space; j += 2){
						if(offices[j][i] != null){
							if(offices[j][i].getIdentifier() == identifier){
								space = true;
							}
						}
					}
				}
			}
			for(int i = 0; i < OFFICE_WIDTH_LENGTH && !space; i++){
				if(i%2 == 0){
					for(int j = 0; j < OFFICE_WIDTH_LENGTH && !space; j += 2){
						if(offices[j][i] == null){
							offices[j][i] = (Coach)employee;
							space = true;
							msg = "Action done successfully.";
						}
					}
				}else{
					for(int j = 1; j < OFFICE_WIDTH_LENGTH && !space; j += 2){
						if(offices[j][i] == null){
							offices[j][i] = (Coach)employee;
							space = true;
							msg = "Action done successfully.";
						}
					}
				}
			}
		}
		return msg;
	}
	
	/**
	* Shows the dressing rooms as a matrix of 0s and 1s. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns a String, showing the dressing rooms as a matrix of 0s and 1s. <br>
	* @return msg The dressing rooms shown as a matrix of 0s and 1s. It returns a String.
	*/
	public String showDressingRoom(boolean room){
		Player[][] dressingRoom;
		int length = 0;
		if(room){
			dressingRoom = dressingRoomA;
			length = ROOM_A_LENGTH;
		}else{
			dressingRoom = dressingRoomB;
			length = ROOM_B_LENGTH;
		}
		String msg = "Dressing room:\n";
		for(int i = 0; i < length; i++){
			msg += "\n";
			for(int j = 0; j < ROOM_WIDTH; j++){
				if(dressingRoom[j][i] != null){
					msg += "1 ";
				}else{
					msg += "0 ";
				}
			}
		}
		msg += "\n";
		return msg;
	}
	
	/**
	* Shows the offices as a matrix of 0s and 1s. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns a String, showing the offices as a matrix of 0s and 1s. <br>
	* @return msg The offices shown as a matrix of 0s and 1s. It returns a String.
	*/
	public String showOffices(){
		String msg = "Offices:\n";
		for(int i = 0; i < OFFICE_WIDTH_LENGTH; i++){
			msg += "\n";
			for(int j = 0; j < OFFICE_WIDTH_LENGTH; j++){
				if(offices[j][i] != null){
					msg += "1 ";
				}else{
					msg += "0 ";
				}
			}
		}
		msg += "\n";
		return msg;
	}
	
	/**
	* Returns the teams' information. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the teams' information. <br>
	* @return msg The teams' information. It returns a String.
	*/
	public String showTeamInfo(){
		String msg = teamA.showTeamInfo();
		msg += teamB.showTeamInfo();
		return msg;
	}
	
	/**
	* Returns the sport club's information. <br>
	* Pre: SportClub has been initialized. <br>
	* Post: Returns the sport club's information. <br>
	* @return msg The sport club's information. It returns a String.
	*/
	public String showInfo(){
		String msg = "Club's name: " + name + "\n";
		msg += "NIT: " + NIT + "\n";
		msg += "Foundation date: " + foundationDate.getInfo() + "\n";
		return msg;
	}
	
}