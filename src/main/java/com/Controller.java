package com;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class Controller {
	private final static Logger LOG= Logger.getLogger("com.Controller");
	
	@GetMapping("holaMundo")
	public ResponseEntity<?> holaMundo() {
	   Map<String, Object> respuesta=new HashMap<>();
	   
	   System.out.println("HOLA");
	   LOG.info("Hola Mundo desde Spring Boot");
	   respuesta.put("respuesta", "Hola Mundo Desde Spring Boot - 202Accepted");
	   return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
}
