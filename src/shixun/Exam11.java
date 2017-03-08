package shixun;
class Book{
	String name;
	String number;
	String anthor;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String number, String anthor) {
		super();
		this.name = name;
		this.number = number;
		this.anthor = anthor;
	}
	
	public void ShowBook(){
		System.out.println("书名"+this.name+" "+"编号"+this.number+" "+"作者"+this.anthor);
	}
}
class Reader{
	String name;
	String rNumber;
	Book []books;
	int top;
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader(String name, String rNumber, Object[] books) {
		this.name = name;
		this.rNumber = rNumber;
		books=new Book[5];
	}
public void RentBook(Book book){
	
}
}
public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
