package bookCat;
import java.util.List;
import javax.sql.DataSource;

public interface BookDAO {
	/** 
	    * This is the method to be used to initialize
	    * database resources 
	    */
	public void setDataSource(DataSource dataSource);
	
	/** 
	    * This is the method to be used to create
	    * a record in the Book table.
	    */
	public void create(String isbn, String title, String author, String year_published);
	
	/** 
	    * This is the method to be used to list down
	    * a record from the Book table corresponding
	    * to a passed Book id.
	    */
	public Book getBook(Integer id);
	
	/** 
	    * This is the method to be used to list down
	    * all the records from the Book table.
	    */
	public List<Book> listBooks();
	
	/** 
	    * This is the method to be used to delete
	    * a record from the Book table corresponding
	    * to a recalled Book id.
	    */
	public void delete(Integer id);
	
	/** 
	    * This is the method to be used to update
	    * a record into the Book table.
	    */
	public void update(Integer id, String title);
}
