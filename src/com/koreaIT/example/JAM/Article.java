package com.koreaIT.example.JAM;

public class Article {
	
	public int id;
	public String title;
	public String body;
	
	public Article(int id, String title, String dody) {
		this.id = id;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + "]";
	}
}