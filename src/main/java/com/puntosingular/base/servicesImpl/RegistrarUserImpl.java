package com.puntosingular.base.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntosingular.base.models.User;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.RegistarUserService;
@Service

public class RegistrarUserImpl implements RegistarUserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public String registrar(User user) {
		User savedUser=userRepository.save(user);
	    	   if(savedUser!=null) {
	   	    	return "Usuario con el id: "+savedUser.getId()+" Guardado";
	   	    }
	   	    else {
	   			return "Fallo! Usuario no guardado";

	   	    }
	    }
	    
			
	}
	


