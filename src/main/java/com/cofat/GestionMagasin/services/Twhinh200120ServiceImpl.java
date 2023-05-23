package com.cofat.GestionMagasin.services;

import com.cofat.GestionMagasin.entities.Twhinh200120;
import com.cofat.GestionMagasin.entities.Twhinh200120Entity;
import com.cofat.GestionMagasin.entities.Twhinh204120;
import com.cofat.GestionMagasin.repository.Twhinh200120Repository;
import com.sun.source.tree.CatchTree;
import org.hibernate.validator.cfg.defs.NullDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.support.NullValue;
import org.springframework.data.auditing.CurrentDateTimeProvider;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.oxm.xstream.CatchAllConverter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Null;
import java.beans.Transient;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class Twhinh200120ServiceImpl implements ITwhinh200120Service {

    @Autowired
    Twhinh200120Repository twhinh200120Repository;



    @Override
    public void addTwhinh200120() {
        Twhinh200120Entity t = new Twhinh200120Entity();
        Twhinh200120Entity tt = new Twhinh200120Entity();
        t = twhinh200120Repository.getLast();
        System.out.println(t);
        //t.setId(t.getId()+1);
        tt.settAdat(t.gettAdat());
        tt.settAkit(t.gettAkit());
        tt.settAsst(t.gettAsst());
        tt.settBflh(t.gettBflh());
        tt.settBlor(t.gettBlor());
        tt.settCarr(t.gettCarr());
        tt.settCbin(t.gettCbin());
        tt.settCdec(t.gettCdec());
        tt.settClan(t.gettClan());
        tt.settClgr(t.gettClgr());
        tt.settCons(t.gettCons());
        tt.settCrte(t.gettCrte());
        tt.settCtdt(t.gettCtdt());
        tt.settDelc(t.gettDelc());
        tt.settDepc(t.gettDepc());
        tt.settDmst(t.gettDmst());
        tt.settGrid(t.gettGrid());
        tt.settHsta(t.gettHsta());
        tt.settInfo(t.gettInfo());
        tt.settInvc(t.gettInvc());
        tt.settIsit(t.gettIsit());
        tt.settItem(t.gettItem());
        tt.settIttp(t.gettIttp());
        tt.settList(t.gettList());
        tt.settMaxd(t.gettMaxd());
        tt.settMaxt(t.gettMaxt());
        tt.settMind(t.gettMind());
        tt.settMint(t.gettMint());
        tt.settMotv(t.gettMotv());
        tt.settOdat(t.gettOdat());
        tt.settOorg(t.gettOorg());
        tt.settOrno(t.gettOrno());
        tt.settOrun(t.gettOrun());
        tt.settOset(t.gettOset());
        tt.settOtyp(t.gettOtyp());
        tt.settPddt(t.gettPddt());
        tt.settPrdt(t.gettPrdt());
        tt.settPtpa(t.gettPtpa());
        tt.settQord(t.gettQord());
        tt.settQoro(t.gettQoro());
        tt.settRefcntd(t.gettRefcntd());
        tt.settRefcntu(t.gettRefcntu());
        tt.settRefe(t.gettRefe());
        tt.settRodr(t.gettRodr());
        tt.settRrgd(t.gettRrgd());
        tt.settRtrn(t.gettRtrn());
        tt.settSeri(t.gettSeri());
        tt.settServ(t.gettServ());
        tt.settSetn(t.gettSetn());
        tt.settSfad(t.gettSfad());
        tt.settSfco(t.gettSfco());
        tt.settSfcp(t.gettSfcp());
        tt.settSfit(t.gettSfit());
        tt.settSflo(t.gettSflo());
        tt.settSfrv(t.gettSfrv());
        tt.settSfty(t.gettSfty());
        tt.settStad(t.gettStad());
        tt.settStco(t.gettStco());
        tt.settStcp(t.gettStcp());
        tt.settStit(t.gettStit());
        tt.settStlo(t.gettStlo());
        tt.settStrv(t.gettStrv());
        tt.settStty(t.gettStty());
        tt.settTxta(t.gettTxta());
        tt.settTxtb(t.gettTxtb());
        tt.settWdep(t.gettWdep());

        System.out.println(tt.toString());
      //  twhinh200120Repository.save(t);
    }

    @Override
    public List<Twhinh200120Entity> getAllTwhinh200120Entity() {
        return twhinh200120Repository.findAll();
    }

    @Override
    public void deleteTwhinh200120Entity(String tOorg) {
        twhinh200120Repository.deleteByTOorg(tOorg);

    }

    @Override
    public Twhinh200120Entity getTwhinh200120EntityById(Integer id) {
        return twhinh200120Repository.findById(id);
    }

    @Override
    public Twhinh200120Entity updateTwhinh200120Entity(Twhinh200120Entity twhinh200120Entity) {
        return twhinh200120Repository.save(twhinh200120Entity);
    }

    @Override
    public Twhinh200120Entity FindByTOrno(Twhinh200120Entity twhinh200120Entity) {
        return null;
    }


    @Override
   // @Scheduled(fixedRate = 20*1000) // 8 hours in milliseconds
    public Twhinh200120Entity nextTwhinh200120() {
        Twhinh200120Entity t = new Twhinh200120Entity();
      //  Twhinh200120Entity tt = new Twhinh200120Entity();
        t = twhinh200120Repository.getLast();
       // System.out.println(t);
        //t.setId(t.getId()+1);
        Twhinh200120Entity tt = new Twhinh200120Entity();
        tt.settAdat(t.gettAdat());
        tt.settAkit(t.gettAkit());
        tt.settAsst(t.gettAsst());
        tt.settBflh(t.gettBflh());
        tt.settBlor(t.gettBlor());
        tt.settCarr(t.gettCarr());
        tt.settCbin(t.gettCbin());
        tt.settCdec(t.gettCdec());
        tt.settClan(t.gettClan());
        tt.settClgr(t.gettClgr());
        tt.settCons(t.gettCons());
        tt.settCrte(t.gettCrte());
        tt.settCtdt(t.gettCtdt());
        tt.settDelc(t.gettDelc());
        tt.settDepc(t.gettDepc());
        tt.settDmst(t.gettDmst());
        tt.settGrid(t.gettGrid());
        tt.settHsta(t.gettHsta());
        tt.settInfo(t.gettInfo());
        tt.settInvc(t.gettInvc());
        tt.settIsit(t.gettIsit());
        tt.settItem(t.gettItem());
        tt.settIttp(t.gettIttp());
        tt.settList(t.gettList());
        tt.settMaxd(t.gettMaxd());
        tt.settMaxt(t.gettMaxt());
        tt.settMind(t.gettMind());
        tt.settMint(t.gettMint());
        tt.settMotv(t.gettMotv());
        tt.settOdat(t.gettOdat());
        tt.settOorg(t.gettOorg());
        tt.settOrno(t.gettOrno());
        tt.settOrun(t.gettOrun());
        tt.settOset(t.gettOset());
        tt.settOtyp(t.gettOtyp());
        tt.settPddt(t.gettPddt());
        tt.settPrdt(t.gettPrdt());
        tt.settPtpa(t.gettPtpa());
        tt.settQord(t.gettQord());
        tt.settQoro(t.gettQoro());
        tt.settRefcntd(t.gettRefcntd());
        tt.settRefcntu(t.gettRefcntu());
        tt.settRefe(t.gettRefe());
        tt.settRodr(t.gettRodr());
        tt.settRrgd(t.gettRrgd());
        tt.settRtrn(t.gettRtrn());
        tt.settSeri(t.gettSeri());
        tt.settServ(t.gettServ());
        tt.settSetn(t.gettSetn());
        tt.settSfad(t.gettSfad());
        tt.settSfco(t.gettSfco());
        tt.settSfcp(t.gettSfcp());
        tt.settSfit(t.gettSfit());
        tt.settSflo(t.gettSflo());
        tt.settSfrv(t.gettSfrv());
        tt.settSfty(t.gettSfty());
        tt.settStad(t.gettStad());
        tt.settStco(t.gettStco());
        tt.settStcp(t.gettStcp());
        tt.settStit(t.gettStit());
        tt.settStlo(t.gettStlo());
        tt.settStrv(t.gettStrv());
        tt.settStty(t.gettStty());
        tt.settTxta(t.gettTxta());
        tt.settTxtb(t.gettTxtb());
        tt.settWdep(t.gettWdep());

       // System.out.println(tt.toString());
        if (twhinh200120Repository.save(tt) == t)
        {
            System.out.println("Oui");
        }
        else
        {
            System.out.println("Non");
            twhinh200120Repository.save(tt);
        }
        return tt;
    }



}
