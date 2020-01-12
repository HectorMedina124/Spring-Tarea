 package com.puntosingular.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.models.User;
import com.puntosingular.base.repository.UserRepository;
import com.puntosingular.base.services.RegistarUserService;
import com.puntosingular.base.services.UserService;
import com.puntosingular.base.servicesImpl.RegistrarUserImpl;

@RestController
@RequestMapping("/userR")


public class RegistroUserController {
	@Autowired
    RegistarUserService userService;
	
  @PostMapping("/guardar")
  public String guardarUsuario(@RequestBody User user) {
	  return userService.registrar(user);
	
}
}
