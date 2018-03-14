package controller;

import domain.Task;
import org.springframework.web.bind.annotation.*;
import service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})

    public Iterable<Task> list(){
        return this.taskService.list();
    }

    /*using request body to post data from angular to springboot*/
    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){

        task.setId(1L);
        task.setName("Raji");
        task.setCompleted(true);
        return taskService.save(task);
    }

}
