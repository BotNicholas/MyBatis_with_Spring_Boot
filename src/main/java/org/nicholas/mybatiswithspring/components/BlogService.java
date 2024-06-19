package org.nicholas.mybatiswithspring.components;

import org.nicholas.mybatiswithspring.mappers.BlogMapper;
import org.nicholas.mybatiswithspring.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogMapper blogMapper;

    public List<Blog> findAll() {
        return blogMapper.findAll();
    }

    public Blog findById(int id) {
        return blogMapper.findById(id);
    }
}
