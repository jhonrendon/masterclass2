/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.web;


import co.usa.ciclo3.ciclo3.model.Reservations;

import co.usa.ciclo3.ciclo3.service.ReservationsService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jacke
 */
@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReservationsController {
    @Autowired
    private ReservationsService reservationsService;
    
    @GetMapping("/all")
    public List<Reservations> getReservations(){
        return reservationsService.getAll();
        
    }
    @GetMapping ("/{id}")
    public Optional<Reservations> getReservations(@PathVariable("id") int id){
        return reservationsService.getReservations(id);
    
    
    }
    
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservations save(@RequestBody Reservations c){
        return reservationsService.save(c);
    }
}

