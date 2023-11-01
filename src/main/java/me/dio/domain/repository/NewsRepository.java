package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News,Long> {
	@Query(value = "SELECT n.* " +
            "FROM tb_news n " +
            "JOIN tb_user_news un ON n.id = un.news_id " +
            "JOIN tb_user u ON u.id = un.tb_user_id " +
            "WHERE n.id = ?1 AND u.id = ?2", nativeQuery = true)
	News findByIdAndUserId(Long newsId, Long userId);
	
	@Modifying
	@Query(value="INSERT INTO tb_user_news (news_id, tb_user_id) VALUES (:newsId, :userId)", nativeQuery = true)
	void insertUserNews(@Param("newsId") Long newsId, @Param("userId") Long userId);

}
