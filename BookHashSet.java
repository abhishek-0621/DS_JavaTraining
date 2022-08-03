/*
Assignments:
1. Association story
2. Book class add book prize, book author, book number, edition, no. of pages
3. Innovate comparator interface with your uniquely designed object.
4. Innovate Tree Map example
5. Serialize Book with Hash set 
collections.sort(ArrayList)


 */
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

public class BookHashSet {
	public static void main(String[] args) {

		Book book1 = new Book("Java","Aikansh",400,2,2100,31231);
		Book book2 = new Book("Java","Kuldeep",99,3,1100,31312);
		Book book3 = new Book("Java","Abhishek",99,3,1100,31312);
		Book book4 = new Book("Java","Abhishek",99,3,1100,31312);
		
		System.out.println("book1 : "+book1);
		System.out.println("book2 : "+book2);
		System.out.println("book3 : "+book3);

		System.out.println("----");
		
		System.out.println("book1 : "+book1.hashCode());
		System.out.println("book2 : "+book2.hashCode());
		System.out.println("book3 : "+book3.hashCode());
		System.out.println("book4 : "+book4.hashCode());

		
		HashSet<Book> bookShelf = new HashSet<Book>();
		
		System.out.println("Adding book1 ");
		bookShelf.add(book1);
		
		System.out.println("Adding book2 ");
		bookShelf.add(book2);

		System.out.println("Adding book3 ");
		bookShelf.add(book3);
		
		System.out.println("Adding book3 ");
		bookShelf.add(book4);
			
		
		for (Book book : bookShelf) {
			System.out.println("The Book : "+book);
		}
	}
}

class Book implements Serializable
{
	String title;
	String author;
	int prize;
	private int editionNo;
	int noOfPages;
	int bookNo;


	public Book(String title, String author, int prize, int editionNo, int noOfPages, int bookNo) {
		super();
		this.title = title;
		this.author = author;
		this.prize = prize;
		this.editionNo = editionNo;
		this.noOfPages = noOfPages;
		this.bookNo = bookNo;
	}
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", prize=" + prize + ", editionNo=" + editionNo
				+ ", noOfPages=" + noOfPages + ", bookNo=" + bookNo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, bookNo, editionNo, noOfPages, prize, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookNo == other.bookNo && editionNo == other.editionNo
				&& noOfPages == other.noOfPages && prize == other.prize && Objects.equals(title, other.title);
	}
	
	
}
