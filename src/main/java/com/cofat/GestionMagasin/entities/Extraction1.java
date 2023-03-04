package com.cofat.GestionMagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.Collection;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Extraction1")
public class Extraction1  implements Serializable{

    /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "code", nullable = true)
    private String code;

    @Column(name = "item", nullable = true)
    private String item;

    @Column(name = "t_item", nullable = true)
    private String tItem;

    @Column(name = "palletBarCode", nullable = true)
    private String palletBarcode;

    @Id
    @Column(name = "movementId")
    private String movementId;

    @Column(name = "num", nullable = true)
    private String num;

    @Column(name = "productId", nullable = true)
    private String productId;

    @Column(name = "initialQuantity", nullable = true)
    private String initialQuantity;

    @Column(name = "qté", nullable = true)
    private String qte;

    @Column(name = "date", nullable = true)
    private String date;

    @Column(name = "num_om", nullable = true)
    private String numOM;

    @Column(name = "orno", nullable = true)
    private String orno;

    @Column(name = "t_orno", nullable = true)
    private String tOrno;

    @Column(name = "oset", nullable = true)
    private Integer oset;

    @Column(name = "t_oset", nullable = true)
    private Integer tOset;

    @Column(name = "movementType", nullable = true)
    private String movementType;

    @Column(name = "jour", nullable = true)
    private String jour;

    public Extraction1(String code, String movementId) {
        this.code = code;
        this.movementId = movementId;
    }

       /* getters and setters



    @OneToMany(mappedBy = "extraction1")
    private Collection<DboWmsMovementsEntity> wmsMovementEntities;

    public void setWmsMovements(Collection<DboWmsMovementsEntity> wmsMovementEntities) {
        this.wmsMovementEntities = wmsMovementEntities;
    } */

}
