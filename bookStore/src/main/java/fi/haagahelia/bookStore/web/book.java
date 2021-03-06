package fi.haagahelia.bookStore.web;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {
@Id
@GeneratedValue(strategy=  GenerationType.AUTO)
private long Id;
private String title, author;

private long year, isbn;
private double price;
public book(String title, String author, long year, long isbn, double price) {

	this.title = title;
	this.author = author;
	this.year = year;
	this.isbn = isbn;
	this.price = price;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public long getYear() {
	return year;
}
public void setYear(long year) {
	this.year = year;
}
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
return "ISBN = " + isbn + ", title=" + title+ ",author= " + author;
}

	}


