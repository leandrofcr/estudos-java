package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's is awesome!");
        Post post1 = new Post(
                sdf.parse("15/04/2024 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to  visit this wonderful country!",
                12);

        post1.addComment(comment1);
        post1.addComment(comment2);


        Comment comment3 = new Comment("Good night!");
        Comment comment4 = new Comment("May the Force be with you!");
        Post post2 = new Post(
                sdf.parse("15/04/2024 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post1);
        System.out.println("----------------------------");
        System.out.println(post2);


    }
}
