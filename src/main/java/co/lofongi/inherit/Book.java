package co.lofongi.inherit;

public class Book {
	private String name;
	private String author;
	private int numOfPages;
	private float cost;
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", numOfPages=" + numOfPages + ", cost=" + cost + "]";
	}
}
