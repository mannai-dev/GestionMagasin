package com.cofat.GestionMagasin.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "wms_products")
public class DboWmsProductsEntity implements Serializable {

   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 4)
    private String id;
    @Basic
    @Column(name = "Internalcode", nullable = true, length = 18)
    private String internalCode;
    @Basic
    @Column(name = "Code", nullable = true, length = 15)
    private String code;
    @Basic
    @Column(name = "Name", nullable = true, length = 30)
    private String name;
    @Basic
    @Column(name = "Wms_Categoryid", nullable = true, length = 20)
    private String wmsCategoryId;
    @Basic
    @Column(name = "Wms_Sub_Category_Id", nullable = true, length = 23)
    private String wmsSubCategoryId;
    @Basic
    @Column(name = "Wms_Providervode", nullable = true, length = 22)
    private String wmsProviderCode;
    @Basic
    @Column(name = "Providerproductcode", nullable = true, length = 30)
    private String providerProductCode;
    @Basic
    @Column(name = "Customerproductcode", nullable = true, length = 25)
    private String customerProductCode;
    @Basic
    @Column(name = "Label2", nullable = true, length = 12)
    private String label2;
    @Basic
    @Column(name = "Colorcode", nullable = true, length = 15)
    private String colorCode;
    @Basic
    @Column(name = "Costprice", nullable = true, length = 15)
    private String costPrice;
    @Basic
    @Column(name = "Lastdnventorydate", nullable = true, length = 23)
    private String lastInventoryDate;
    @Basic
    @Column(name = "Active", nullable = true, length = 12)
    private String active;
    @Basic
    @Column(name = "Securitystock", nullable = true, length = 19)
    private String securityStock;
    @Basic
    @Column(name = "Multiplequantity", nullable = true, length = 22)
    private String multipleQuantity;
    @Basic
    @Column(name = "Unit", nullable = true, length = 10)
    private String unit;
    @Basic
    @Column(name = "Qualitycode", nullable = true, length = 17)
    private String qualityCode;
    @Basic
    @Column(name = "Createdonutc", nullable = true, length = 27)
    private String createdOnUtc;
    @Basic
    @Column(name = "Createdby", nullable = true, length = 15)
    private String createdBy;
    @Basic
    @Column(name = "Updatedonutc", nullable = true, length = 27)
    private String updatedOnUtc;
    @Basic
    @Column(name = "Updatedby", nullable = true, length = 15)
    private String updatedBy;

    //Constructor
    public DboWmsProductsEntity() {
    }
    public DboWmsProductsEntity(String id, String internalCode, String code, String name, String wmsCategoryId, String wmsSubCategoryId, String wmsProviderCode, String providerProductCode, String customerProductCode, String label2, String colorCode, String costPrice, String lastInventoryDate, String active, String securityStock, String multipleQuantity, String unit, String qualityCode, String createdOnUtc, String createdBy, String updatedOnUtc, String updatedBy) {
        this.id = id;
        this.internalCode = internalCode;
        this.code = code;
        this.name = name;
        this.wmsCategoryId = wmsCategoryId;
        this.wmsSubCategoryId = wmsSubCategoryId;
        this.wmsProviderCode = wmsProviderCode;
        this.providerProductCode = providerProductCode;
        this.customerProductCode = customerProductCode;
        this.label2 = label2;
        this.colorCode = colorCode;
        this.costPrice = costPrice;
        this.lastInventoryDate = lastInventoryDate;
        this.active = active;
        this.securityStock = securityStock;
        this.multipleQuantity = multipleQuantity;
        this.unit = unit;
        this.qualityCode = qualityCode;
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

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWmsCategoryId() {
        return wmsCategoryId;
    }

    public void setWmsCategoryId(String wmsCategoryId) {
        this.wmsCategoryId = wmsCategoryId;
    }

    public String getWmsSubCategoryId() {
        return wmsSubCategoryId;
    }

    public void setWmsSubCategoryId(String wmsSubCategoryId) {
        this.wmsSubCategoryId = wmsSubCategoryId;
    }

    public String getWmsProviderCode() {
        return wmsProviderCode;
    }

    public void setWmsProviderCode(String wmsProviderCode) {
        this.wmsProviderCode = wmsProviderCode;
    }

    public String getProviderProductCode() {
        return providerProductCode;
    }

    public void setProviderProductCode(String providerProductCode) {
        this.providerProductCode = providerProductCode;
    }

    public String getCustomerProductCode() {
        return customerProductCode;
    }

    public void setCustomerProductCode(String customerProductCode) {
        this.customerProductCode = customerProductCode;
    }

    public String getLabel2() {
        return label2;
    }

    public void setLabel2(String label2) {
        this.label2 = label2;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getLastInventoryDate() {
        return lastInventoryDate;
    }

    public void setLastInventoryDate(String lastInventoryDate) {
        this.lastInventoryDate = lastInventoryDate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSecurityStock() {
        return securityStock;
    }

    public void setSecurityStock(String securityStock) {
        this.securityStock = securityStock;
    }

    public String getMultipleQuantity() {
        return multipleQuantity;
    }

    public void setMultipleQuantity(String multipleQuantity) {
        this.multipleQuantity = multipleQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode;
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
    @OneToMany(mappedBy = "DboWmsProductsEntity")
    private Collection<DboWmsMovementsEntity> wmsMovementEntities;

    public void setWmsMovements(Collection<DboWmsMovementsEntity> wmsMovementEntities) {
        this.wmsMovementEntities = wmsMovementEntities;
    }
}
