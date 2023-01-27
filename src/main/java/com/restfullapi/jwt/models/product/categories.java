package com.restfullapi.jwt.models.product;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Data
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
public class categories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    @NotNull
    private Long id;

    @Column(name = "category_name")
    @NotNull
    private String name;

    @Column(name = "category_description")
    private String description;

    @Column(name = "isDeleted")
    private int isDeleted;

    @Column(name = "createdAt")
    private Date createdAt;

}
