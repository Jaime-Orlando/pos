package com.jaime.pos.dao;

import com.jaime.pos.model.ProviderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderDao extends CrudRepository<ProviderModel, Integer>
{

}
