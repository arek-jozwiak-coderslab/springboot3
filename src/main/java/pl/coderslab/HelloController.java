package pl.coderslab;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HelloController {

    private final BookRepository bookRepository;

    public HelloController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/")
    public String hi(){

        Book book = new Book();
        book.getTitle();

        Book build = Book.builder()
                .title("Thinking in Java")
                .description("long book about java")
                .build();
        bookRepository.save(build);

        log.info("book title {}", book.getTitle());

        return "test";
    }
}
