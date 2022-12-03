package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

  // najdi posty, které mají:
  //    * datum publikace
  //    * není v budoucnosti
  //    * seřadí sestupně podle data publikace

  Page<Post> findByPublishedBeforeOrderByPublishedDesc(LocalDate published, Pageable pageable);

  Post findBySlug(String slug);
}
