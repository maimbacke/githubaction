package com.groupeisi.githubaction;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "githubaction", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {
  @GetMapping
    public List<Object> search(){
        return List.of(new githubaction( 1,  "belle formation", 1));
    }
}
