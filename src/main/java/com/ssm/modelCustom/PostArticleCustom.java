package com.ssm.modelCustom;

import com.ssm.model.Comment;
import com.ssm.model.Post;

import java.util.List;

/**
 * 帖子包装类
 * Created by acer on 2017/7/26.
 */
public class PostArticleCustom extends Post{

    public PostArticleCustom(){}

    public PostArticleCustom(String postName, Integer postAuthor, Integer postClicktimes, String postCategory,String postPost) {
        super(postName, postAuthor, postClicktimes, postCategory,postPost);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
