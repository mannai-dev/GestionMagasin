package com.cofat.GestionMagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Extraction1")
public class Extraction1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "item")
    private String item;

    @Column(name = "t_item")
    private String tItem;

    @Column(name = "palletbarcode")
    private String palletBarcode;

    @Column(name = "num")
    private String num;

    @Column(name = "productid")
    private String productId;

    @Column(name = "initialquantity")
    private String initialQuantity;

    @Column(name = "qté")
    private String qte;

    @Column(name = "date")
    private String date;

    @Column(name = "num_OM")
    private String numOM;

    @Column(name = "orno")
    private String orno;

    @Column(name = "t_orno")
    private String tOrno;

    @Column(name = "oset")
    private Integer oset;

    @Column(name = "t_oset")
    private Integer tOset;

    @Column(name = "movementtype")
    private String movementType;

    @Column(name = "jour")
    private String jour;

    // getters and setters



}
