package com.jaime.pos.dao;

import com.jaime.pos.model.StoreModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StoreDao extends CrudRepository<StoreModel, Integer>
{
}
