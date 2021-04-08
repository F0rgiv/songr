package com.jamesmansour.songr.controllers;

import com.jamesmansour.songr.Album;
import com.jamesmansour.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

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

    @GetMapping("/album/{id}")
    public String getAlbum(Model m, @PathVariable long id) {
        Optional<Album> album = albumRepository.findById(id);
        if (album.isEmpty()) return "albums.html";
        m.addAttribute("album", album.get());
        return "albumDetail.html";
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
