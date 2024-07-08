package com.mindfulsoftware.com.spring_web_demo;

import java.util.Objects;

public class NewsModel {
    String author;
    String title;
    String description;

    public NewsModel(String author, String title, String description) {
        this.author = author;
        this.title = title;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsModel newsModel = (NewsModel) o;
        return Objects.equals(author, newsModel.author) && Objects.equals(title, newsModel.title) && Objects.equals(description, newsModel.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, description);
    }

    @Override
    public String toString() {
        return "NewsModel{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
