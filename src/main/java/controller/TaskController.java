package controller;

import domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.TaskRepository;
import service.TaskService;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private TaskRepository taskRepository;

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
        taskRepository.save(new Task("raji", LocalDate.now(),true));
        return taskService.save(task);
    }

}
