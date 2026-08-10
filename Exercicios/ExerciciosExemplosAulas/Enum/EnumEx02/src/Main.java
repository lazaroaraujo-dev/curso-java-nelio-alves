import entities.Comment;
import entities.Post;

import java.io.PipedOutputStream;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome!");

        Instant momento = Instant.parse("2028-06-21T13:05:44Z");


        Post post = new Post(momento, "Traveling to new Zealand", "I'm going to visit this wonderful country", 12);
        post.addComment(comment1);
        post.addComment(comment2);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the Force be with you");

        Instant momento2 = Instant.parse("2018-07-28T23:14:19Z");
        Post post1 = new Post(momento2,"Good night guys", "See you tomorrow", 5);

        post1.addComment(comment3);
        post1.addComment(comment4);

        System.out.println(post);
        System.out.println(post1);

    }
}