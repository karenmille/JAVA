
public class EBook extends TextBook {

	public EBook() {
		super ();
		this.AccessCode = this.ISBNNumber;
		this.AccessYears = 1;
	}
	
	public EBook (String name, String author, String publishedYear, String discipline, float basePrice ) {
		super ( name,  author,  publishedYear,  discipline,  basePrice );
		this.AccessCode = this.ISBNNumber;
		this.AccessYears = 1;
	}
	
	private String AccessCode ;
	private Integer AccessYears;
	
	public Integer getAccessYears() {
		return AccessYears;
	}

	public void setAccessYears(Integer accessYears) {
		AccessYears = accessYears;
	}
	
	public float getPrice () {
		
		float price;
		
		if (this.AccessYears > 5) {
			price = this.Baseprice * 5;
		}
		else {
			price = this.Baseprice * this.AccessYears;
		}
		
		return price;
		
	}
	@Override
	public String toString() {
		return String.format("{Author:%s,Name:%s,Discipline:%s,"
				+ "Edition:%s,ISBNNumber:%s,PublishedYear:%s,"
				+ "Publisher:%s,Baseprice:$%.2f,AccessYears:%d,"
				+ "AccessCode:%s,Price:$%.2f}", 
				this.getAuthor(), this.getName(), this.getDiscipline(), 
				this.getEdition(), this.getISBNNumber(), this.getPublishedYear(), 
				this.getPublisher(), this.getBaseprice(), this.getAccessYears(),
				this.AccessCode, this.getPrice());
	 }


}
