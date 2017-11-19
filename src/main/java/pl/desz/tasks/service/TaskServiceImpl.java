package pl.desz.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.desz.tasks.domain.Task;
import pl.desz.tasks.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task create(Task task) {
        return taskRepository.save(task);
    }

    public Task findOne(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task update(Task newTask) {

        Task oldTask = taskRepository.findById(newTask.getId());

        if (null != oldTask) {
            oldTask.setId(newTask.getId());
            oldTask.setName(newTask.getName());
            oldTask.setCompleted(newTask.isCompleted());
            oldTask.setDueDate(newTask.getDueDate());
        }
        return taskRepository.save(oldTask);
    }

    @Override
    public void delete(Long id) {
        taskRepository.delete(id);
    }

    @Override
    public Task delete(Task task) {
        return null;
    }
}
