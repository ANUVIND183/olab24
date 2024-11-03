package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			return switch(o){
				case Comic comic ->comic.title();
				case Fiction fiction -> fiction.name();
				case TextBook text->text.subject();
				default "";
			};
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook();
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(null));
	}
}
