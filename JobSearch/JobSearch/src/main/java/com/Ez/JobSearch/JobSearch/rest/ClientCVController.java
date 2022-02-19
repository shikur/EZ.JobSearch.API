package com.Ez.JobSearch.JobSearch.rest;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Ez.JobSearch.JobSearch.Services.ClientServices;
import com.Ez.JobSearch.JobSearch.model.ClientCV;


@RestController
@RequestMapping("/api/v1")
public class ClientCVController {
		
    @Autowired
    private ClientServices _clientServices;
	 
    
    @PostMapping("/clientcv")
    public ClientCV create(@RequestBody ClientCV clientcv) {
    	
        return this._clientServices.insertClientCVData(clientcv);
       }
    
    @GetMapping("/allcvs")
    public List<ClientCV> getallListOfCvs() {
    	   	
        return this._clientServices.GetBClientCVData();
        }
    
    @GetMapping("/cvsId")
    public Optional<ClientCV> getCvsById(String id) {
    	   	
        return this._clientServices.GetClientCVDataByID(id);
        }
	}
