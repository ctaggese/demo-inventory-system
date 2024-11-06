package com.taggeselle.warehouse.storageLocation;

import jakarta.persistence.*;

@Entity
@Table(name = "T_STORAGE_LOCATIONS")
public class StorageLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "NAME")
    private String name;


    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "PRODUCT_ID")
    private String productId;
}
