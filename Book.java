package bookCat;
import java.sql.Timestamp;

public class Book {	
	private Integer id;
	private String isbn;
	private String title;
	private String author;
	private String year_published;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setIsbn(String isbn) {
	   this.isbn = isbn;
	}
	public String getIsbn() {
	   return isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setYear_published(String year_published){
		this.year_published=year_published;
	}
	public String getYear_published(){
		return year_published;
	}
}
