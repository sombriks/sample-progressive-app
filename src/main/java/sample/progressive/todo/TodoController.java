package sample.progressive.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class TodoController {

    private final TodoService service;

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index")
                .addObject("todos", service.listTodos());
    }

    @PostMapping("save")
    public ModelAndView save(Todo todo) {
        service.save(todo);
        return new ModelAndView("index")
                .addObject("todos", service.listTodos());
    }

    @PostMapping
    public ModelAndView done(Long id) {
        service.removeTodo(id);
        return new ModelAndView("index")
                .addObject("todos", service.listTodos());
    }
}
