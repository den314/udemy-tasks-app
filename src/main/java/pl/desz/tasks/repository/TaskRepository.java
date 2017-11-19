package pl.desz.tasks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.desz.tasks.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    public Task findById(Long id);
}
