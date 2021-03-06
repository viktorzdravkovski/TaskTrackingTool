package com.viktor.ttt.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Hibernate entity for AUTH_USER.
 */
@Entity
@Table(name = "AUTH_USER")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "AUTH_USER_ID")
  private Integer id;

  @Column(name = "USERNAME")
  private String username;

  @Column(name = "PASSWORD")
  private String password;

  @Column(name = "ACTIVE")
  private boolean active;

  @OneToOne(
      targetEntity = UserDetails.class,
      cascade = CascadeType.ALL,
      orphanRemoval = true
  )
  @JoinColumn(name = "FK_USER_DETAILS_ID")
  private UserDetails userDetails;

  @LazyCollection(LazyCollectionOption.FALSE)
  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(
      name = "AUTH_USER_ROLE",
      joinColumns = {@JoinColumn(name = "AUTH_USER_ID")},
      inverseJoinColumns = {@JoinColumn(name = "AUTH_ROLE_ID")}
  )
  private List<Role> roles = new ArrayList<>();

  @LazyCollection(LazyCollectionOption.FALSE)
  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(
      name = "USER_TASK",
      joinColumns = {@JoinColumn(name = "AUTH_USER_ID")},
      inverseJoinColumns = {@JoinColumn(name = "TASK_ID")}
  )
  public List<Task> tasks = new ArrayList<>();

  @OneToMany(
      targetEntity = Comment.class,
      mappedBy = "user",
      orphanRemoval = true,
      cascade = CascadeType.ALL)
  @Fetch(FetchMode.SUBSELECT)
  private List<Comment> comments = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserDetails getUserDetails() {
    return userDetails;
  }

  public void setUserDetails(UserDetails userDetails) {
    this.userDetails = userDetails;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<Task> getTasks() {
    return tasks;
  }

  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}