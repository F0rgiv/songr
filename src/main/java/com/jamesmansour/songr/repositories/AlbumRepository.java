package com.jamesmansour.songr.repositories;

import com.jamesmansour.songr.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
