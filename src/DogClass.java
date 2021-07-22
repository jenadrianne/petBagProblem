
public class DogClass extends PetClass{
	private int dogSpaceNumber; 
	private int dogWeight; 
	private boolean grooming; 
	
	public DogClass() {
		// TODO Auto-generated constructor stub
	}

	public DogClass(String petType, String petName, int petAge, int daysStay) {
		// TODO Auto-generated constructor stub
		super(petType, petName, petAge, daysStay);
	}

	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}

	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}

	public int getDogWeight() {
		return dogWeight;
	}

	public void setDogWeight(int dogWeight) {
		this.dogWeight = dogWeight;
	}

	public boolean isGrooming() {
		return grooming;
	}

	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}

}
