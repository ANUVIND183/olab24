package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/ String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final String name;
	private static FictionType type;
	public Fiction(String title,String name) {
		super(title);
		this.name=name;
		// TODO  correct the above.
	}

}
