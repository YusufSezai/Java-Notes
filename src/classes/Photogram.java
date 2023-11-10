package classes;


import java.util.ArrayList;

class Post {
    String username;
    int userId;
    String media;
    String avatar;
    String commentButton;
    int likes;
    String caption;
    ArrayList<String> comments;
    String likeButton;

    Post(String un, int ui, String m, String a, String cb, int l, String ca, ArrayList<String> co, String lb) {
        username = un;
        userId = ui;
        media = m;
        avatar = a;
        commentButton = cb;
        likes = l;
        caption = ca;
        comments = co;
        likeButton = lb;
    }
}


public class Photogram {
    public static void main(String[] args) {
        String username = "Sally_17";
        int userId = 112010;
        String media = "C:\\Users\\PC\\Desktop\\photogram\\kid.jpg";
        String avatar = "C:\\Users\\PC\\Desktop\\photogram\\couple.jpg";
        String commentButton = "C:\\Users\\PC\\Desktop\\photogram\\comments.jpg";
        String caption = "First time at Yosemite. It has surpassed all of my expectations.";
        int likes = 23;
        ArrayList<String> comments = new ArrayList<String>();
        comments.add("Beautiful!");
        comments.add("I wish I was there too.");
        comments.add("Is that Nevada Falls?");
        comments.add("Love it!");
        comments.add("Can't wait for the Halfdome pictures");
        comments.add("More pics please");
        String likeButton = "studentFolder/photogram/likesIcon.png";

        Post post1 = new Post(username, userId, media, avatar,
                commentButton, likes, caption,
                comments, likeButton);

    }

}
