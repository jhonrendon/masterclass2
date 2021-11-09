/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Reservations;
import co.usa.ciclo3.ciclo3.repository.crud.ReservationsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacke
 */
@Service
public class ReservationsService {
    @Autowired
    private ReservationsRepository reservationsRepository;
    public List<Reservations>getAll(){
        return reservationsRepository.getAll();
    }
    public Optional<Reservations> getReservations(int id){
        return reservationsRepository.getReservations(id);
    }
    public Reservations save (Reservations p){
        if (p.getId()==null){
            return reservationsRepository.save(p);
        }else{
            Optional<Reservations> paux=reservationsRepository.getReservations(p.getId());
            if(paux.equals(p)){
                return reservationsRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}

