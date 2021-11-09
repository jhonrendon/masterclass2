/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Message;
import co.usa.ciclo3.ciclo3.repository.crud.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacke
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    public List<Message>getAll(){
        return messageRepository.getAll();
    }
    public Optional<Message> getMessage(int id){
        return messageRepository.getMessage(id);
    }
    public Message save (Message p){
        if (p.getIdMessage()==null){
            return messageRepository.save(p);
        }else{
            Optional<Message> paux=messageRepository.getMessage(p.getIdMessage());
            if(paux.equals(p)){
                return messageRepository.save(p);
            }else{
                return p;
            }
        }
    }

    
}

