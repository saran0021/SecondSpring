package com.rev.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Application {
private String name;
private int id;
private String question;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
	
public void display() {
	System.out.println("welcome "+getName());
	System.out.println("your is = "+getId());
	System.out.println("your question is-"+getQuestion());
}
@PostConstruct
public void init() {
	System.out.println("initialisation starting");
}
@PreDestroy
public void destroy() {
	System.out.println("destroy method");
}
	
}
