/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Client;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.usa.ciclo3.ciclo3.repository.crud.ClientCrudRepository;

/**
 *
 * @author jacke
 */
@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    
    public List<Client> getAll(){
        return (List<Client>)clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(int idClient){
        return clientCrudRepository.findById(idClient);
    }
    public Client save(Client p){
        return clientCrudRepository.save(p);
    }
}
