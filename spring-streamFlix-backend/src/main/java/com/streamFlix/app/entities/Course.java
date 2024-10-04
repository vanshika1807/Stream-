package com.streamFlix.app.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")

public class Course {
	
	@Id
	private String id;
	
	private String title;
	
	/*
	 * @OneToMany(mappedBy = "course") private List<Video> list = new ArrayList<>();
	 * 
	 */
}
