import java.util.ArrayList;
import java.util.UUID;

public class PaperBackText extends TextBook{

	public PaperBackText() {
		super ();
		GenerateRegistration_ID ();
		MarkUpPercentage = 0.10f;
	}
	
	public PaperBackText (String name, String author, String publishedYear, String discipline, float basePrice ) {
		super ( name,  author,  publishedYear,  discipline,  basePrice );
		GenerateRegistration_ID ();
		MarkUpPercentage = 0.10f;
	}
	
	
	private String Registration_ID; 
	private float MarkUpPercentage;
	
	public float getMarkUpPercentage() {
		return MarkUpPercentage;
	}

	public void setMarkUpPercentage(float markUpPercentage) {
		MarkUpPercentage = markUpPercentage;
	}


	public static ArrayList<String> IDs = new ArrayList <String>();
	
	private void GenerateRegistration_ID () {
		boolean validated = false;
		
		while (!validated) {
		
			String ID = UUID.randomUUID().toString();
			boolean isDuplicate = false;
			
			for (int i = 0; i < PaperBackText.IDs.size(); i++) {
				if (PaperBackText.IDs.get(i)==ID) {
					isDuplicate = true;
					break;
				}
			}
			
			if (!isDuplicate) {
				validated = true;
				this.Registration_ID = ID;
				PaperBackText.IDs.add(this.Registration_ID);
				
			}
		}
		
		
		
		
	}
@Override
	public String toString() {
		return String.format("{Author:%s,Name:%s,Discipline:%s,"
				+ "Edition:%s,ISBNNumber:%s,PublishedYear:%s,"
				+ "Publisher:%s,Baseprice:$%.2f,Registration_ID:%s,"
				+ "MarkUpPercentage:%.2f,Price:$%.2f}", 
				this.getAuthor(), this.getName(), this.getDiscipline(), 
				this.getEdition(), this.getISBNNumber(), this.getPublishedYear(), 
				this.getPublisher(), this.getBaseprice(), this.Registration_ID,
				this.getMarkUpPercentage(), this.getPrice());
	 }
	
	public float getPrice() {
		
		return (this.Baseprice * (1 + this.MarkUpPercentage));
	}
	

	

}