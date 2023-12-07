package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("book", new Book());
        return "book/add";
    }
    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "book/list";
    }
}
