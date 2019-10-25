package by.iba.controllers;

import by.iba.entity.SystemObject;
import by.iba.entity.SystemObject;
import by.iba.service.SystemObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/")
public class Controller{

    private  SystemObjectService objectService;

    public Controller() {

    }

    @Autowired
    public Controller(SystemObjectService objectService) {
        this.objectService = objectService;
    }



    @CrossOrigin(origins = "*")
    @GetMapping(value = "subsystems")
    public ResponseEntity<List<SystemObject>> getSystemObjects(){

       // return  ResponseEntity.ok(systemObjectService.getAll());
        return ResponseEntity.ok(objectService.getAll());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "subsystems")
    public ResponseEntity<SystemObject> postSystemObject(@RequestBody SystemObject object){
        objectService.add(object);
        return ResponseEntity.ok(object);
    }


}
