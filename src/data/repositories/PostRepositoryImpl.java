package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {

    private List<Post> posts = new ArrayList<>();
    private int id = 1;

    @Override
    public Post save(Post post) {
        post.setId(generateId());
        posts.add(post);
        return post;
    }

    private int generateId() {
        return this.id++;
    }

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long count() {
        return posts.size();
    }
}
