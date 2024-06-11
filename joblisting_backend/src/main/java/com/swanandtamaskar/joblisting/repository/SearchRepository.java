package com.swanandtamaskar.joblisting.repository;

import com.swanandtamaskar.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
