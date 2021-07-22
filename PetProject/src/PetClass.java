
public class PetClass {
	
	///All attributes with appropriate data structures. Note that the types are not specified in this UML class diagram. 
	// You will need to think about what the most appropriate data type is for each attribute.
	private String petType; 
	private String petName; 
	private int petAge; 
	private int dogSpaces = 30;
	private int catSpaces = 12;
	private int daysStay;
	private double amountDue;

	//Constructors
	public PetClass() {
		
	}
	public PetClass(String petType , String petName, int petAge, int daysStay) {
			this.petType = petType; 
			this.petName = petName; 
			this.petAge = petAge; 
			this.daysStay = daysStay; 
	}
	
	//Accessors and Mutators
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public int getDogSpaces() {
		return dogSpaces;
	}
	public void setDogSpaces(int dogSpaces) {
		this.dogSpaces = dogSpaces;
	}
	public int getCatSpaces() {
		return catSpaces;
	}
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
	}
	public int getDaysStay() {
		return daysStay;
	}
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	
}
