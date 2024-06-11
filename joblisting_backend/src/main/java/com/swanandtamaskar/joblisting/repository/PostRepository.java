package com.swanandtamaskar.joblisting.repository;

import com.swanandtamaskar.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String>
{

}
