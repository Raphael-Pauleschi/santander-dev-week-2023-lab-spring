package me.dio.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.News;
import me.dio.domain.model.dto.NewsDTO;
import me.dio.service.NewsService;
import me.dio.service.exception.ItemCannotBeCreatedException;

@RestController
@RequestMapping("/news")
public class NewsController {
	private final NewsService newsService;
	
	public NewsController(NewsService newsService) {
		this.newsService= newsService;
	}
	
	@PostMapping("/{userId}")
	 public ResponseEntity<News> create(@RequestBody NewsDTO newsToCreate, @PathVariable long userId) {
		 News newsCreated;
		try {
			newsCreated = newsService.create(newsToCreate.toModel(), userId);
			 URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			         .path("/{id}")
			                .buildAndExpand(newsCreated.getId())
			                .toUri();
			   return ResponseEntity.created(location).body(newsCreated);
		} catch (ItemCannotBeCreatedException e) {
			
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
		
	 }
	
	@GetMapping("/{userId}/{newsId}")
	public ResponseEntity<News> findById(@PathVariable long newsId, @PathVariable long userId ){
		var news = newsService.findById(newsId, userId);
		return ResponseEntity.ok(news);
		
	}
	

}
