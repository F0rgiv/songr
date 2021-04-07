package com.jamesmansour.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue
    long id;
    String title;
    int length;
    int trackNumber;

    @ManyToOne
    @JoinColumn(name="album_id")
    Album album;
}
