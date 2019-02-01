package fi.haagahelia.bookStore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
@RequestMapping("/index")
public String greeting(Model model) {
	
	return "bookstore";
	

}
}
