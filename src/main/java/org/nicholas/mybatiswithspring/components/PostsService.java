package org.nicholas.mybatiswithspring.components;

import org.nicholas.mybatiswithspring.mappers.PostMapper;
import org.nicholas.mybatiswithspring.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {
    @Autowired
    private PostMapper postMapper;

    public List<Post> findAll(){
        return postMapper.findAll();
    }

    public Post findById(int id){
        return postMapper.findById(id);
    }
}
