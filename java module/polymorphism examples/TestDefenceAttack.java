package polymorphism;



class Defence {
	
	String NameOfHead;
	int NoOfCusualties;
	int NoOfMissionPerformed;
	int NoOfTroops;
	double Budget;
	int NoOfDepartment;
	int NoOfVehicales;
	String LocationOfHeadQuarters;
	String CountryName;
	int ManPowerCount;
	 String getNameOfHead() {
		return NameOfHead;
	}
	 void setNameOfHead(String nameOfHead) {
		NameOfHead = nameOfHead;
	}
	 int getNoOfCusualties() {
		return NoOfCusualties;
	}
	 void setNoOfCusualties(int noOfCusualties) {
		NoOfCusualties = noOfCusualties;
	}
	 int getNoOfMissionPerformed() {
		return NoOfMissionPerformed;
	}
	 void setNoOfMissionPerformed(int noOfMissionPerformed) {
		NoOfMissionPerformed = noOfMissionPerformed;
	}
	int getNoOfTroops() {
		return NoOfTroops;
	}
	 void setNoOfTroops(int noOfTroops) {
		NoOfTroops = noOfTroops;
	}
	 double getBudget() {
		return Budget;
	}
    void setBudget(double budget) {
		Budget = budget;
	}
	 int getNoOfDepartment() {
		return NoOfDepartment;
	}
	 void setNoOfDepartment(int noOfDepartment) {
		NoOfDepartment = noOfDepartment;
	}
	 int getNoOfVehicales() {
		return NoOfVehicales;
	}
	 void setNoOfVehicales(int noOfVehicales) {
		NoOfVehicales = noOfVehicales;
	}
	 String getLocationOfHeadQuarters() {
		return LocationOfHeadQuarters;
	}
	 void setLocationOfHeadQuarters(String locationOfHeadQuarters) {
		LocationOfHeadQuarters = locationOfHeadQuarters;
	}
	 String getCountryName() {
		return CountryName;
	}
	 void setCountryName(String countryName) {
		CountryName = countryName;
	}
	int getManPowerCount() {
		return ManPowerCount;
	}
	  
	 void setManPowerCount(int manPowerCount) {
		ManPowerCount = manPowerCount;
	}
	 
	 
	Defence() {
		System.out.println("Called Default Constructor of Defence");
		NameOfHead = "Default";
		NoOfCusualties = 0;
		NoOfMissionPerformed = 0;
		NoOfTroops = 0;
		Budget = 50000;
		NoOfDepartment = 0;
		NoOfVehicales = 0;
		LocationOfHeadQuarters = "Default";
		CountryName = "Default";
		ManPowerCount =0 ;
	}
	 Defence(String nameOfHead, int noOfCusualties, int noOfMissionPerformed, int noOfTroops, double budget,
				int noOfDepartment, int noOfVehicales, String locationOfHeadQuarters, String countryName,
				int manPowerCount) {
		 System.out.println("Called Parameterized Constructor of Defence");

			NameOfHead = nameOfHead;
			NoOfCusualties = noOfCusualties;
			NoOfMissionPerformed = noOfMissionPerformed;
			NoOfTroops = noOfTroops;
			Budget = budget;
			NoOfDepartment = noOfDepartment;
			NoOfVehicales = noOfVehicales;
			LocationOfHeadQuarters = locationOfHeadQuarters;
			CountryName = countryName;
			ManPowerCount = manPowerCount;
		}
	 
	 void Display(){
		 System.out.println("NameOfHead ="+this.NameOfHead);
		 System.out.println("NoOfCusualties ="+this. NoOfCusualties); 
		 System.out.println("NoOfMissionPerformed ="+ NoOfMissionPerformed);
		 System.out.println("NoOfTroops = "+NoOfTroops);
		 System.out.println("Budget = "+Budget);
		 System.out.println("NoOfDepartment ="+ NoOfDepartment);
		 System.out.println("NoOfVehicales ="+ NoOfVehicales);
		 System.out.println("LocationOfHeadQuarters ="+ LocationOfHeadQuarters);
		 System.out.println("CountryName = "+CountryName);
		 System.out.println("ManPowerCount =" +this.ManPowerCount);
		
		
	 }
	 void Attack() {
		 System.out.println("Attack on enemies");
	 }
	
}
class Army extends Defence{
int NoOfTanks;
int NoOfGuns;
int NoOfGranaties;
int NoOfBataliens;


int getNoOfTanks() {
	return NoOfTanks;
}
void setNoOfTanks(int noOfTanks) {
	NoOfTanks = noOfTanks;
}
int getNoOfGuns() {
	return NoOfGuns;
}
void setNoOfGuns(int noOfGuns) {
	NoOfGuns = noOfGuns;
}
int getNoOfGranaties() {
	return NoOfGranaties;
}
void setNoOfGranaties(int noOfGranaties) {
	NoOfGranaties = noOfGranaties;
}
int getNoOfBataliens() {
	return NoOfBataliens;
}
void setNoOfBataliens(int noOfBataliens) {
	NoOfBataliens = noOfBataliens;
}
 Army() {
	super();
	System.out.println("Called Default Constructor of Army");
	NoOfTanks=0;
	NoOfGuns=0;
	NoOfGranaties=0;
	NoOfBataliens=0;
}
 Army(String nameOfHead, int noOfCusualties, int noOfMissionPerformed, int noOfTroops, double budget,
		int noOfDepartment, int noOfVehicales, String locationOfHeadQuarters, String countryName,
		int manPowerCount,int noOfTanks, int noOfGuns, int noOfGranaties, int noOfBataliens) {

	super( nameOfHead, noOfCusualties,  noOfMissionPerformed, noOfTroops,  budget,
			noOfDepartment,  noOfVehicales,  locationOfHeadQuarters,  countryName,
			 manPowerCount);
	
	System.out.println("Called Parameterized Constructor of Army");
	NoOfTanks = noOfTanks;
	NoOfGuns = noOfGuns;
	NoOfGranaties = noOfGranaties;
	NoOfBataliens = noOfBataliens;
}
 
void Display(){
	super.Display();
	System.out.println("NoOfTanks="+NoOfTanks);
	System.out.println("NoOfGuns="+NoOfGuns);
	System.out.println("NoOfGranaties ="+NoOfGranaties );
	System.out.println("NoOfBataliens = "+NoOfBataliens );
	
}
void Attack() {
	 System.out.println("Attack on enemies using guns");
}


}

