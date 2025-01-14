package com.rupesh.joblisting.Repository;

import com.rupesh.joblisting.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
