package ece325_lab_assignment4;

import java.time.LocalDate;

/**
 * Finish the implementation of this class. No need to add any instance variables or methods.
 *
 */
public class ZooAnimal {
	/**
	 * The last date on which this animal was fed.
	 */
	private LocalDate lastFeed;
	
	/**
	 * The name of the animal.
	 */
	private String name;
	
	public ZooAnimal(String name) {
		this.name = name;
		
	}
	
	public LocalDate getLastFeed() {
		return lastFeed;
	}
	
	
	/**
	 * Returns true iff the animal was fed already today.
	 * @return true if the animal was fed today
	 */
	public boolean isFedAlready(){
		if (lastFeed == LocalDate.now()) {
			return true;
		}
		return false;
		
		// you can use return false like above line instead
//		else {
//			return false;
//		}
	}
	
	public void feed() {
		lastFeed = LocalDate.now();
	}
	
	public String getName() {
		return name;
		
	}
}
