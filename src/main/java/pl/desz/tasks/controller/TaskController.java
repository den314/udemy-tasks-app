package pl.desz.tasks.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.desz.tasks.domain.Task;
import pl.desz.tasks.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public Iterable<Task> getAll() {
        return taskService.findAll();
    }

    @PutMapping
    public Task update(@RequestBody Task task) {
        return taskService.update(task);
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.create(task);
    }

    @DeleteMapping("/{id")
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }
}
