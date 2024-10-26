package oldshelf;

public class Comic extends Book {

	/* TODO: Add most strict modifiers here*/ String Title;
	private String title;

	// TODO: Warning to be removed.
	private final int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String title,int ageOfMainCharacter) {
		this.title=title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}

	public String getter(){
		return this.title;
	}
	// TODO : create a getter if required.
	
	// TODO: Create a setter if required
	public void setter(String title){
		this.title=title
	}
	// TODO: write a toString method
	@Override
	public String toString() {
		return null;
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		// TODO: Based on the information about hashCode write the equals method.
	}
}
