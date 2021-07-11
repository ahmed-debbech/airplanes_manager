package com.ahmeddebbech.airplanesmanagerback.services;

import com.ahmeddebbech.airplanesmanagerback.models.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneServiceInterface extends JpaRepository<Airplane, Integer> {

}
