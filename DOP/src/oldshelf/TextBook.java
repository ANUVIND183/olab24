package oldshelf;

public class TextBook extends Book {

	// TODO: Make this a final field with most strict visiibility possible.
	private final String subject;
	
	// TODO: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		this.subject=subject;
	}

	// TODO : create a getter if required.
	public void getter(){
		return this.subject;
	}
	// TODO: Create a setter if required
	
	// TODO: write a toString method
	@Override
	public String toString() {
		return null;
	}

}
