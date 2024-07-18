package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostRepositoryImplTest {

    @Test

    void testThatPostListIsEmpty(){

        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        assertEquals(0, postRepository.count());

    }

    @Test

    void testThatPostCanBeSaved() {
        PostRepositoryImpl postRepository = new PostRepositoryImpl();
        postRepository.save(new Post());
        assertEquals(postRepository.count(),1);

    }

   @Test
    void findById() {


    }

    @Test
    void deleteById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void count()
    }
}