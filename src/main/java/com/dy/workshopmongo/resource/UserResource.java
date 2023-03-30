package com.dy.workshopmongo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dy.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria de Fatima", "mf@gmail.com");
		User dyeggo = new User("2", "Dyeddo Bezerra", "db@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,dyeggo));
		return ResponseEntity.ok().body(list);
	}
}
