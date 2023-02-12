package com.uhablog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "booksinfo")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    // 本のidを保持するフィールド
    private Integer id;
	
    @Column(name="title")
    // 本のタイトルを保持するフィールド
    private String title;
	
	
    @Column(name="price")
    // 本の値段を保持するフィールド
    private Integer price;
}
