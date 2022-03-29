package com.self.todo.tasks.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author syalama
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String user;
	private String taskmemo;
	private Boolean status = Boolean.FALSE;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate taskCreated;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate taskEndDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTaskmemo() {
		return taskmemo;
	}

	public void setTaskmemo(String taskmemo) {
		this.taskmemo = taskmemo;
	}


	public LocalDate getTaskCreated() {
		return taskCreated;
	}

	public void setTaskCreated(LocalDate taskCreated) {
		this.taskCreated = taskCreated;
	}

	public LocalDate getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(LocalDate taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}