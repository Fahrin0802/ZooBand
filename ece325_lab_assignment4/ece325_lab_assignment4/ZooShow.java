package ece325_lab_assignment4;

public class ZooShow {
	
	public static void main(String[] args) {
		
		// create the artist
		Artist artist = new Artist(); // Artist is not playing at time of creation

		// create the zoo
		Zoo zoo = new Zoo(); // Constructor adds all necessary animals to zoo
		
		// Start playing when first animal comes for food
		artist.startPlaying();
		
		// while there are animals that still need feeding,
		while (zoo.allAnimalsFed() == false) {
			
			// randomly select an animal from the zoo // feed it
			try {
				ZooAnimal x = zoo.getRandomAnimalToComeToStage();
				
				// Artist needs to feed the animal
				artist.feed(x);
				System.out.println(x.getName());
			} 
			catch (AlreadyFedException e) {
				System.err.println(e.getMessage());
			}
			catch (NotPlayingException e) {
				System.err.println(e.getMessage());
				
				// Artist was distracted //  Need to start playing again
				artist.startPlaying();
			}
		}
		
		// stop playing when all animals are fed
		artist.stopPlaying();
	}
}
