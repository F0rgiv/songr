package com.jamesmansour.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    //==================Model wiring=================
    @Autowired
    public AlbumRepository albumRepository;

    //=======================Routs===================

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        m.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @GetMapping("/addAlbum")
    public String addAlbum(Model m) {
        m.addAttribute("albums", albumRepository.findAll());
        return "addAlbum.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView addAlbum(
            String title,
            String artist,
            int songCount,
            int length,
            String imgUrl
    ){
        albumRepository.save(new Album(title,artist,songCount, length, imgUrl));
        return new RedirectView("/albums");
    }
}
