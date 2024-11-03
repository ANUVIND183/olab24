package newshelf;


public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if(o instanceof Comic){
				Comic comic=(Comic) o;
				return comic.title;
			}
			else if(o instanceof Fiction){
				Fiction fiction=(Fiction) o;
				return fiction.name;
			}
			else if(o instanceof TextBook){
				TextBook text=(TextBook) o;
				return text.subject;
			}
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
