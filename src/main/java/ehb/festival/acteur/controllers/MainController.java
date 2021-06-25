package ehb.festival.acteur.controllers;

import ehb.festival.acteur.dao.ActeurDAO;
import ehb.festival.acteur.dao.FestivalDAO;
import ehb.festival.acteur.entities.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
