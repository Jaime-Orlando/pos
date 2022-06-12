package com.jaime.pos.service;

import com.jaime.pos.dao.ClientDao;
import com.jaime.pos.model.ClientModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements ClientServiceI {

    private final ClientDao clientDao;

    @Override
    public void save(ClientModel clientModel) {

    }

    @Override
    public List<ClientModel> findAll() {
        List<ClientModel> clients = new ArrayList<>();
        ClientModel client = new ClientModel();
        client.setId(1);
        client.setBirthdate(LocalDate.of(1999, 6, 25));
        client.setFirstName("Jaime");
        client.setLastName("López");
        client.setRfc("123456");
        client.setMiddleName("Orlando");
        client.setSex('M');
        clients.add(client);
        return clients;
    }

    @Override
    public ClientModel findBy(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClientModel update(ClientModel clientModel) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteBy(int id) {
        // TODO Auto-generated method stub
        return false;
    }


}
