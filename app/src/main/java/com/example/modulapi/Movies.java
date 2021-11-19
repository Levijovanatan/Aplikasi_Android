package com.example.modulapi;

import android.content.Intent;

public class Movies {
    private String title;
    private String description;
    private String publishedAt;
    private String urlToImage;

    public Movies(String title, String description, String publishedAt, String urlToImage) {
        this.title = title;
        this.description = description;
        this.publishedAt = publishedAt;
        this.urlToImage = urlToImage;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getUrlToImage() {
        return urlToImage;
    }
}
