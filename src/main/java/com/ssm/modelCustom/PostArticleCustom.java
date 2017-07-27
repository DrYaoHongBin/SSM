package com.ssm.modelCustom;

import com.ssm.model.Comment;
import com.ssm.model.Post;

import java.util.List;

/**
 * Created by acer on 2017/7/26.
 */
public class PostArticleCustom extends Post{

    @Override
    public String toString() {
        return "PostArticleCustom{" +
                "comment=" + comments +
                '}';
    }

    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
