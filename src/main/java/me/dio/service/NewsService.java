package me.dio.service;

import me.dio.domain.model.News;
import me.dio.service.exception.ItemCannotBeCreatedException;

public interface NewsService {
	News findById(long newsId, long userId);
	News create(News newsToCreate, long idUser) throws ItemCannotBeCreatedException;
}
