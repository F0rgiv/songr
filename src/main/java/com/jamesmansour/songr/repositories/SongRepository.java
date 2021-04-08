package com.jamesmansour.songr.repositories;

import com.jamesmansour.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
