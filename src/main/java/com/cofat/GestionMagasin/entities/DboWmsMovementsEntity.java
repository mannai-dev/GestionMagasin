package com.cofat.GestionMagasin.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "wms_movements")
public class DboWmsMovementsEntity implements Serializable{
    @Id
    @Column(name = "id", nullable = false, length = 5)
    private String id;
    @Basic
    @Column(name = "Palletbarcode", nullable = true, length = 19)
    private String palletBarcode;
    @Basic
    @Column(name = "Productid", nullable = false, length = 4)
    private String productId;
    @Basic
    @Column(name = "Initialquantity", nullable = true, length = 21)
    private String initialQuantity;
    @Basic
    @Column(name = "Finalquantity", nullable = true, length = 19)
    private String finalQuantity;
    @Basic
    @Column(name = "Palletlot", nullable = true, length = 15)
    private String palletLot;
    @Basic
    @Column(name = "Pallettype", nullable = true, length = 16)
    private String palletType;
    @Basic
    @Column(name = "Movementtype", nullable = true, length = 18)
    private String movementType;
    @Basic
    @Column(name = "Orderid", nullable = true, length = 13)
    private String orderId;
    @Basic
    @Column(name = "Source", nullable = true, length = 14)
    private String source;
    @Basic
    @Column(name = "Destination", nullable = true, length = 17)
    private String destination;
    @Basic
    @Column(name = "Date", nullable = true, length = 27)
    private String date;
    @Basic
    @Column(name = "Accountid", nullable = true, length = 15)
    private String accountId;
    @Basic
    @Column(name = "Createdonutc", nullable = true, length = 27)
    private String createdOnUtc;
    @Basic
    @Column(name = "Createdby", nullable = true, length = 15)
    private String createdBy;
    @Basic
    @Column(name = "Updatedonutc", nullable = true, length = 18)
    private String updatedOnUtc;
    @Basic
    @Column(name = "Updatedby", nullable = true, length = 15)
    private String updatedBy;
//Constructor

    public DboWmsMovementsEntity() {
    }

    public DboWmsMovementsEntity(String id, String palletBarcode, String productId, String initialQuantity, String finalQuantity, String palletLot, String palletType, String movementType, String orderId, String source, String destination, String date, String accountId, String createdOnUtc, String createdBy, String updatedOnUtc, String updatedBy) {
        this.id = id;
        this.palletBarcode = palletBarcode;
        this.productId = productId;
        this.initialQuantity = initialQuantity;
        this.finalQuantity = finalQuantity;
        this.palletLot = palletLot;
        this.palletType = palletType;
        this.movementType = movementType;
        this.orderId = orderId;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.accountId = accountId;
        this.createdOnUtc = createdOnUtc;
        this.createdBy = createdBy;
        this.updatedOnUtc = updatedOnUtc;
        this.updatedBy = updatedBy;
    }
//Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPalletBarcode() {
        return palletBarcode;
    }

    public void setPalletBarcode(String palletBarcode) {
        this.palletBarcode = palletBarcode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(String initialQuantity) {
        this.initialQuantity = initialQuantity;
    }

    public String getFinalQuantity() {
        return finalQuantity;
    }

    public void setFinalQuantity(String finalQuantity) {
        this.finalQuantity = finalQuantity;
    }

    public String getPalletLot() {
        return palletLot;
    }

    public void setPalletLot(String palletLot) {
        this.palletLot = palletLot;
    }

    public String getPalletType() {
        return palletType;
    }

    public void setPalletType(String palletType) {
        this.palletType = palletType;
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCreatedOnUtc() {
        return createdOnUtc;
    }

    public void setCreatedOnUtc(String createdOnUtc) {
        this.createdOnUtc = createdOnUtc;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedOnUtc() {
        return updatedOnUtc;
    }

    public void setUpdatedOnUtc(String updatedOnUtc) {
        this.updatedOnUtc = updatedOnUtc;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    //Relation
    @ManyToOne
    @JoinColumn(name = "Productid", insertable = false, updatable = false)
    @JsonIgnore
    private DboWmsProductsEntity DboWmsProductsEntity;

    @ManyToOne
    @JoinColumn(name = "Accountid", insertable = false, updatable = false)
    @JsonIgnore
    private DboWmsAccountEntity DboWmsAccountEntity;
/*
    @ManyToOne
    @JoinColumn(name = "date", insertable = false, updatable = false)
    @JsonIgnore
    private Extraction1 extraction1;


 */
}