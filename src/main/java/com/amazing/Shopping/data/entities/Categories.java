package com.amazing.Shopping.data.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(
        name = "Categories",
        schema = "shopping"
)
public class Categories
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    private String description;

    public Categories(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
