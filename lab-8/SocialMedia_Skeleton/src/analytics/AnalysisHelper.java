/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author harshalneelkamal
 */

import data.DataStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String BLUE= "\u001B[34m";
    final String Magenta="\u001B[35m";
        
        System.out.println(Magenta+ "Q1- Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    public void getMaxLikeCommentPost(){
        DataStore data= DataStore.getInstance();
        Comment commentWithMaxLikes= null;
        
        for (Comment c: data.getComments().values()){
            if(commentWithMaxLikes == null){
                commentWithMaxLikes= c;
            }
            if(c.getLikes()> commentWithMaxLikes.getLikes()){
                commentWithMaxLikes= c;
                
            }
        }
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String BLUE= "\u001B[34m";
    final String Magenta="\u001B[35m";
        int postId = commentWithMaxLikes.getPostId();
    
         System.out.println(RED+ "Q2- post with most likes per comment"+ data.getPosts().get(postId).getPostId());
    }
    public void getPostWithMostComments(){
        DataStore data= DataStore.getInstance();
        Post postWithMostComments= null;
        
        for (Post p: data.getPosts().values()){
            if(postWithMostComments == null){
                postWithMostComments= p;
            }
            if(p.getComments().size()> postWithMostComments.getComments().size()){
                postWithMostComments= p;
                
            }
        }
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String BLUE= "\u001B[34m";
        System.out.println(BLUE+ "Q3- post with most comments" + postWithMostComments.getPostId());
    }
    
    public void getPassiveUsers(){
        DataStore data = DataStore.getInstance();
        HashMap<Integer, Integer> postNumbers = new HashMap<Integer, Integer>();
        for(Post p: data.getPosts().values()){
            int userId = p.getUserId();
            if(postNumbers.containsKey(userId)){
                postNumbers.put(userId, postNumbers.get(userId)+1);
            }else{
                postNumbers.put(userId, 1);
            }
        
        }
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";
         ArrayList<User> users= new ArrayList(data.getUsers().values());
         Collections.sort(users, new UserMapComparator(postNumbers));
         System.out.println("Q4- The following users have the least posts:");
         for(int i=0; i<5; i++){
             System.out.println(RED + users.get(i) + ",- Post count " + postNumbers.get(users.get(i).getId()) + RESET);
             
         }
         
         
         }
    
    public void getPassiveCommentUsers(){
        DataStore data = DataStore.getInstance();
        HashMap<Integer, Integer> commentNumbers = new HashMap<Integer, Integer>();
        for(Comment c: data.getComments().values()){
            int userId = c.getUserId();
            if(commentNumbers.containsKey(userId)){
                commentNumbers.put(userId, commentNumbers.get(userId)+1);
            }else{
                commentNumbers.put(userId, 1);
            }
        
        }
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN= "\u001B[32m";
         ArrayList<User> users= new ArrayList(data.getUsers().values());
         Collections.sort(users, new UserMapComparator(commentNumbers));
         System.out.println("Q5- The following users have the least comments:");
         for(int i=0; i<5; i++){
             System.out.println(GREEN+ users.get(i)+"Comment count"+ commentNumbers.get(users.get(i).getId()));
             
         }
    }
    
    public void getPassiveAndActiveOverallUsers(){
            DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> overallNumbers = new HashMap<>();

    // Aggregate data from comments
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        overallNumbers.put(userId, overallNumbers.getOrDefault(userId, 0) + 1 + c.getLikes());
    }

    // Aggregate data from posts
    for (Post p : data.getPosts().values()) {
        int userId = p.getUserId();
        overallNumbers.put(userId, overallNumbers.getOrDefault(userId, 0) + 1);
    }
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String BLUE= "\u001B[34m";
    final String Magenta="\u001B[35m";
    // Get all users and sort based on overall numbers
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());
    Collections.sort(users, new UserMapComparator(overallNumbers));

    // Output passive users
    System.out.println("Q6- The following users have overall been passive:");
    for (int i = 0; i < Math.min(5, users.size()); i++) {
        User user = users.get(i);
        System.out.println(BLUE+ user + ",- Overall count:" + overallNumbers.get(user.getId()));
    }

    // Output active users
    System.out.println("Q7- The following users have overall been active:");
    for (int i = users.size() - 1; i >= Math.max(users.size() - 5, 0); i--) {
        User user = users.get(i);
        System.out.println(Magenta+ user + "-Overall count" + overallNumbers.get(user.getId()));
    }

        }
    }
    

    
