package com.ejemplo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ejemplo.demo.model.Usuario;
import com.ejemplo.demo.repository.UsuarioRepository;

@Controller
@RequestMapping(path="/api/v1/usuario")
public class MainController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	  @GetMapping(path="/getAll")
	  public @ResponseBody Iterable<Usuario> getAllUsers() {
		  return usuarioRepository.findAll();
	  }
	  
	  @DeleteMapping(path="/delete/{id}")
	  public void Delete(@PathVariable int id) {
		  usuarioRepository.deleteById(id); 
	  }
	  
	  @PutMapping(path="/modify/{id}")
	  public void Update(@PathVariable int id, @RequestBody Usuario usuario2) {
		 Usuario usuario = usuarioRepository.findById(id);
		 usuario.nombre = usuario2.nombre;
		 usuario.apellido  =usuario2.apellido;
		 usuarioRepository.saveAndFlush(usuario);
		 
	  }
	  
	  @PostMapping(path="/create")
	  public @ResponseBody String add (@RequestBody Usuario usuario) {
		    usuarioRepository.save(usuario);
		    return "El usuario ha sido añadido";
	  }
	  
	  
	  
	  
	  
}
	
