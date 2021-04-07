package com.jamesmansour.songr.controllers;

import com.jamesmansour.songr.Album;
import com.jamesmansour.songr.models.Song;
import com.jamesmansour.songr.repositories.AlbumRepository;
import com.jamesmansour.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    //==================Model wiring=================
    @Autowired
    public SongRepository songRepository;
    @Autowired
    public AlbumRepository albumRepository;

    //=======================Routs===================

    @PostMapping("/addSong")
    public RedirectView addAlbum(
            String title,
            int length,
            int trackNumber,
            long album_id
    ) {
        Album album = albumRepository.getOne(album_id);
        songRepository.save(new Song(title, length, trackNumber, album));
        return new RedirectView("/album/" + album_id);
    }
}
