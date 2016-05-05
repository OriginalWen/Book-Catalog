package bookCat;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
public class BookMapper implements RowMapper<Book>{
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setId(rs.getInt("id"));
		book.setIsbn(rs.getString("isbn"));
	    book.setTitle(rs.getString("title"));
	    book.setAuthor(rs.getString("author"));
	    book.setYear_published(rs.getString("year_published"));
	    return book;
	}
}
