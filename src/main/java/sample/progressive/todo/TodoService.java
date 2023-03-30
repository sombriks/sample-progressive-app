package sample.progressive.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository repository;

    public List<Todo> listTodos() {
        return repository.findAll();
    }
}