class Navy extends Defence{
	int NoOfShips;
	int NoOfSubmariens;
    int NoOfTorpadoes;
	int getNoOfShips() {
		return NoOfShips;
	}
	void setNoOfShips(int noOfShips) {
		NoOfShips = noOfShips;
	}
	int getNoOfSubmariens() {
		return NoOfSubmariens;
	}
	void setNoOfSubmariens(int noOfSubmariens) {
		NoOfSubmariens = noOfSubmariens;
	}
	int getNoOfTorpadoes() {
		return NoOfTorpadoes;
	}
	void setNoOfTorpadoes(int noOfTorpadoes) {
		NoOfTorpadoes = noOfTorpadoes;
	}
	
	
	Navy() {
		super();
		System.out.println("Called Default Constructor of Navy");
		NoOfShips = 0;
		NoOfSubmariens = 0;
		NoOfTorpadoes = 0;
	}

		
	
	Navy(String nameOfHead, int noOfCusualties, int noOfMissionPerformed, int noOfTroops, double budget,
			int noOfDepartment, int noOfVehicales, String locationOfHeadQuarters, String countryName,
			int manPowerCount,int noOfShips,int noOfSubmariens,int noOfTorpadoes) {
		super(nameOfHead, noOfCusualties, noOfMissionPerformed, noOfTroops, budget, noOfDepartment, noOfVehicales,
				locationOfHeadQuarters, countryName, manPowerCount);
		System.out.println("Called Parameterized Constructor of Navy");
		NoOfShips = noOfShips;
		NoOfSubmariens = noOfSubmariens;
		NoOfTorpadoes = noOfTorpadoes;
	}
	void Display() {
		super.Display();
		System.out.println("NoOfShips="+NoOfShips);
		System.out.println("NoOfSubmariens="+NoOfSubmariens);
		System.out.println("NoOfTorpadoes="+NoOfTorpadoes);
		
	}
	void Attack() {
		 System.out.println("Attack on enemiesusing submariens");
	 }
	
}

class Air extends Defence{
	int NoOfMissiles;
	int NoOfAircraft;
	int NoOfSquadsron;
	int getNoOfMissiles() {
		return NoOfMissiles;
	}
	void setNoOfMissiles(int noOfMissiles) {
		NoOfMissiles = noOfMissiles;
	}
	int getNoOfAircraft() {
		return NoOfAircraft;
	}
	void setNoOfAircraft(int noOfAircraft) {
		NoOfAircraft = noOfAircraft;
	}
	int getNoOfSquadsron() {
		return NoOfSquadsron;
	}
	void setNoOfSquadsron(int noOfSquadsron) {
		NoOfSquadsron = noOfSquadsron;
	}
	Air() {
		super();
		System.out.println("Called Default Constructor of Air");
		NoOfMissiles = 0;
		NoOfAircraft = 0;
		NoOfSquadsron = 0;
	}
	Air(String nameOfHead, int noOfCusualties, int noOfMissionPerformed, int noOfTroops, double budget,
			int noOfDepartment, int noOfVehicales, String locationOfHeadQuarters, String countryName,
			int manPowerCount,int noOfMissiles,int noOfAircraft,int noOfSquadsron) {
		super(nameOfHead, noOfCusualties, noOfMissionPerformed, noOfTroops, budget, noOfDepartment, noOfVehicales,
				locationOfHeadQuarters, countryName, manPowerCount);
		
		System.out.println("Called Parameterized Constructor of Air");
		NoOfMissiles = noOfMissiles;
		NoOfAircraft =noOfAircraft ;
		NoOfSquadsron = noOfSquadsron;
	}
	void Attack() {
		 System.out.println("Attack on enemies using Aircraft");
	 }
	
	
}
 class TestDefenceAttack {

	public static void main(String[] args) {
		Defence A1;
		 A1=new Army();
		 A1.Display();
		A1.Attack();
		 A1=new Navy();
		 A1.Display();
		A1.Attack();
		 A1=new Air();
		 A1.Display();
		A1.Attack();

	}

}
