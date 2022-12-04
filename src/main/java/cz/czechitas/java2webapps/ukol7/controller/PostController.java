package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

  @Autowired
  private final PostService postService;

  public PostController(PostService postService) {
    this.postService = postService;
  }

  // zobrazení úvodní stránky se seznamem postů
  @GetMapping("/")
  public ModelAndView listOfPosts(Pageable pageable) {
    return new ModelAndView("index")
      .addObject("posts", postService.list());
  }

  // zobrazení jednoho postu
@GetMapping("/post/{slug}")
  public ModelAndView onePost(@PathVariable String slug) {
  return new ModelAndView("post")
    .addObject("post", postService.singlePost(slug));
  }

}
