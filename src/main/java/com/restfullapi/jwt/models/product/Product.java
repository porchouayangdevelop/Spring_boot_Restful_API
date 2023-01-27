package com.restfullapi.jwt.models.product;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "product_name")
    @NotNull
    private String productName;

    @Column(name = "product_price")
    @NotNull
    private Double productPrice;

    @Column(name = "quantity")
    @NotNull
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private productSize size;

    @Column(name = "description")
    @NotNull
    private String description;

    @Column(name = "isDeleted")
    @NotNull
    private String isDeleted;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private categories category;

}
