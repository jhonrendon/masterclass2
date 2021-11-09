/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.repository.crud;


import co.usa.ciclo3.ciclo3.model.Reservations;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacke
 */
@Repository
public class ReservationsRepository {
    
    @Autowired
    private ReservationsCrudRepository reservationsCrudRepository;
    
    public List<Reservations> getAll(){
        return (List<Reservations>)reservationsCrudRepository.findAll();
    }
    public Optional<Reservations> getReservations(int id){
        return reservationsCrudRepository.findById(id);
    }
    public Reservations save(Reservations p){
        return reservationsCrudRepository.save(p);
    }
}    

