package com.epicodus.talkaboutit.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Guest on 5/2/16.
 */
@Parcel
public class Category {
    private String name;
    private List<Post> posts = new ArrayList<>();

    public Category(String name, List<Post> posts) {
        this.name = name;
        this.posts = posts;
    }

    public Category() {}

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

}
