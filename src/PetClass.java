import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PetClass {
	
	///All attributes with appropriate data structures. Note that the types are not specified in this UML class diagram. 
	// You will need to think about what the most appropriate data type is for each attribute.
	private String petType; 
	private String petName; 
	private int petAge; 
	private static Map<String , PetClass> dogSpaces = new HashMap<String, PetClass>(); 
	private static Map<String , PetClass> CatSpaces = new HashMap<String, PetClass>();
	private int daysStay;
	private double amountDue;
	//add unique value 
	private int petId; 

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
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
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
	public static Map<String, PetClass> getDogSpaces() {
		return dogSpaces;
	}
	public static void setDogSpaces(Map<String, PetClass> dogSpaces) {
		PetClass.dogSpaces = dogSpaces;
	}
	public static Map<String, PetClass> getCatSpaces() {
		return CatSpaces;
	}
	public static void setCatSpaces(Map<String, PetClass> catSpaces) {
		CatSpaces = catSpaces;
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
	
	
	/**
	 * Pseudocode : 
	 * 	1. 	Determine the Type of the pet.
		2. 	If Dog, get the total spaces available for a dog.
			If Cat, get the total spaces available for a cat.
		3. 	If the available spaces is greater than zero , perform the next procedure : 
			3.1	Check if the pet is a returning customer
				3.1.1 If the pet is a returning customer , update the existing record
				3.1.2 If the pet is a new customer, create a new pet record.
			3.2 Ask the customer , the pet's length of stay in the Bag.
				3.2.1 If the pet's stay for 2 or more days, asks the customer if they want the pet to be groomed. 
					3.2.1.1 If the customer agrees, add the information in the record
			3.3 Assign a Place for the pet
			3.4 Update the spaces available by incrementing it when a pet record is added or updated.
	 * @param petType
	 * @param petName
	 * @param petAge
	 * @param daysStay
	 */
	public static void PetCheckIn(String petType , String petName, int petAge, int daysStay) {
		
		int spaceAvailable = 0; 
		boolean newCustomer = true; 
		PetClass petInfo = null; 
		Map<String , PetClass> cage = null;
		
		if(petType.equals("Dog")) {
			petInfo = new DogClass(petType , petName, petAge, daysStay); 
			cage =  PetClass.getDogSpaces(); 
			spaceAvailable = 30 - cage.size();
			//30 is the default number of cages for dogs;
		} else {
			petInfo = new CatClass(petType , petName, petAge, daysStay); 
			cage = PetClass.getCatSpaces();
			spaceAvailable = 12 - cage.size();
			//12 is the default number of cages for cats;
		}
		
		if (spaceAvailable > 0) {
			/* check if returning customer 
			 * When using Map.put if the key does not exist, then the Pet is added. 
			 * If it exist it is updated. 
			 * However you have to change the key to a more unique variable since 
			 * pets can have the same name
			*/
			cage.put(petName, petInfo);
			
			if(petType.equals("Dog") && daysStay > 2) {
				// ask the user if pet is for grooming. 
				System.out.println("Would you like for a grooming? (Yes/No) "); 
				Scanner scan = new Scanner(System.in); 
				String answer = scan.next(); 
				scan.close();
				if(answer.equalsIgnoreCase("Yes")) {
					((DogClass) petInfo).setGrooming(true);
				}
				
				((DogClass) petInfo).setDogSpaceNumber(spaceAvailable);
			}
			
			int petindex =0;
			for(String pet : cage.keySet()) {
				petindex++;
				if(pet.equals(petName)) { break; }
			}
			if(petType.equals("Dog")) {
				((DogClass) petInfo).setDogSpaceNumber(petindex);
			}else {
				((CatClass) petInfo).setCatSpaceNumber(petindex); 
			}
		}
		
	}
}
