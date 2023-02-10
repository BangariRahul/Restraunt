package com.example.Restraunt.controller;

import com.example.Restraunt.model.Restraunt;
import com.example.Restraunt.service.RestrauntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Restraunt")
public class RestrauntController {

    @Autowired RestrauntService restrauntService;
    @GetMapping("all")
    public List<Restraunt> all(){
        return restrauntService.allrestraunt();
    }
    @GetMapping("{name}")
    public Restraunt rest(@PathVariable String name){
        return restrauntService.rest(name);
    }
    @PostMapping("add")
    public String add(@RequestBody Restraunt rest){
        return restrauntService.add(rest);
    }
    @PutMapping("update/{name}")
    public String update(@PathVariable String name , @RequestBody Restraunt rest){
        return restrauntService.update(name, rest);
    }

    @GetMapping("delete/{name}")
    public String del(@PathVariable String name){
        return restrauntService.deleteRest(name);
    }
}
