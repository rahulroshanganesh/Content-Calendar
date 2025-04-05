package com.example.Content.Calendar.controller;

import com.example.Content.Calendar.model.Content;
import com.example.Content.Calendar.repository.ContentCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.element.Element;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository contentRepo;

    public ContentController(ContentCollectionRepository contentRepo){
        this.contentRepo = contentRepo;
    }

    // make a request and find all the elements
    @RequestMapping("")
    public List<Content> findAll(){
        return contentRepo.findAll();
    }
}
