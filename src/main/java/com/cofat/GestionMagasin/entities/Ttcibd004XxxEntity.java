package com.cofat.GestionMagasin.entities;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "ttcibd004xxx")
public class Ttcibd004XxxEntity {
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "t_citt", nullable = true, length = 6)
    private String tCitt;
    //concatination = unique
    @Basic
    @Column(name = "t_bpid", nullable = true, length = 9)
    private String tBpid;
    @Basic
    @Column(name = "t_item", nullable = true, length = 15)
    private String tItem;
    @Basic
    @Column(name = "t_aitc", nullable = true, length = 35)
    private String tAitc;
    @Basic
    @Column(name = "t_Refcntd", nullable = true, length = 9)
    private String tRefcntd;
    @Basic
    @Column(name = "t_Refcntu", nullable = true, length = 9)
    private String tRefcntu;

    /* @OneToMany(mappedBy = "ttcibd004XxxEntity", cascade = CascadeType.ALL, orphanRemoval = true)
     private Set<Ttcibd001120Entity> ttcibd001120Entities = new LinkedHashSet<>();
 */
  @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "t_item", insertable = false, updatable = false)
    private Ttcibd001120Entity ttcibd001120Entity;

    public Ttcibd001120Entity getTtcibd001120Entity() {
        return ttcibd001120Entity;
    }
    public void setTtcibd001120Entity(Ttcibd001120Entity ttcibd001120Entity) {
        this.ttcibd001120Entity = ttcibd001120Entity;
    }
    /*
        public Set<Ttcibd001120Entity> getTtcibd001120Entities() {
            return ttcibd001120Entities;
            return ttcibd001120Entities;
        }

        public void setTtcibd001120Entities(Set<Ttcibd001120Entity> ttcibd001120Entities) {
            this.ttcibd001120Entities = ttcibd001120Entities;
        }
    */
    public String gettCitt() {
        return tCitt;
    }

    public void settCitt(String tCitt) {
        this.tCitt = tCitt;
    }

    public String gettBpid() {
        return tBpid;
    }

    public void settBpid(String tBpid) {
        this.tBpid = tBpid;
    }

    public String gettItem() {
        return tItem;
    }

    public void settItem(String tItem) {
        this.tItem = tItem;
    }

    public String gettAitc() {
        return tAitc;
    }

    public void settAitc(String tAitc) {
        this.tAitc = tAitc;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ttcibd004XxxEntity that = (Ttcibd004XxxEntity) o;
        return Objects.equals(tCitt, that.tCitt) && Objects.equals(tBpid, that.tBpid) && Objects.equals(tItem, that.tItem) && Objects.equals(tAitc, that.tAitc) && Objects.equals(tRefcntd, that.tRefcntd) && Objects.equals(tRefcntu, that.tRefcntu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tCitt, tBpid, tItem, tAitc, tRefcntd, tRefcntu);
    }
}
