package com.alienexplorer.app.rest.Controller;

import com.alienexplorer.app.rest.Model.Task;
import com.alienexplorer.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/")
    public String holaMundo(){
        return "Hola mundo";
    }

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }

    @PostMapping(value = "/savetasks")
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "Saved task";
    }


    @PutMapping(value = "/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTittle(task.getTittle());
        updatedTask.setSubtittle(task.getSubtittle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return "Updated Task";
    }


    @DeleteMapping(value = "/delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deleteTask = todoRepository.findById(id).get();
        todoRepository.delete(deleteTask);
        return "Deleted Task";
    }



    }
