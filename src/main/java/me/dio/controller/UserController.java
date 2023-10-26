package me.dio.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import me.dio.domain.model.User;
import me.dio.domain.model.dto.UserDTO;
import me.dio.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	@Operation(summary = "Get all users", description = "Retrieve a list of users")
	@ApiResponses(value = { 
	           @ApiResponse(responseCode = "200", description = "Operation successful")
	    })
	public ResponseEntity<List<User>> findAll(){
		List<User> users = userService.FindAll();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "Get a user by ID", description = "Retrieve a user")
	@ApiResponses(value = { 
	           @ApiResponse(responseCode = "200", description = "Operation successful"),
	           @ApiResponse(responseCode = "404", description = "User not found")
	})
	public ResponseEntity<User> findById(@PathVariable long id){
		var user = userService.findById(id);
		return ResponseEntity.ok(user);
	}
	
	 @PostMapping
	 @Operation(summary = "Create a new user", description = "Create a new user an retrieve its data")
	 @ApiResponses(value = { 
	            @ApiResponse(responseCode = "201", description = "User created successfully"),
	            @ApiResponse(responseCode = "422", description = "Invalid user data provided")
	    })
	 public ResponseEntity<User> create(@RequestBody UserDTO userToCreate) {
		 var userCreated = userService.create(userToCreate.toModel());
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest()
	         .path("/{id}")
	                .buildAndExpand(userCreated.getId())
	                .toUri();
	   return ResponseEntity.created(location).body(userCreated);
	 }
	 
	 @PutMapping("/{id}")
	 @Operation(summary = "Edit a user", description = "Update the data of an existing user")
	 @ApiResponses(value = { 
	            @ApiResponse(responseCode = "200", description = "User updated successfully"),
	            @ApiResponse(responseCode = "404", description = "User not found"),
	            @ApiResponse(responseCode = "422", description = "Invalid user data provided")
	    })
	 public ResponseEntity<User> update(@PathVariable long id, @RequestBody UserDTO userChanges){
		 var user = userService.update(id, userChanges);
		 
		 
		 return ResponseEntity.ok(user);
	 }
	 
	 @DeleteMapping("/{id}")
	 @Operation(summary = "Delete a user", description = "Delete an existing user")
	 @ApiResponses(value = { 
	            @ApiResponse(responseCode = "204", description = "User deleted successfully"),
	            @ApiResponse(responseCode = "404", description = "User not found")
	    })
	 public ResponseEntity<Void> deleteById(@PathVariable long id){
		 userService.delete(id);
		 return ResponseEntity.noContent().build();
	 }
	 
	 
}