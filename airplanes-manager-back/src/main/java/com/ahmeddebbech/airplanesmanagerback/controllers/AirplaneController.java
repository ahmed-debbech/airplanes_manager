package com.ahmeddebbech.airplanesmanagerback.controllers;

import com.ahmeddebbech.airplanesmanagerback.models.Airplane;
import com.ahmeddebbech.airplanesmanagerback.services.AirplaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/airplane")
public class AirplaneController {
    private AirplaneService service;

    public AirplaneController(AirplaneService ser){
        this.service = ser;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Airplane>> getAll(){
        List<Airplane> list = this.service.getAll();
        return new ResponseEntity<List<Airplane>>(list, HttpStatus.valueOf(200));
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Airplane> getAll(@PathVariable("id") Integer id){
        //List<Airplane> list = this.service.getOne(id);
        //return new Res ponseEntity<Airplane>(list, HttpStatus.valueOf(200));
        return null;
    }
    @PostMapping("/add")
    public ResponseEntity<Airplane> add(@RequestBody Airplane air){
        Airplane i = this.service.addAirplane(air);
        return new ResponseEntity<Airplane>(i, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Airplane> update(@RequestBody Airplane air){
        Airplane i = this.service.update(air);
        return new ResponseEntity<Airplane>(i, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Airplane> delete(@PathVariable("id") Integer id){
        this.service.delete(id);
        return new ResponseEntity<Airplane>(HttpStatus.OK);
    }
}
