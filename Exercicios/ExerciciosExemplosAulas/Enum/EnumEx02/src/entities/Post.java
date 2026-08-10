package entities;

import java.time.Instant;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Post {
    private Instant moment;
    private String title;
    String content;
    Integer likes;

    List<Comment> commentList = new ArrayList<>();
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

    public Post() {
    }

    public Post(Instant moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.content = content;
        this.title = title;
        this.likes = likes;
    }

    public void addComment(Comment comment){
        commentList.add(comment);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append(title).append("\n");
        sb.append(likes).append(" Likes - ");

        sb.append(fmt.format(moment)).append("\n");

        sb.append(content).append("\n");
        sb.append("Comments:\n");

        for (Comment c : commentList) {
            sb.append(c.getText()).append("\n");
        }

        return sb.toString();
    }
}
