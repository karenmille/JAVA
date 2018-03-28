
public class TestDriver {

	public TestDriver() {
	}

	public static void main(String[] args) {

		TextBook eb1 = new EBook ();
		TextBook pb1 = new PaperBackText ();
		TextBook eb2 = new EBook ("Don Quixote", "Miguel De Cervantes", "1987", "Fiction", 32.50f);
		TextBook pb2 = new PaperBackText ("Pilgrim's Progress", "John Bunyan", "1933", "Fiction", 17.22f);
		TextBook eb3 = new EBook ("Robinson Crusoe","Daniel Defoe" , "1977", "Fiction", 18.33f);
		TextBook pb3 = new PaperBackText ("Gulliver's Travels", "Jonathan Swift ", "1952", "Fiction", 19.55f);

		
		
		System.out.println( "JSON:");
		System.out.println( eb1.toString());
		System.out.println( pb1.toString());
		System.out.println( eb2.toString());
		System.out.println(  pb2.toString());
		System.out.println( eb3.toString());
		System.out.println( pb3.toString());
		System.out.println( "");
		
		System.out.println( "Registration IDs:");
		for (int i = 0; i < PaperBackText.IDs.size(); i++) {
			System.out.println( PaperBackText.IDs.get(i));
		}
		System.out.println( "");
		
		System.out.println( "ISBNs:");
		for (int i = 0; i < TextBook.ISBNs.size(); i++) {
			System.out.println( TextBook.ISBNs.get(i));
		}
		
		

		
		
	}

}
