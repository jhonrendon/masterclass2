/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.service;


import co.usa.ciclo3.ciclo3.model.Client;
import co.usa.ciclo3.ciclo3.repository.ClientRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacke
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client>getAll(){
        return clientRepository.getAll();
    }
    public Optional<Client> getClient(int idClient){
        return clientRepository.getClient(idClient);
    }
    public Client save (Client p){
        if (p.getIdClient()==null){
            return clientRepository.save(p);
        }else{
            Optional<Client> paux=clientRepository.getClient(p.getIdClient());
            if(paux.equals(p)){
                return clientRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}

