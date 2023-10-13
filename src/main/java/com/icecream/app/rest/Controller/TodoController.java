package com.icecream.app.rest.Controller;

import com.icecream.app.rest.Model.Task;
import com.icecream.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping
    public List <Task> getTasks(){
        return todoRepository.findAll();
    }
    @PostMapping
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "Save Task";
    }
    @PutMapping("/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updateTask = todoRepository.findById(id).get();
        updateTask.setFlavor(task.getFlavor());
        updateTask.setPrice(task.getPrice());
        todoRepository.save(updateTask);
        return "Update task";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deleteTask = todoRepository.findById(id).get();
        todoRepository.delete(deleteTask);
        return "Delete Task";
    }
}
