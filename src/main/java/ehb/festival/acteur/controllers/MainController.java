package ehb.festival.acteur.controllers;

import ehb.festival.acteur.dao.ActeurDAO;
import ehb.festival.acteur.dao.FestivalDAO;
import ehb.festival.acteur.entities.Acteur;
import ehb.festival.acteur.entities.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private ActeurDAO mActeurDAO;
    private FestivalDAO mFestivalDAO;

    @Autowired
    public MainController(ActeurDAO mActeurDAO, FestivalDAO mFestivalDAO) {
        this.mActeurDAO = mActeurDAO;
        this.mFestivalDAO = mFestivalDAO;
    }

    @GetMapping("/festivals")
    @ResponseBody
    public Iterable<Festival> giveAllFestivals(){
        return mFestivalDAO.findAll();
    }

    @PostMapping("/acteur/new")
    @ResponseBody
    public HttpStatus createActeur (@RequestParam(value = "naam")String naam,
                                    @RequestParam(value = "leeftijd")int leeftijd,
                                    @RequestParam(value = "prijs")double prijs){

        Acteur temp = new Acteur();
        temp.setLeeftijd(leeftijd);
        temp.setNaam(naam);
        temp.setPrijs(prijs);
        mActeurDAO.save(temp);
        return HttpStatus.OK;
    }
}
