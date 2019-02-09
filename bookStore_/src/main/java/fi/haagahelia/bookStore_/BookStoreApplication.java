package fi.haagahelia.bookStore_;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.bookStore_.domain.Book;
import fi.haagahelia.bookStore_.domain.BookRepository;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
	@Bean 
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
		Book b1  = new Book("Con mua ngang qua","Son Tung MTP", 2015,12221, 12000);
		Book b2  = new Book("Lac Troi","Son Tung MTP", 2016,12222, 12000);
		Book b3  = new Book("CATENA","Toc Tien", 2018,12223, 12000);
		Book b4  = new Book("Noi nay co  em","Son Tung MTP", 2017,12224, 12000);
		
		repository.save(b1);
		repository.save(b2);
		repository.save(b3);
		repository.save(b4);
		};
		}

}

