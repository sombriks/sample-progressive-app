package sample.progressive.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class TodoController {

    private final TodoService service;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index")
                .addObject("todos", service.listTodos());
    }
}
