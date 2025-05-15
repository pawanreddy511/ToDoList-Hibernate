package com.pavan.hibernate.ToDoList.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Task_Manager")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String title;
	@Column
	boolean completed;
	@Column
	String time;
	
	Task(){
		
		this.title=null;
		this.completed=false;
	   
	}


	public Task(String title, boolean completed, String time) {
		super();
		this.title = title;
		this.completed = completed;
		this.time=time;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isCompleted() {
		return completed;
	}


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}


	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", completed=" + completed + ", time=" + time + "]";
	}
	
	
	
	

}
