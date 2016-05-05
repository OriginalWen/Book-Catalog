package bookCat;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Category_BookJDBCTemplate{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject; 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void addCategory(String book_id, String category_id) {
	    String SQL = "insert into Book_Category (book_id, category_id) values (?, ?)";     
	    jdbcTemplateObject.update( SQL, book_id, category_id);
	    System.out.println("Created Record book_id = " + book_id + " category_id = " + category_id);
	    return;
	}
	public void createCategory(String name, String description) {
	    String SQL = "insert into Category (name, description) values (?, ?)";     
	    jdbcTemplateObject.update( SQL, name, description);
	    System.out.println("Created Record Category: " + name);
	    return;
	}
}
