package com.Ez.JobSearch.JobSearch.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ez.JobSearch.JobSearch.Repositories.ClientCVRepository;
import com.Ez.JobSearch.JobSearch.Repositories.ClientcvDao;
import com.Ez.JobSearch.JobSearch.model.ClientCV;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class ClientServices {
	
	@Autowired
	ClientCVRepository clientCVRepository;

		
    public ClientCV insertClientCVData(ClientCV clientCV) {
        return this.clientCVRepository.save(clientCV);
    }
    
    public List<ClientCV> GetBClientCVData() {
        return this.clientCVRepository.findAll();
    }
   
    public Optional<ClientCV> GetClientCVDataByID(String id) {
        return this.clientCVRepository.findById(id);
    }
 

}
