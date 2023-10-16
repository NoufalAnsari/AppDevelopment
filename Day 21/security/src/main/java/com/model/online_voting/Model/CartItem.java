package com.model.online_voting.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "vote")
public class CartItem {
    @Id
    @Column(unique = true)
    private Long id;
    @Column(unique = true)
    private String name;
    private double vote;
    
    public CartItem() {
    }

    public CartItem(String name, double vote) {
        this.name = name;
        this.vote = vote;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVote() {
        return vote;
    }

    public void setVote(double vote) {
        this.vote = vote;
    }

    // Getters and setters
}
