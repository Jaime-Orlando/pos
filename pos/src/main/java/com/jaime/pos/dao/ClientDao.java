package com.jaime.pos.dao;

import com.jaime.pos.model.ClientModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends CrudRepository<ClientModel, Integer>
{
    
}
