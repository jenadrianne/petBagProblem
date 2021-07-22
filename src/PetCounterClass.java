import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PetCounterClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetClass dogInfo = new DogClass (); 
		PetClass catInfo = new CatClass ();
		PetClass dogInfo2 = new DogClass ();
		PetClass dogInfo3 = new DogClass ();
		PetClass Pet = new PetClass ();
		
//		dogInfo.PetCheckIn("Dog", "Loki", 2, 3);
//		catInfo.PetCheckIn("Cat", "Sisa", 1, 1);
//		dogInfo2.PetCheckIn("Dog", "Taco", 2, 1);
//		dogInfo3.PetCheckIn("Dog", "Loki", 5, 1); // update
//		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Please enter the following information : "); 
		System.out.println("Pet type (Dog/Cat): "); 
		String petType = scan.next(); 
		System.out.println("Pet Name: "); 
		String petName = scan.next(); 
		System.out.println("Pet Age: "); 
		int petAge = scan.nextInt(); 
		System.out.println("Days of Stay: "); 
		int days = scan.nextInt(); 
		dogInfo3.PetCheckIn(petType, petName, petAge, days); // update
		
		printCage();
	}
	
	public static void printCage() {
		Map<String, PetClass> dogCage = PetClass.getDogSpaces(); 
		Map<String, PetClass> catCage = PetClass.getCatSpaces(); 
		
		System.out.println("==========================================="); 

		System.out.println("Dog Cage"); 
		for(Entry<String, PetClass> dog : dogCage.entrySet()) {
			DogClass entry = (DogClass) dog.getValue();
			System.out.format("%d - %s, %s, %d, %d \n", entry.getDogSpaceNumber(), entry.getPetType(), entry.getPetName(), entry.getPetAge(), entry.getDaysStay());
		}
		
		System.out.println("==========================================="); 
		
		System.out.println("Cat Cage"); 
		for(Entry<String, PetClass> dog : catCage.entrySet()) {
			CatClass entry = (CatClass) dog.getValue();
			System.out.format("%d - %s, %s, %d, %d \n", entry.getCatSpaceNumber(), entry.getPetType(), entry.getPetName(), entry.getPetAge(), entry.getDaysStay());
		}
		
		System.out.println("==========================================="); 
	}
}
