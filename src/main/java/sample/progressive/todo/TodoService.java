package sample.progressive.todo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository repository;

    public List<Todo> listTodos() {
        return repository.findAll();
    }

    public Todo save(Todo todo) {
        if (todo.getCriadoEm() == null) todo.setCriadoEm(LocalDateTime.now());
        todo.setAtualizadoEm(LocalDateTime.now());
        return repository.save(todo);
    }

    public void removeTodo(Long id) {
        repository.deleteById(id);
    }
}
