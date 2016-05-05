package bookCat;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bookCat.BookJDBCTemplate;
public class MainApp {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      BookJDBCTemplate bookJDBCTemplate =(BookJDBCTemplate)context.getBean("bookJDBCTemplate");    
	      System.out.println("------New Books Records Creation--------" );
	      bookJDBCTemplate.create("N12345", "HungerGame", "Suzanne Collins", "2007-09-01");
	      bookJDBCTemplate.create("N12346", "HungerGame2", "Suzanne Collins", "2010-05-06");
	      //bookJDBCTemplate.delete(1);
	      System.out.println(bookJDBCTemplate.getBook(1).getTitle());
	      System.out.println("------Listing Multiple Records--------" );
	      List<Book> books = bookJDBCTemplate.listBooks();
	      for (Book record : books) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Title : " + record.getTitle() );
	         System.out.println(", Author : " + record.getAuthor());
	      }
	      
	      Category_BookJDBCTemplate category_BookJDBCTemplate =(Category_BookJDBCTemplate)context.getBean("category_BookJDBCTemplate");
	      category_BookJDBCTemplate.createCategory("fiction","science fiction");
	      category_BookJDBCTemplate.createCategory("horror","ghost stories");
	      category_BookJDBCTemplate.addCategory("1","1");
	      category_BookJDBCTemplate.addCategory("1","2");
	      
	      books=bookJDBCTemplate.findBookByTitle("HungerGame");
	      System.out.print("The id of books titled as HungerGame are: ");
	      for (Book record : books) {
	    	  System.out.print(record.getId()+", ");
	      }
	      System.out.println(" ");
	      System.out.println("The id of book has isbn as n235767 is "+bookJDBCTemplate.findBookByIsbn("n235767").getId());
	      books=bookJDBCTemplate.findBookByAuthor("Suzanne Collins");
	      System.out.print("Author Suzanne Collins published following books: ");
	      for (Book record : books) {
	    	  System.out.print(record.getId()+", ");
	      }
	      System.out.println(" ");
	}

}
