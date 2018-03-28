import java.util.ArrayList;
import java.util.Random;

public abstract class TextBook {

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getISBNNumber() {
		return ISBNNumber;
	}

	public void setISBNNumber(String iSBNNumber) {
		ISBNNumber = iSBNNumber;
	}

	public String getEdition() {
		return Edition;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public String getPublishedYear() {
		return PublishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		PublishedYear = publishedYear;
	}

	public String getDiscipline() {
		return Discipline;
	}

	public void setDiscipline(String discipline) {
		Discipline = discipline;
	}

	public float getBaseprice() {
		return Baseprice;
	}

	public void setBaseprice(float baseprice) {
		Baseprice = baseprice;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String	Name ;
	public String	Author;
	public String	Edition;
	public String	PublishedYear; 
	public String	Discipline;
	public float	Baseprice;
	public String	Publisher;
	public String	ISBNNumber;
	
public TextBook () {
		this.Name = "Nameless";
		this.Author = "John Doe";
		this.PublishedYear = "1901";
		this.Discipline = "Unknown";
		this.Baseprice = 0.0f;
		CreateISBN ();
	}
	
public TextBook (String name, String author, String publishedYear, String discipline, float basePrice ) {
		this.Name = name;
		this.Author = author;
		this.PublishedYear = publishedYear;
		this.Discipline = discipline;
		this.Baseprice = basePrice;
		CreateISBN ();
		
	}
public static ArrayList<String> ISBNs = new ArrayList <String>();
private void CreateISBN () {
	StringBuilder sb = new StringBuilder();
	boolean validated = false;
	
	while (!validated) {
		//XXXXX-AA		
		Random random = new Random();
		int num = random.nextInt(100000);
		String strXXXXX = String.format("%05d", num); 
		//XXXXX
		sb.append(strXXXXX);
		//-
		sb.append("-");	
		//A
		sb.append(this.Author.charAt(0));
		if (Character.isDigit(this.Name.charAt(0))) {
			//A
			sb.append("X");
		}
		else {
			//A
			sb.append(this.Name.charAt(0));
		}
		
		boolean isDuplicate = false;
		
		for (int i = 0; i < TextBook.ISBNs.size(); i++) {
			if (TextBook.ISBNs.get(i)==sb.toString()) {
				isDuplicate = true;
				break;
			}
		}
		if (!isDuplicate) {
			validated = true;
			this.setISBNNumber(sb.toString());
			TextBook.ISBNs.add(this.ISBNNumber);
			
		}
		
	}

		
		
}
@Override
public String toString() {
	return String.format("{Author:%s,Name:%s,Discipline:%s,"
			+ "Edition:%s,ISBNNumber:%s,PublishedYear:%s,"
			+ "Publisher:%s,Baseprice:$%.2f}", 
			this.getAuthor(), this.getName(), this.getDiscipline(), 
			this.getEdition(), this.getISBNNumber(), this.getPublishedYear(), 
			this.getPublisher(), this.getBaseprice());
 }
	
	


}
