package bookCat;
import java.sql.Timestamp;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookJDBCTemplate implements BookDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String isbn, String title, String author, String year_published) {
	    String SQL = "insert into Book (isbn, title, author, year_published) values (?, ?, ?, ?)";     
	    jdbcTemplateObject.update( SQL, isbn, title, author, year_published);
	    System.out.println("Created Record Title = " + title + " author = " + author);
	    return;
	}
	public Book getBook(Integer id) {
	    String SQL = "select * from Book where id = ?";
	    Book book = jdbcTemplateObject.queryForObject(SQL,new Object[]{id}, new BookMapper());
	    return book;
	}
	public List<Book> listBooks() {
	    String SQL = "select * from Book";
	    List <Book> books = jdbcTemplateObject.query(SQL, new BookMapper());
	    return books;
	}
	public void delete(Integer id){
	    String SQL = "delete from Book where id = ?";
	    jdbcTemplateObject.update(SQL, id);
	    System.out.println("Deleted Record with ID = " + id );
	    return;
	}
	public void update(Integer id, String title){
	    String SQL = "update Book set title = ? where id = ?";
	    jdbcTemplateObject.update(SQL, title, id);
	    System.out.println("Updated Record with ID = " + id );
	    return;
	}
	public Book findBookByIsbn(String isbn){
		String SQL = "select * from Book where isbn = ?";
		Book book = jdbcTemplateObject.queryForObject(SQL, new Object[]{isbn},new BookMapper());
		return book;
	}
	public List<Book> findBookByTitle(String title){
		String SQL = "select * from Book where title = ?";
		List <Book> books = jdbcTemplateObject.query(SQL, new Object[]{title},new BookMapper());
		return books;
	}
	public List<Book> findBookByAuthor(String author){
		String SQL = "select * from Book where author = ?";
		List<Book> books = jdbcTemplateObject.query(SQL, new Object[]{author},new BookMapper());
		return books;
	}
}
