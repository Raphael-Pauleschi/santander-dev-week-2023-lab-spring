package me.dio.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.dio.domain.model.News;
import me.dio.domain.model.User;
import me.dio.domain.repository.NewsRepository;
import me.dio.domain.repository.UserRepository;
import me.dio.service.NewsService;
import me.dio.service.exception.ItemCannotBeCreatedException;

@Service
public class NewsServiceImpl implements NewsService {
	private final NewsRepository newsRepository;
	private final UserRepository userRepository;
	
	public NewsServiceImpl(UserRepository userRepository, NewsRepository newsRepository) {
		this.newsRepository = newsRepository;
		this.userRepository = userRepository;
	}
	
	@Override
	@Transactional(readOnly = true)
	public News create(News newsToCreate, long idUser)throws ItemCannotBeCreatedException {
	User user = userRepository.findById(idUser).get();
	if (user != null) {
		user.getNews().add(newsToCreate);

		userRepository.save(user);
		newsRepository.insertUserNews(newsToCreate.getId(), idUser);
		return newsRepository.save(newsToCreate);
	}
	
	throw new ItemCannotBeCreatedException("News");
}

	@Override
	@Transactional(readOnly = true)
	public News findById(long newsId, long userId) {
		if(userRepository.findById(userId).get() != null) {
			if(newsRepository.existsById(newsId)) {
				return newsRepository.findByIdAndUserId(newsId, userId);
				
			}
		}
		//bota exception depois
		return null;
	}
}
