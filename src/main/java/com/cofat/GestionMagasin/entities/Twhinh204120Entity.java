package com.cofat.GestionMagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "twhinh204120")
public class Twhinh204120Entity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "t_oorg", nullable = true, length = 50)
    private String tOorg;
    @Basic
    @Column(name = "t_orno", nullable = true, length = 50)
    private String tOrno;
    @Basic
    @Column(name = "t_oset", nullable = true, length = 50)
    private String tOset;
    @Basic
    @Column(name = "t_prty", nullable = true, length = 50)
    private String tPrty;
    @Basic
    @Column(name = "t_acno", nullable = true, length = 50)
    private String tAcno;
    @Basic
    @Column(name = "t_acti", nullable = true, length = 50)
    private String tActi;
    @Basic
    @Column(name = "t_appl", nullable = true, length = 50)
    private String tAppl;
    @Basic
    @Column(name = "t_auto", nullable = true, length = 50)
    private String tAuto;
    @Basic
    @Column(name = "t_odvc", nullable = true, length = 50)
    private String tOdvc;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 50)
    private String tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 50)
    private String tRefcntu;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "t_orno", insertable = false, updatable = false)
    @JsonIgnore
    private Twhinh200120Entity twhinh200120Entity;

    public Twhinh204120Entity(Twhinh200120Entity twhinh200120Entity) {
        this.twhinh200120Entity = twhinh200120Entity;
    }

    public Twhinh204120Entity() {

    }
    /*
    public Twhinh200120Entity getTwhinh200120Entity() {
        return twhinh200120Entity;
    }

    public void setTwhinh200120Entity(Twhinh200120Entity twhinh200120Entity) {
        this.twhinh200120Entity = twhinh200120Entity;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettOorg() {
        return tOorg;
    }

    public void settOorg(String oorg) {
        this.tOorg = tOorg;
    }

    public String gettOrno() {
        return tOrno;
    }

    public void settOrno(String tOrno) {
        this.tOrno = tOrno;
    }

    public String gettOset() {
        return tOset;
    }

    public void settOset(String tOset) {
        this.tOset = tOset;
    }

    public String gettPrty() {
        return tPrty;
    }

    public void settPrty(String tPrty) {
        this.tPrty = tPrty;
    }

    public String gettAcno() {
        return tAcno;
    }

    public void settAcno(String tAcno) {
        this.tAcno = tAcno;
    }

    public String gettActi() {
        return tActi;
    }

    public void settActi(String tActi) {
        this.tActi = tActi;
    }

    public String gettAppl() {
        return tAppl;
    }

    public void settAppl(String tAppl) {
        this.tAppl = tAppl;
    }

    public String gettAuto() {
        return tAuto;
    }

    public void settAuto(String tAuto) {
        this.tAuto = tAuto;
    }

    public String gettOdvc() {
        return tOdvc;
    }

    public void settOdvc(String tOdvc) {
        this.tOdvc = tOdvc;
    }

    public String gettRefcntd() {
        return tRefcntd;
    }

    public void settRefcntd(String tRefcntd) {
        this.tRefcntd = tRefcntd;
    }

    public String gettRefcntu() {
        return tRefcntu;
    }

    public void settRefcntu(String tRefcntu) {
        this.tRefcntu = tRefcntu;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Twhinh204120Entity that = (Twhinh204120Entity) o;
        return Objects.equals(oorg, that.oorg) && Objects.equals(tOrno, that.tOrno) && Objects.equals(tOset, that.tOset) && Objects.equals(tPrty, that.tPrty) && Objects.equals(tAcno, that.tAcno) && Objects.equals(tActi, that.tActi) && Objects.equals(tAppl, that.tAppl) && Objects.equals(tAuto, that.tAuto) && Objects.equals(tOdvc, that.tOdvc) && Objects.equals(tRefcntd, that.tRefcntd) && Objects.equals(tRefcntu, that.tRefcntu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oorg, tOrno, tOset, tPrty, tAcno, tActi, tAppl, tAuto, tOdvc, tRefcntd, tRefcntu);
    }*/

    public Twhinh204120Entity(Integer id, String tOorg, String tOrno, String tOset, String tPrty, String tAcno, String tActi, String tAppl, String tAuto, String tOdvc, String tRefcntd, String tRefcntu, Twhinh200120Entity twhinh200120Entity) {
        this.id = id;
        this.tOorg = tOorg;
        this.tOrno = tOrno;
        this.tOset = tOset;
        this.tPrty = tPrty;
        this.tAcno = tAcno;
        this.tActi = tActi;
        this.tAppl = tAppl;
        this.tAuto = tAuto;
        this.tOdvc = tOdvc;
        this.tRefcntd = tRefcntd;
        this.tRefcntu = tRefcntu;
        this.twhinh200120Entity = twhinh200120Entity;
    }
}
