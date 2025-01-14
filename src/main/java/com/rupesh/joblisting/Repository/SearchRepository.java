package com.rupesh.joblisting.Repository;

import com.rupesh.joblisting.Model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
