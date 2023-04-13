package com.glearning.model;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tickets_details")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ticket_title")
	private String title;
	@Column(name = "ticket_description")
	private String description;
	@Column(name = "ticket_creation_date")
	private String creationDate;
	@Column(name = "ticket_content")
	private String content;
	@UpdateTimestamp
	private LocalDate updatedDate;

	public Ticket() {
	}

	public Ticket(String title, String description, String creationDate, String content) {
		this.title = title;
		this.description = description;
		this.creationDate = creationDate;
		this.content = content;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationDate() {
		return creationDate == null ? updatedDate.getDayOfMonth() + " " + updatedDate.getMonthValue() + " " + updatedDate.getYear(): creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
