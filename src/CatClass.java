
public class CatClass extends PetClass{
	private int catSpaceNumber; 

	public CatClass() {
		// TODO Auto-generated constructor stub
	}

	public CatClass(String petType, String petName, int petAge, int daysStay) {
		// TODO Auto-generated constructor stub
		super(petType, petName, petAge, daysStay);
	}

	public int getCatSpaceNumber() {
		return catSpaceNumber;
	}

	public void setCatSpaceNumber(int catSpaceNumber) {
		this.catSpaceNumber = catSpaceNumber;
	}

}
