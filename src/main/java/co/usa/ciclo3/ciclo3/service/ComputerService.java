/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Computer;
import co.usa.ciclo3.ciclo3.repository.ComputerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacke
 */
@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;
    public List<Computer>getAll(){
        return computerRepository.getAll();
    }
    public Optional<Computer> getComputer(int id){
        return computerRepository.getComputer(id);
    }
    public Computer save (Computer p){
        if (p.getId()==null){
            return computerRepository.save(p);
        }else{
            Optional<Computer> paux=computerRepository.getComputer(p.getId());
            if(paux.equals(p)){
                return computerRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}
