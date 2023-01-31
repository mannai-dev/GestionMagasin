package com.cofat.GestionMagasin.entities;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "twhinh200120")
public class Twhinh200120Entity {
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
    @Column(name = "t_seri", nullable = true, length = 50)
    private String tSeri;
    @Basic
    @Column(name = "t_ittp", nullable = true, length = 50)
    private String tIttp;
    @Basic
    @Column(name = "t_odat", nullable = true, length = 50)
    private String tOdat;
    @Basic
    @Column(name = "t_sfty", nullable = true, length = 50)
    private String tSfty;
    @Basic
    @Column(name = "t_sfco", nullable = true, length = 50)
    private String tSfco;
    @Basic
    @Column(name = "t_stty", nullable = true, length = 50)
    private String tStty;
    @Basic
    @Column(name = "t_stco", nullable = true, length = 50)
    private String tStco;
    @Basic
    @Column(name = "t_sfcp", nullable = true, length = 50)
    private String tSfcp;
    @Basic
    @Column(name = "t_stcp", nullable = true, length = 50)
    private String tStcp;
    @Basic
    @Column(name = "t_sfad", nullable = true, length = 50)
    private String tSfad;
    @Basic
    @Column(name = "t_stad", nullable = true, length = 50)
    private String tStad;
    @Basic
    @Column(name = "t_sfit", nullable = true, length = 50)
    private String tSfit;
    @Basic
    @Column(name = "t_stit", nullable = true, length = 50)
    private String tStit;
    @Basic
    @Column(name = "t_sfrv", nullable = true, length = 50)
    private String tSfrv;
    @Basic
    @Column(name = "t_strv", nullable = true, length = 50)
    private String tStrv;
    @Basic
    @Column(name = "t_sflo", nullable = true, length = 50)
    private String tSflo;
    @Basic
    @Column(name = "t_stlo", nullable = true, length = 50)
    private String tStlo;
    @Basic
    @Column(name = "t_otyp", nullable = true, length = 50)
    private String tOtyp;
    @Basic
    @Column(name = "t_depc", nullable = true, length = 50)
    private String tDepc;
    @Basic
    @Column(name = "t_wdep", nullable = true, length = 50)
    private String tWdep;
    @Basic
    @Column(name = "t_blor", nullable = true, length = 50)
    private String tBlor;
    @Basic
    @Column(name = "t_rtrn", nullable = true, length = 50)
    private String tRtrn;
    @Basic
    @Column(name = "t_cons", nullable = true, length = 50)
    private String tCons;
    @Basic
    @Column(name = "t_invc", nullable = true, length = 50)
    private String tInvc;
    @Basic
    @Column(name = "t_bflh", nullable = true, length = 50)
    private String tBflh;
    @Basic
    @Column(name = "t_rrgd", nullable = true, length = 50)
    private String tRrgd;
    @Basic
    @Column(name = "t_dmst", nullable = true, length = 50)
    private String tDmst;
    @Basic
    @Column(name = "t_carr", nullable = true, length = 50)
    private String tCarr;
    @Basic
    @Column(name = "t_cbin", nullable = true, length = 50)
    private String tCbin;
    @Basic
    @Column(name = "t_crte", nullable = true, length = 50)
    private String tCrte;
    @Basic
    @Column(name = "t_cdec", nullable = true, length = 50)
    private String tCdec;
    @Basic
    @Column(name = "t_ptpa", nullable = true, length = 50)
    private String tPtpa;
    @Basic
    @Column(name = "t_motv", nullable = true, length = 50)
    private String tMotv;
    @Basic
    @Column(name = "t_delc", nullable = true, length = 50)
    private String tDelc;
    @Basic
    @Column(name = "t_serv", nullable = true, length = 50)
    private String tServ;
    @Basic
    @Column(name = "t_pddt", nullable = true, length = 50)
    private String tPddt;
    @Basic
    @Column(name = "t_prdt", nullable = true, length = 50)
    private String tPrdt;
    @Basic
    @Column(name = "t_mint", nullable = true, length = 50)
    private String tMint;
    @Basic
    @Column(name = "t_maxt", nullable = true, length = 50)
    private String tMaxt;
    @Basic
    @Column(name = "t_mind", nullable = true, length = 50)
    private String tMind;
    @Basic
    @Column(name = "t_maxd", nullable = true, length = 50)
    private String tMaxd;
    @Basic
    @Column(name = "t_clan", nullable = true, length = 50)
    private String tClan;
    @Basic
    @Column(name = "t_grid", nullable = true, length = 50)
    private String tGrid;
    @Basic
    @Column(name = "t_setn", nullable = true, length = 50)
    private String tSetn;
    @Basic
    @Column(name = "t_info", nullable = true, length = 50)
    private String tInfo;
    @Basic
    @Column(name = "t_refe", nullable = true, length = 50)
    private String tRefe;
    @Basic
    @Column(name = "t_isit", nullable = true, length = 50)
    private String tIsit;
    @Basic
    @Column(name = "t_rodr", nullable = true, length = 50)
    private String tRodr;
    @Basic
    @Column(name = "t_akit", nullable = true, length = 50)
    private String tAkit;
    @Basic
    @Column(name = "t_ctdt", nullable = true, length = 50)
    private String tCtdt;
    @Basic
    @Column(name = "t_adat", nullable = true, length = 50)
    private String tAdat;
    @Basic
    @Column(name = "t_clgr", nullable = true, length = 50)
    private String tClgr;
    @Basic
    @Column(name = "t_list", nullable = true, length = 50)
    private String tList;
    @Basic
    @Column(name = "t_item", nullable = true, length = 50)
    private String tItem;
    @Basic
    @Column(name = "t_qoro", nullable = true, length = 50)
    private String tQoro;
    @Basic
    @Column(name = "t_orun", nullable = true, length = 50)
    private String tOrun;
    @Basic
    @Column(name = "t_qord", nullable = true, length = 50)
    private String tQord;
    @Basic
    @Column(name = "t_asst", nullable = true, length = 50)
    private String tAsst;
    @Basic
    @Column(name = "t_txta", nullable = true, length = 50)
    private String tTxta;
    @Basic
    @Column(name = "t_txtb", nullable = true, length = 50)
    private String tTxtb;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 50)
    private String tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 50)
    private String tRefcntu;
    @Basic
    @Column(name = "t_hsta", nullable = true, length = 50)
    private String tHsta;

    @OneToMany(mappedBy = "twhinh200120Entity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Twhinh220120Entity> twhinh220120Entities = new LinkedHashSet<>();

    @OneToMany(mappedBy = "twhinh200120Entity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Twhinh204120Entity> twhinh204120Entities = new LinkedHashSet<>();

    public Set<Twhinh204120Entity> getTwhinh204120Entities() {
        return twhinh204120Entities;
    }

    public void setTwhinh204120Entities(Set<Twhinh204120Entity> twhinh204120Entities) {
        this.twhinh204120Entities = twhinh204120Entities;
    }

    public Set<Twhinh220120Entity> getTwhinh220120Entities() {
        return twhinh220120Entities;
    }

    public void setTwhinh220120Entities(Set<Twhinh220120Entity> twhinh220120Entities) {
        this.twhinh220120Entities = twhinh220120Entities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettOorg() {
        return tOorg;
    }

    public void settOorg(String tOorg) {
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

    public String gettSeri() {
        return tSeri;
    }

    public void settSeri(String tSeri) {
        this.tSeri = tSeri;
    }

    public String gettIttp() {
        return tIttp;
    }

    public void settIttp(String tIttp) {
        this.tIttp = tIttp;
    }

    public String gettOdat() {
        return tOdat;
    }

    public void settOdat(String tOdat) {
        this.tOdat = tOdat;
    }

    public String gettSfty() {
        return tSfty;
    }

    public void settSfty(String tSfty) {
        this.tSfty = tSfty;
    }

    public String gettSfco() {
        return tSfco;
    }

    public void settSfco(String tSfco) {
        this.tSfco = tSfco;
    }

    public String gettStty() {
        return tStty;
    }

    public void settStty(String tStty) {
        this.tStty = tStty;
    }

    public String gettStco() {
        return tStco;
    }

    public void settStco(String tStco) {
        this.tStco = tStco;
    }

    public String gettSfcp() {
        return tSfcp;
    }

    public void settSfcp(String tSfcp) {
        this.tSfcp = tSfcp;
    }

    public String gettStcp() {
        return tStcp;
    }

    public void settStcp(String tStcp) {
        this.tStcp = tStcp;
    }

    public String gettSfad() {
        return tSfad;
    }

    public void settSfad(String tSfad) {
        this.tSfad = tSfad;
    }

    public String gettStad() {
        return tStad;
    }

    public void settStad(String tStad) {
        this.tStad = tStad;
    }

    public String gettSfit() {
        return tSfit;
    }

    public void settSfit(String tSfit) {
        this.tSfit = tSfit;
    }

    public String gettStit() {
        return tStit;
    }

    public void settStit(String tStit) {
        this.tStit = tStit;
    }

    public String gettSfrv() {
        return tSfrv;
    }

    public void settSfrv(String tSfrv) {
        this.tSfrv = tSfrv;
    }

    public String gettStrv() {
        return tStrv;
    }

    public void settStrv(String tStrv) {
        this.tStrv = tStrv;
    }

    public String gettSflo() {
        return tSflo;
    }

    public void settSflo(String tSflo) {
        this.tSflo = tSflo;
    }

    public String gettStlo() {
        return tStlo;
    }

    public void settStlo(String tStlo) {
        this.tStlo = tStlo;
    }

    public String gettOtyp() {
        return tOtyp;
    }

    public void settOtyp(String tOtyp) {
        this.tOtyp = tOtyp;
    }

    public String gettDepc() {
        return tDepc;
    }

    public void settDepc(String tDepc) {
        this.tDepc = tDepc;
    }

    public String gettWdep() {
        return tWdep;
    }

    public void settWdep(String tWdep) {
        this.tWdep = tWdep;
    }

    public String gettBlor() {
        return tBlor;
    }

    public void settBlor(String tBlor) {
        this.tBlor = tBlor;
    }

    public String gettRtrn() {
        return tRtrn;
    }

    public void settRtrn(String tRtrn) {
        this.tRtrn = tRtrn;
    }

    public String gettCons() {
        return tCons;
    }

    public void settCons(String tCons) {
        this.tCons = tCons;
    }

    public String gettInvc() {
        return tInvc;
    }

    public void settInvc(String tInvc) {
        this.tInvc = tInvc;
    }

    public String gettBflh() {
        return tBflh;
    }

    public void settBflh(String tBflh) {
        this.tBflh = tBflh;
    }

    public String gettRrgd() {
        return tRrgd;
    }

    public void settRrgd(String tRrgd) {
        this.tRrgd = tRrgd;
    }

    public String gettDmst() {
        return tDmst;
    }

    public void settDmst(String tDmst) {
        this.tDmst = tDmst;
    }

    public String gettCarr() {
        return tCarr;
    }

    public void settCarr(String tCarr) {
        this.tCarr = tCarr;
    }

    public String gettCbin() {
        return tCbin;
    }

    public void settCbin(String tCbin) {
        this.tCbin = tCbin;
    }

    public String gettCrte() {
        return tCrte;
    }

    public void settCrte(String tCrte) {
        this.tCrte = tCrte;
    }

    public String gettCdec() {
        return tCdec;
    }

    public void settCdec(String tCdec) {
        this.tCdec = tCdec;
    }

    public String gettPtpa() {
        return tPtpa;
    }

    public void settPtpa(String tPtpa) {
        this.tPtpa = tPtpa;
    }

    public String gettMotv() {
        return tMotv;
    }

    public void settMotv(String tMotv) {
        this.tMotv = tMotv;
    }

    public String gettDelc() {
        return tDelc;
    }

    public void settDelc(String tDelc) {
        this.tDelc = tDelc;
    }

    public String gettServ() {
        return tServ;
    }

    public void settServ(String tServ) {
        this.tServ = tServ;
    }

    public String gettPddt() {
        return tPddt;
    }

    public void settPddt(String tPddt) {
        this.tPddt = tPddt;
    }

    public String gettPrdt() {
        return tPrdt;
    }

    public void settPrdt(String tPrdt) {
        this.tPrdt = tPrdt;
    }

    public String gettMint() {
        return tMint;
    }

    public void settMint(String tMint) {
        this.tMint = tMint;
    }

    public String gettMaxt() {
        return tMaxt;
    }

    public void settMaxt(String tMaxt) {
        this.tMaxt = tMaxt;
    }

    public String gettMind() {
        return tMind;
    }

    public void settMind(String tMind) {
        this.tMind = tMind;
    }

    public String gettMaxd() {
        return tMaxd;
    }

    public void settMaxd(String tMaxd) {
        this.tMaxd = tMaxd;
    }

    public String gettClan() {
        return tClan;
    }

    public void settClan(String tClan) {
        this.tClan = tClan;
    }

    public String gettGrid() {
        return tGrid;
    }

    public void settGrid(String tGrid) {
        this.tGrid = tGrid;
    }

    public String gettSetn() {
        return tSetn;
    }

    public void settSetn(String tSetn) {
        this.tSetn = tSetn;
    }

    public String gettInfo() {
        return tInfo;
    }

    public void settInfo(String tInfo) {
        this.tInfo = tInfo;
    }

    public String gettRefe() {
        return tRefe;
    }

    public void settRefe(String tRefe) {
        this.tRefe = tRefe;
    }

    public String gettIsit() {
        return tIsit;
    }

    public void settIsit(String tIsit) {
        this.tIsit = tIsit;
    }

    public String gettRodr() {
        return tRodr;
    }

    public void settRodr(String tRodr) {
        this.tRodr = tRodr;
    }

    public String gettAkit() {
        return tAkit;
    }

    public void settAkit(String tAkit) {
        this.tAkit = tAkit;
    }

    public String gettCtdt() {
        return tCtdt;
    }

    public void settCtdt(String tCtdt) {
        this.tCtdt = tCtdt;
    }

    public String gettAdat() {
        return tAdat;
    }

    public void settAdat(String tAdat) {
        this.tAdat = tAdat;
    }

    public String gettClgr() {
        return tClgr;
    }

    public void settClgr(String tClgr) {
        this.tClgr = tClgr;
    }

    public String gettList() {
        return tList;
    }

    public void settList(String tList) {
        this.tList = tList;
    }

    public String gettItem() {
        return tItem;
    }

    public void settItem(String tItem) {
        this.tItem = tItem;
    }

    public String gettQoro() {
        return tQoro;
    }

    public void settQoro(String tQoro) {
        this.tQoro = tQoro;
    }

    public String gettOrun() {
        return tOrun;
    }

    public void settOrun(String tOrun) {
        this.tOrun = tOrun;
    }

    public String gettQord() {
        return tQord;
    }

    public void settQord(String tQord) {
        this.tQord = tQord;
    }

    public String gettAsst() {
        return tAsst;
    }

    public void settAsst(String tAsst) {
        this.tAsst = tAsst;
    }

    public String gettTxta() {
        return tTxta;
    }

    public void settTxta(String tTxta) {
        this.tTxta = tTxta;
    }

    public String gettTxtb() {
        return tTxtb;
    }

    public void settTxtb(String tTxtb) {
        this.tTxtb = tTxtb;
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

    public String gettHsta() {
        return tHsta;
    }

    public void settHsta(String tHsta) {
        this.tHsta = tHsta;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Twhinh200120Entity that = (Twhinh200120Entity) o;
        return Objects.equals(tOorg, that.tOorg) && Objects.equals(tOrno, that.tOrno) && Objects.equals(tOset, that.tOset) && Objects.equals(tSeri, that.tSeri) && Objects.equals(tIttp, that.tIttp) && Objects.equals(tOdat, that.tOdat) && Objects.equals(tSfty, that.tSfty) && Objects.equals(tSfco, that.tSfco) && Objects.equals(tStty, that.tStty) && Objects.equals(tStco, that.tStco) && Objects.equals(tSfcp, that.tSfcp) && Objects.equals(tStcp, that.tStcp) && Objects.equals(tSfad, that.tSfad) && Objects.equals(tStad, that.tStad) && Objects.equals(tSfit, that.tSfit) && Objects.equals(tStit, that.tStit) && Objects.equals(tSfrv, that.tSfrv) && Objects.equals(tStrv, that.tStrv) && Objects.equals(tSflo, that.tSflo) && Objects.equals(tStlo, that.tStlo) && Objects.equals(tOtyp, that.tOtyp) && Objects.equals(tDepc, that.tDepc) && Objects.equals(tWdep, that.tWdep) && Objects.equals(tBlor, that.tBlor) && Objects.equals(tRtrn, that.tRtrn) && Objects.equals(tCons, that.tCons) && Objects.equals(tInvc, that.tInvc) && Objects.equals(tBflh, that.tBflh) && Objects.equals(tRrgd, that.tRrgd) && Objects.equals(tDmst, that.tDmst) && Objects.equals(tCarr, that.tCarr) && Objects.equals(tCbin, that.tCbin) && Objects.equals(tCrte, that.tCrte) && Objects.equals(tCdec, that.tCdec) && Objects.equals(tPtpa, that.tPtpa) && Objects.equals(tMotv, that.tMotv) && Objects.equals(tDelc, that.tDelc) && Objects.equals(tServ, that.tServ) && Objects.equals(tPddt, that.tPddt) && Objects.equals(tPrdt, that.tPrdt) && Objects.equals(tMint, that.tMint) && Objects.equals(tMaxt, that.tMaxt) && Objects.equals(tMind, that.tMind) && Objects.equals(tMaxd, that.tMaxd) && Objects.equals(tClan, that.tClan) && Objects.equals(tGrid, that.tGrid) && Objects.equals(tSetn, that.tSetn) && Objects.equals(tInfo, that.tInfo) && Objects.equals(tRefe, that.tRefe) && Objects.equals(tIsit, that.tIsit) && Objects.equals(tRodr, that.tRodr) && Objects.equals(tAkit, that.tAkit) && Objects.equals(tCtdt, that.tCtdt) && Objects.equals(tAdat, that.tAdat) && Objects.equals(tClgr, that.tClgr) && Objects.equals(tList, that.tList) && Objects.equals(tItem, that.tItem) && Objects.equals(tQoro, that.tQoro) && Objects.equals(tOrun, that.tOrun) && Objects.equals(tQord, that.tQord) && Objects.equals(tAsst, that.tAsst) && Objects.equals(tTxta, that.tTxta) && Objects.equals(tTxtb, that.tTxtb) && Objects.equals(tRefcntd, that.tRefcntd) && Objects.equals(tRefcntu, that.tRefcntu) && Objects.equals(tHsta, that.tHsta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tOorg, tOrno, tOset, tSeri, tIttp, tOdat, tSfty, tSfco, tStty, tStco, tSfcp, tStcp, tSfad, tStad, tSfit, tStit, tSfrv, tStrv, tSflo, tStlo, tOtyp, tDepc, tWdep, tBlor, tRtrn, tCons, tInvc, tBflh, tRrgd, tDmst, tCarr, tCbin, tCrte, tCdec, tPtpa, tMotv, tDelc, tServ, tPddt, tPrdt, tMint, tMaxt, tMind, tMaxd, tClan, tGrid, tSetn, tInfo, tRefe, tIsit, tRodr, tAkit, tCtdt, tAdat, tClgr, tList, tItem, tQoro, tOrun, tQord, tAsst, tTxta, tTxtb, tRefcntd, tRefcntu, tHsta);
    }*/
}
