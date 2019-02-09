package fi.haagahelia.bookStore_.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia.bookStore_.domain.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	@RequestMapping("/booklist")
	public String bookList(Model model) {
		model.addAttribute("books",repository.findAll());
		return "booklist";
	}
}
