package com.ahmeddebbech.airplanesmanagerback.services;

import com.ahmeddebbech.airplanesmanagerback.models.Airplane;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AirplaneService {
    private final AirplaneServiceInterface repo;

    public AirplaneService(AirplaneServiceInterface repo) {
        this.repo = repo;
    }
    public Airplane addAirplane(Airplane airplane){
        return repo.save(airplane);
    }
    public List<Airplane> getAll(){
        return repo.findAll();
    }
    public Airplane update(Airplane a){
        return this.repo.save(a);
    }
    public void delete(Integer id){
        this.repo.deleteById(id);
    }
}
