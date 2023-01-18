package com.cofat.GestionMagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Entity
@Table(name = "twhinh220120")
public class Twhinh220120Entity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "oorg", nullable = true, length = 4)
    private String oorg;
    @Basic
    @Column(name = "t_orno", nullable = true, length = 9)
    private String tOrno;
    @Basic
    @Column(name = "t_pono", nullable = true, length = 6)
    private String tPono;
    @Basic
    @Column(name = "t_seqn", nullable = true, length = 6)
    private String tSeqn;
    @Basic
    @Column(name = "t_oset", nullable = true, length = 6)
    private String tOset;
    @Basic
    @Column(name = "t_cwar", nullable = true, length = 6)
    private String tCwar;
    @Basic
    @Column(name = "t_comp", nullable = true, length = 6)
    private String tComp;
    @Basic
    @Column(name = "t_acvt", nullable = true, length = 6)
    private String tAcvt;
    @Basic
    @Column(name = "t_item", nullable = true, length = 47)
    private String tItem;
    @Basic
    @Column(name = "t_serl", nullable = true, length = 30)
    private String tSerl;
    @Basic
    @Column(name = "t_ssts", nullable = true, length = 6)
    private String tSsts;
    @Basic
    @Column(name = "t_lsel", nullable = true, length = 6)
    private String tLsel;
    @Basic
    @Column(name = "t_clot", nullable = true, length = 20)
    private String tClot;
    @Basic
    @Column(name = "t_effn", nullable = true, length = 6)
    private String tEffn;
    @Basic
    @Column(name = "t_revi", nullable = true, length = 6)
    private String tRevi;
    @Basic
    @Column(name = "t_prio", nullable = true, length = 10)
    private String tPrio;
    @Basic
    @Column(name = "t_qoro", nullable = true, length = 6)
    private String tQoro;
    @Basic
    @Column(name = "t_orun", nullable = true, length = 6)
    private String tOrun;
    @Basic
    @Column(name = "t_ubin", nullable = true, length = 6)
    private String tUbin;
    @Basic
    @Column(name = "t_hstq", nullable = true, length = 6)
    private String tHstq;
    @Basic
    @Column(name = "t_qord", nullable = true, length = 6)
    private String tQord;
    @Basic
    @Column(name = "t_qadv", nullable = true, length = 6)
    private String tQadv;
    @Basic
    @Column(name = "t_qrel", nullable = true, length = 6)
    private String tQrel;
    @Basic
    @Column(name = "t_qpic", nullable = true, length = 6)
    private String tQpic;
    @Basic
    @Column(name = "t_qapr", nullable = true, length = 6)
    private String tQapr;
    @Basic
    @Column(name = "t_qrej", nullable = true, length = 6)
    private String tQrej;
    @Basic
    @Column(name = "t_qnse", nullable = true, length = 6)
    private String tQnse;
    @Basic
    @Column(name = "t_qnsh", nullable = true, length = 6)
    private String tQnsh;
    @Basic
    @Column(name = "t_qshp", nullable = true, length = 6)
    private String tQshp;
    @Basic
    @Column(name = "t_qoor", nullable = true, length = 6)
    private String tQoor;
    @Basic
    @Column(name = "t_qova", nullable = true, length = 6)
    private String tQova;
    @Basic
    @Column(name = "t_qovd", nullable = true, length = 6)
    private String tQovd;
    @Basic
    @Column(name = "t_qcnl", nullable = true, length = 6)
    private String tQcnl;
    @Basic
    @Column(name = "t_pddt", nullable = true, length = 23)
    private String tPddt;
    @Basic
    @Column(name = "t_prdt", nullable = true, length = 23)
    private String tPrdt;
    @Basic
    @Column(name = "t_addt", nullable = true, length = 23)
    private String tAddt;
    @Basic
    @Column(name = "t_inup", nullable = true, length = 6)
    private String tInup;
    @Basic
    @Column(name = "t_bflh", nullable = true, length = 6)
    private String tBflh;
    @Basic
    @Column(name = "t_rush", nullable = true, length = 6)
    private String tRush;
    @Basic
    @Column(name = "t_cdck", nullable = true, length = 6)
    private String tCdck;
    @Basic
    @Column(name = "t_qreq", nullable = true, length = 6)
    private String tQreq;
    @Basic
    @Column(name = "t_qcad", nullable = true, length = 6)
    private String tQcad;
    @Basic
    @Column(name = "t_qact", nullable = true, length = 6)
    private String tQact;
    @Basic
    @Column(name = "t_shrt", nullable = true, length = 6)
    private String tShrt;
    @Basic
    @Column(name = "t_blck", nullable = true, length = 6)
    private String tBlck;
    @Basic
    @Column(name = "t_cncl", nullable = true, length = 6)
    private String tCncl;
    @Basic
    @Column(name = "t_bcko", nullable = true, length = 6)
    private String tBcko;
    @Basic
    @Column(name = "t_pkdf", nullable = true, length = 6)
    private String tPkdf;
    @Basic
    @Column(name = "t_iubw", nullable = true, length = 6)
    private String tIubw;
    @Basic
    @Column(name = "t_gefo", nullable = true, length = 6)
    private String tGefo;
    @Basic
    @Column(name = "t_fmor", nullable = true, length = 9)
    private String tFmor;
    @Basic
    @Column(name = "t_fmln", nullable = true, length = 6)
    private String tFmln;
    @Basic
    @Column(name = "t_ovlp", nullable = true, length = 6)
    private String tOvlp;
    @Basic
    @Column(name = "t_uwop", nullable = true, length = 6)
    private String tUwop;
    @Basic
    @Column(name = "t_orpr", nullable = true, length = 6)
    private String tOrpr;
    @Basic
    @Column(name = "t_ocur", nullable = true, length = 6)
    private String tOcur;
    @Basic
    @Column(name = "t_csvl", nullable = true, length = 7)
    private String tCsvl;
    @Basic
    @Column(name = "t_csvc", nullable = true, length = 6)
    private String tCsvc;
    @Basic
    @Column(name = "t_fprj", nullable = true, length = 9)
    private String tFprj;
    @Basic
    @Column(name = "t_fspa", nullable = true, length = 8)
    private String tFspa;
    @Basic
    @Column(name = "t_fact", nullable = true, length = 8)
    private String tFact;
    @Basic
    @Column(name = "t_fstl", nullable = true, length = 6)
    private String tFstl;
    @Basic
    @Column(name = "t_fcco", nullable = true, length = 8)
    private String tFcco;
    @Basic
    @Column(name = "t_tprj", nullable = true, length = 9)
    private String tTprj;
    @Basic
    @Column(name = "t_tspa", nullable = true, length = 8)
    private String tTspa;
    @Basic
    @Column(name = "t_tact", nullable = true, length = 8)
    private String tTact;
    @Basic
    @Column(name = "t_tstl", nullable = true, length = 6)
    private String tTstl;
    @Basic
    @Column(name = "t_tcco", nullable = true, length = 8)
    private String tTcco;
    @Basic
    @Column(name = "t_refe", nullable = true, length = 30)
    private String tRefe;
    @Basic
    @Column(name = "t_casi", nullable = true, length = 6)
    private String tCasi;
    @Basic
    @Column(name = "t_wmss", nullable = true, length = 6)
    private String tWmss;
    @Basic
    @Column(name = "t_lsta", nullable = true, length = 6)
    private String tLsta;
    @Basic
    @Column(name = "t_txtn", nullable = true, length = 6)
    private String tTxtn;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 9)
    private String tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 9)
    private String tRefcntu;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "t_item", insertable = false, updatable = false)
    @JsonIgnore
    private Ttcibd001120Entity ttcibd001120Entity;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "t_orno", insertable = false, updatable = false)
    @JsonIgnore
    private Twhinh200120Entity twhinh200120Entity;
    public Twhinh220120Entity(Twhinh200120Entity twhinh200120Entity) {
        this.twhinh200120Entity = twhinh200120Entity;
    }
    public Twhinh220120Entity() {}

 /*   public Twhinh200120Entity getTwhinh200120Entity() {
        return twhinh200120Entity;
    }
    public void setTwhinh200120Entity(Twhinh200120Entity twhinh200120Entity) {
        this.twhinh200120Entity = twhinh200120Entity;
    }
    public Ttcibd001120Entity getTtcibd001120Entity() {
        return ttcibd001120Entity;
    }
    public void setTtcibd001120Entity(Ttcibd001120Entity ttcibd001120Entity) {
        this.ttcibd001120Entity = ttcibd001120Entity;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOorg() {
        return oorg;
    }

    public void setOorg(String oorg) {
        this.oorg = oorg;
    }

    public String gettOrno() {
        return tOrno;
    }

    public void settOrno(String tOrno) {
        this.tOrno = tOrno;
    }

    public String gettPono() {
        return tPono;
    }

    public void settPono(String tPono) {
        this.tPono = tPono;
    }

    public String gettSeqn() {
        return tSeqn;
    }

    public void settSeqn(String tSeqn) {
        this.tSeqn = tSeqn;
    }

    public String gettOset() {
        return tOset;
    }

    public void settOset(String tOset) {
        this.tOset = tOset;
    }

    public String gettCwar() {
        return tCwar;
    }

    public void settCwar(String tCwar) {
        this.tCwar = tCwar;
    }

    public String gettComp() {
        return tComp;
    }

    public void settComp(String tComp) {
        this.tComp = tComp;
    }

    public String gettAcvt() {
        return tAcvt;
    }

    public void settAcvt(String tAcvt) {
        this.tAcvt = tAcvt;
    }

    public String gettItem() {
        return tItem;
    }

    public void settItem(String tItem) {
        this.tItem = tItem;
    }

    public String gettSerl() {
        return tSerl;
    }

    public void settSerl(String tSerl) {
        this.tSerl = tSerl;
    }

    public String gettSsts() {
        return tSsts;
    }

    public void settSsts(String tSsts) {
        this.tSsts = tSsts;
    }

    public String gettLsel() {
        return tLsel;
    }

    public void settLsel(String tLsel) {
        this.tLsel = tLsel;
    }

    public String gettClot() {
        return tClot;
    }

    public void settClot(String tClot) {
        this.tClot = tClot;
    }

    public String gettEffn() {
        return tEffn;
    }

    public void settEffn(String tEffn) {
        this.tEffn = tEffn;
    }

    public String gettRevi() {
        return tRevi;
    }

    public void settRevi(String tRevi) {
        this.tRevi = tRevi;
    }

    public String gettPrio() {
        return tPrio;
    }

    public void settPrio(String tPrio) {
        this.tPrio = tPrio;
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

    public String gettUbin() {
        return tUbin;
    }

    public void settUbin(String tUbin) {
        this.tUbin = tUbin;
    }

    public String gettHstq() {
        return tHstq;
    }

    public void settHstq(String tHstq) {
        this.tHstq = tHstq;
    }

    public String gettQord() {
        return tQord;
    }

    public void settQord(String tQord) {
        this.tQord = tQord;
    }

    public String gettQadv() {
        return tQadv;
    }

    public void settQadv(String tQadv) {
        this.tQadv = tQadv;
    }

    public String gettQrel() {
        return tQrel;
    }

    public void settQrel(String tQrel) {
        this.tQrel = tQrel;
    }

    public String gettQpic() {
        return tQpic;
    }

    public void settQpic(String tQpic) {
        this.tQpic = tQpic;
    }

    public String gettQapr() {
        return tQapr;
    }

    public void settQapr(String tQapr) {
        this.tQapr = tQapr;
    }

    public String gettQrej() {
        return tQrej;
    }

    public void settQrej(String tQrej) {
        this.tQrej = tQrej;
    }

    public String gettQnse() {
        return tQnse;
    }

    public void settQnse(String tQnse) {
        this.tQnse = tQnse;
    }

    public String gettQnsh() {
        return tQnsh;
    }

    public void settQnsh(String tQnsh) {
        this.tQnsh = tQnsh;
    }

    public String gettQshp() {
        return tQshp;
    }

    public void settQshp(String tQshp) {
        this.tQshp = tQshp;
    }

    public String gettQoor() {
        return tQoor;
    }

    public void settQoor(String tQoor) {
        this.tQoor = tQoor;
    }

    public String gettQova() {
        return tQova;
    }

    public void settQova(String tQova) {
        this.tQova = tQova;
    }

    public String gettQovd() {
        return tQovd;
    }

    public void settQovd(String tQovd) {
        this.tQovd = tQovd;
    }

    public String gettQcnl() {
        return tQcnl;
    }

    public void settQcnl(String tQcnl) {
        this.tQcnl = tQcnl;
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

    public String gettAddt() {
        return tAddt;
    }

    public void settAddt(String tAddt) {
        this.tAddt = tAddt;
    }

    public String gettInup() {
        return tInup;
    }

    public void settInup(String tInup) {
        this.tInup = tInup;
    }

    public String gettBflh() {
        return tBflh;
    }

    public void settBflh(String tBflh) {
        this.tBflh = tBflh;
    }

    public String gettRush() {
        return tRush;
    }

    public void settRush(String tRush) {
        this.tRush = tRush;
    }

    public String gettCdck() {
        return tCdck;
    }

    public void settCdck(String tCdck) {
        this.tCdck = tCdck;
    }

    public String gettQreq() {
        return tQreq;
    }

    public void settQreq(String tQreq) {
        this.tQreq = tQreq;
    }

    public String gettQcad() {
        return tQcad;
    }

    public void settQcad(String tQcad) {
        this.tQcad = tQcad;
    }

    public String gettQact() {
        return tQact;
    }

    public void settQact(String tQact) {
        this.tQact = tQact;
    }

    public String gettShrt() {
        return tShrt;
    }

    public void settShrt(String tShrt) {
        this.tShrt = tShrt;
    }

    public String gettBlck() {
        return tBlck;
    }

    public void settBlck(String tBlck) {
        this.tBlck = tBlck;
    }

    public String gettCncl() {
        return tCncl;
    }

    public void settCncl(String tCncl) {
        this.tCncl = tCncl;
    }

    public String gettBcko() {
        return tBcko;
    }

    public void settBcko(String tBcko) {
        this.tBcko = tBcko;
    }

    public String gettPkdf() {
        return tPkdf;
    }

    public void settPkdf(String tPkdf) {
        this.tPkdf = tPkdf;
    }

    public String gettIubw() {
        return tIubw;
    }

    public void settIubw(String tIubw) {
        this.tIubw = tIubw;
    }

    public String gettGefo() {
        return tGefo;
    }

    public void settGefo(String tGefo) {
        this.tGefo = tGefo;
    }

    public String gettFmor() {
        return tFmor;
    }

    public void settFmor(String tFmor) {
        this.tFmor = tFmor;
    }

    public String gettFmln() {
        return tFmln;
    }

    public void settFmln(String tFmln) {
        this.tFmln = tFmln;
    }

    public String gettOvlp() {
        return tOvlp;
    }

    public void settOvlp(String tOvlp) {
        this.tOvlp = tOvlp;
    }

    public String gettUwop() {
        return tUwop;
    }

    public void settUwop(String tUwop) {
        this.tUwop = tUwop;
    }

    public String gettOrpr() {
        return tOrpr;
    }

    public void settOrpr(String tOrpr) {
        this.tOrpr = tOrpr;
    }

    public String gettOcur() {
        return tOcur;
    }

    public void settOcur(String tOcur) {
        this.tOcur = tOcur;
    }

    public String gettCsvl() {
        return tCsvl;
    }

    public void settCsvl(String tCsvl) {
        this.tCsvl = tCsvl;
    }

    public String gettCsvc() {
        return tCsvc;
    }

    public void settCsvc(String tCsvc) {
        this.tCsvc = tCsvc;
    }

    public String gettFprj() {
        return tFprj;
    }

    public void settFprj(String tFprj) {
        this.tFprj = tFprj;
    }

    public String gettFspa() {
        return tFspa;
    }

    public void settFspa(String tFspa) {
        this.tFspa = tFspa;
    }

    public String gettFact() {
        return tFact;
    }

    public void settFact(String tFact) {
        this.tFact = tFact;
    }

    public String gettFstl() {
        return tFstl;
    }

    public void settFstl(String tFstl) {
        this.tFstl = tFstl;
    }

    public String gettFcco() {
        return tFcco;
    }

    public void settFcco(String tFcco) {
        this.tFcco = tFcco;
    }

    public String gettTprj() {
        return tTprj;
    }

    public void settTprj(String tTprj) {
        this.tTprj = tTprj;
    }

    public String gettTspa() {
        return tTspa;
    }

    public void settTspa(String tTspa) {
        this.tTspa = tTspa;
    }

    public String gettTact() {
        return tTact;
    }

    public void settTact(String tTact) {
        this.tTact = tTact;
    }

    public String gettTstl() {
        return tTstl;
    }

    public void settTstl(String tTstl) {
        this.tTstl = tTstl;
    }

    public String gettTcco() {
        return tTcco;
    }

    public void settTcco(String tTcco) {
        this.tTcco = tTcco;
    }

    public String gettRefe() {
        return tRefe;
    }

    public void settRefe(String tRefe) {
        this.tRefe = tRefe;
    }

    public String gettCasi() {
        return tCasi;
    }

    public void settCasi(String tCasi) {
        this.tCasi = tCasi;
    }

    public String gettWmss() {
        return tWmss;
    }

    public void settWmss(String tWmss) {
        this.tWmss = tWmss;
    }

    public String gettLsta() {
        return tLsta;
    }

    public void settLsta(String tLsta) {
        this.tLsta = tLsta;
    }

    public String gettTxtn() {
        return tTxtn;
    }

    public void settTxtn(String tTxtn) {
        this.tTxtn = tTxtn;
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

    /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Twhinh220120Entity that = (Twhinh220120Entity) o;
        return Objects.equals(oorg, that.oorg) && Objects.equals(tOrno, that.tOrno) && Objects.equals(tPono, that.tPono) && Objects.equals(tSeqn, that.tSeqn) && Objects.equals(tOset, that.tOset) && Objects.equals(tCwar, that.tCwar) && Objects.equals(tComp, that.tComp) && Objects.equals(tAcvt, that.tAcvt) && Objects.equals(tItem, that.tItem) && Objects.equals(tSerl, that.tSerl) && Objects.equals(tSsts, that.tSsts) && Objects.equals(tLsel, that.tLsel) && Objects.equals(tClot, that.tClot) && Objects.equals(tEffn, that.tEffn) && Objects.equals(tRevi, that.tRevi) && Objects.equals(tPrio, that.tPrio) && Objects.equals(tQoro, that.tQoro) && Objects.equals(tOrun, that.tOrun) && Objects.equals(tUbin, that.tUbin) && Objects.equals(tHstq, that.tHstq) && Objects.equals(tQord, that.tQord) && Objects.equals(tQadv, that.tQadv) && Objects.equals(tQrel, that.tQrel) && Objects.equals(tQpic, that.tQpic) && Objects.equals(tQapr, that.tQapr) && Objects.equals(tQrej, that.tQrej) && Objects.equals(tQnse, that.tQnse) && Objects.equals(tQnsh, that.tQnsh) && Objects.equals(tQshp, that.tQshp) && Objects.equals(tQoor, that.tQoor) && Objects.equals(tQova, that.tQova) && Objects.equals(tQovd, that.tQovd) && Objects.equals(tQcnl, that.tQcnl) && Objects.equals(tPddt, that.tPddt) && Objects.equals(tPrdt, that.tPrdt) && Objects.equals(tAddt, that.tAddt) && Objects.equals(tInup, that.tInup) && Objects.equals(tBflh, that.tBflh) && Objects.equals(tRush, that.tRush) && Objects.equals(tCdck, that.tCdck) && Objects.equals(tQreq, that.tQreq) && Objects.equals(tQcad, that.tQcad) && Objects.equals(tQact, that.tQact) && Objects.equals(tShrt, that.tShrt) && Objects.equals(tBlck, that.tBlck) && Objects.equals(tCncl, that.tCncl) && Objects.equals(tBcko, that.tBcko) && Objects.equals(tPkdf, that.tPkdf) && Objects.equals(tIubw, that.tIubw) && Objects.equals(tGefo, that.tGefo) && Objects.equals(tFmor, that.tFmor) && Objects.equals(tFmln, that.tFmln) && Objects.equals(tOvlp, that.tOvlp) && Objects.equals(tUwop, that.tUwop) && Objects.equals(tOrpr, that.tOrpr) && Objects.equals(tOcur, that.tOcur) && Objects.equals(tCsvl, that.tCsvl) && Objects.equals(tCsvc, that.tCsvc) && Objects.equals(tFprj, that.tFprj) && Objects.equals(tFspa, that.tFspa) && Objects.equals(tFact, that.tFact) && Objects.equals(tFstl, that.tFstl) && Objects.equals(tFcco, that.tFcco) && Objects.equals(tTprj, that.tTprj) && Objects.equals(tTspa, that.tTspa) && Objects.equals(tTact, that.tTact) && Objects.equals(tTstl, that.tTstl) && Objects.equals(tTcco, that.tTcco) && Objects.equals(tRefe, that.tRefe) && Objects.equals(tCasi, that.tCasi) && Objects.equals(tWmss, that.tWmss) && Objects.equals(tLsta, that.tLsta) && Objects.equals(tTxtn, that.tTxtn) && Objects.equals(tRefcntd, that.tRefcntd) && Objects.equals(tRefcntu, that.tRefcntu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oorg, tOrno, tPono, tSeqn, tOset, tCwar, tComp, tAcvt, tItem, tSerl, tSsts, tLsel, tClot, tEffn, tRevi, tPrio, tQoro, tOrun, tUbin, tHstq, tQord, tQadv, tQrel, tQpic, tQapr, tQrej, tQnse, tQnsh, tQshp, tQoor, tQova, tQovd, tQcnl, tPddt, tPrdt, tAddt, tInup, tBflh, tRush, tCdck, tQreq, tQcad, tQact, tShrt, tBlck, tCncl, tBcko, tPkdf, tIubw, tGefo, tFmor, tFmln, tOvlp, tUwop, tOrpr, tOcur, tCsvl, tCsvc, tFprj, tFspa, tFact, tFstl, tFcco, tTprj, tTspa, tTact, tTstl, tTcco, tRefe, tCasi, tWmss, tLsta, tTxtn, tRefcntd, tRefcntu);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Twhinh220120Entity)) return false;
        Twhinh220120Entity that = (Twhinh220120Entity) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getOorg(),
                that.getOorg()) && Objects.equals(gettOrno(),
                that.gettOrno()) && Objects.equals(gettPono(),
                that.gettPono()) && Objects.equals(gettSeqn(),
                that.gettSeqn()) && Objects.equals(gettOset(),
                that.gettOset()) && Objects.equals(gettCwar(),
                that.gettCwar()) && Objects.equals(gettComp(),
                that.gettComp()) && Objects.equals(gettAcvt(),
                that.gettAcvt()) && Objects.equals(gettItem(),
                that.gettItem()) && Objects.equals(gettSerl(),
                that.gettSerl()) && Objects.equals(gettSsts(),
                that.gettSsts()) && Objects.equals(gettLsel(),
                that.gettLsel()) && Objects.equals(gettClot(),
                that.gettClot()) && Objects.equals(gettEffn(),
                that.gettEffn()) && Objects.equals(gettRevi(),
                that.gettRevi()) && Objects.equals(gettPrio(),
                that.gettPrio()) && Objects.equals(gettQoro(),
                that.gettQoro()) && Objects.equals(gettOrun(),
                that.gettOrun()) && Objects.equals(gettUbin(),
                that.gettUbin()) && Objects.equals(gettHstq(),
                that.gettHstq()) && Objects.equals(gettQord(),
                that.gettQord()) && Objects.equals(gettQadv(),
                that.gettQadv()) && Objects.equals(gettQrel(),
                that.gettQrel()) && Objects.equals(gettQpic(),
                that.gettQpic()) && Objects.equals(gettQapr(),
                that.gettQapr()) && Objects.equals(gettQrej(),
                that.gettQrej()) && Objects.equals(gettQnse(),
                that.gettQnse()) && Objects.equals(gettQnsh(),
                that.gettQnsh()) && Objects.equals(gettQshp(),
                that.gettQshp()) && Objects.equals(gettQoor(),
                that.gettQoor()) && Objects.equals(gettQova(),
                that.gettQova()) && Objects.equals(gettQovd(),
                that.gettQovd()) && Objects.equals(gettQcnl(),
                that.gettQcnl()) && Objects.equals(gettPddt(),
                that.gettPddt()) && Objects.equals(gettPrdt(),
                that.gettPrdt()) && Objects.equals(gettAddt(),
                that.gettAddt()) && Objects.equals(gettInup(),
                that.gettInup()) && Objects.equals(gettBflh(),
                that.gettBflh()) && Objects.equals(gettRush(),
                that.gettRush()) && Objects.equals(gettCdck(),
                that.gettCdck()) && Objects.equals(gettQreq(),
                that.gettQreq()) && Objects.equals(gettQcad(),
                that.gettQcad()) && Objects.equals(gettQact(),
                that.gettQact()) && Objects.equals(gettShrt(),
                that.gettShrt()) && Objects.equals(gettBlck(),
                that.gettBlck()) && Objects.equals(gettCncl(),
                that.gettCncl()) && Objects.equals(gettBcko(),
                that.gettBcko()) && Objects.equals(gettPkdf(),
                that.gettPkdf()) && Objects.equals(gettIubw(),
                that.gettIubw()) && Objects.equals(gettGefo(),
                that.gettGefo()) && Objects.equals(gettFmor(),
                that.gettFmor()) && Objects.equals(gettFmln(),
                that.gettFmln()) && Objects.equals(gettOvlp(),
                that.gettOvlp()) && Objects.equals(gettUwop(),
                that.gettUwop()) && Objects.equals(gettOrpr(),
                that.gettOrpr()) && Objects.equals(gettOcur(),
                that.gettOcur()) && Objects.equals(gettCsvl(),
                that.gettCsvl()) && Objects.equals(gettCsvc(),
                that.gettCsvc()) && Objects.equals(gettFprj(),
                that.gettFprj()) && Objects.equals(gettFspa(),
                that.gettFspa()) && Objects.equals(gettFact(),
                that.gettFact()) && Objects.equals(gettFstl(),
                that.gettFstl()) && Objects.equals(gettFcco(),
                that.gettFcco()) && Objects.equals(gettTprj(),
                that.gettTprj()) && Objects.equals(gettTspa(),
                that.gettTspa()) && Objects.equals(gettTact(),
                that.gettTact()) && Objects.equals(gettTstl(),
                that.gettTstl()) && Objects.equals(gettTcco(),
                that.gettTcco()) && Objects.equals(gettRefe(),
                that.gettRefe()) && Objects.equals(gettCasi(),
                that.gettCasi()) && Objects.equals(gettWmss(),
                that.gettWmss()) && Objects.equals(gettLsta(),
                that.gettLsta()) && Objects.equals(gettTxtn(),
                that.gettTxtn()) && Objects.equals(gettRefcntd(),
                that.gettRefcntd()) && Objects.equals(gettRefcntu(),
                that.gettRefcntu()) && Objects.equals(ttcibd001120Entity, that.ttcibd001120Entity)
                && Objects.equals(twhinh200120Entity, that.twhinh200120Entity);
    }



    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOorg(), gettOrno(), gettPono(), gettSeqn(),
                gettOset(), gettCwar(), gettComp(), gettAcvt(), gettItem(),
                gettSerl(), gettSsts(), gettLsel(), gettClot(), gettEffn(),
                gettRevi(), gettPrio(), gettQoro(), gettOrun(), gettUbin(),
                gettHstq(), gettQord(), gettQadv(), gettQrel(), gettQpic(),
                gettQapr(), gettQrej(), gettQnse(), gettQnsh(), gettQshp(),
                gettQoor(), gettQova(), gettQovd(), gettQcnl(), gettPddt(),
                gettPrdt(), gettAddt(), gettInup(), gettBflh(), gettRush(),
                gettCdck(), gettQreq(), gettQcad(), gettQact(), gettShrt(),
                gettBlck(), gettCncl(), gettBcko(), gettPkdf(), gettIubw(),
                gettGefo(), gettFmor(), gettFmln(), gettOvlp(), gettUwop(),
                gettOrpr(), gettOcur(), gettCsvl(), gettCsvc(), gettFprj(),
                gettFspa(), gettFact(), gettFstl(), gettFcco(), gettTprj(),
                gettTspa(), gettTact(), gettTstl(), gettTcco(), gettRefe(),
                gettCasi(), gettWmss(), gettLsta(), gettTxtn(), gettRefcntd(),
                gettRefcntu(), ttcibd001120Entity, twhinh200120Entity);
    }*/
}

