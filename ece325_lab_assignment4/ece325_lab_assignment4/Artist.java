package ece325_lab_assignment4;

/**
 * The artist/band that is performing. You must finish this class.
 * @author corpaul
 *
 */
public class Artist implements ZooPerformer {
	/** 
	 * Indicates whether the artist is currently playing (= performing). 
	 */
	private boolean isPlaying;
	
	public Artist() {
		isPlaying = false;
	}
	
	/** 
	 * Feed the animal. Make sure to check whether we are allowed to feed this animal,
	 * and make sure to handle things correctly if we are not allowed to feed it. You are allowed
	 * to change this method's signature, if necessary.
	 * @throws AlreadyFedException 
	 * @throws NotPlayingException
	 */
	
	public void feed(ZooAnimal animal) throws AlreadyFedException, NotPlayingException {
		if(isPlaying == true) {
			if(animal.isFedAlready() == false) {
				animal.feed();
			}
			else {
				//throws an AlreadyFedException
				AlreadyFedException alreadyFed = new AlreadyFedException(animal.getName() + " was already fed today!");
				throw alreadyFed;
			}
		}
		else {
			// will throw an NotPlayingException
			NotPlayingException notPlaying = new NotPlayingException("Artist is not playing");
			//isPlaying = true;
			throw notPlaying;
		}
		
	}
	
	/**
	 * Sometimes, artists get distracted, so there is a 50% chance that they start
	 * playing when you call this method. 
	 * 
	 */
	public void startPlaying() {
		// if we are already playing, don't risk getting distracted again
		if(isPlaying == true) {
			return;
		}
		
		double x = Math.random();
		
		if(x<0.5) {
			isPlaying = true;
		}
		else {
			isPlaying = false;
		}
	}
	
	public void stopPlaying() {		
		// finish this implementation
		isPlaying = false;
	}
	
}

