package pl.desz.tasks.service;

import pl.desz.tasks.domain.Task;

public interface TaskService {

    public Task create(Task task);
    public Task findOne(Long id);
    public Iterable<Task> findAll();
    public Task update(Task task);
    public void delete(Long id);
    public Task delete(Task task);
}
