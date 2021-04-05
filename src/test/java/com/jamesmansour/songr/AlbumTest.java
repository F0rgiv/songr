package com.jamesmansour.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @Test
    void getTitle() {
        Album album1 = new Album("album1", "Artist1", 100, 18200, "sample_url");
        Album album2 = new Album("album2", "Artist2", 10, 1820, "sample_url/tothe.place");
        assertEquals("album1", album1.getTitle());
        assertEquals(album1.title, album1.getTitle());
        assertEquals("album2", album2.getTitle());
        assertEquals(album2.title, album2.getTitle());
    }

    @Test
    void setTitle() {
        Album album = new Album("album1", "Artist1", 100, 18200, "sample_url");
        album.setTitle("change1");
        assertEquals("change1", album.getTitle());
        assertEquals(album.title, album.getTitle());
        album.setTitle("change2");
        assertEquals("change2", album.getTitle());
        assertEquals(album.title, album.getTitle());
    }

    @Test
    void getArtist() {
        Album album1 = new Album("album1", "Artist1", 100, 18200, "sample_url");
        Album album2 = new Album("album2", "Artist2", 10, 1820, "sample_url/tothe.place");
        assertEquals("Artist1", album1.getArtist());
        assertEquals(album1.artist, album1.getArtist());
        assertEquals("Artist2", album2.getArtist());
        assertEquals(album2.artist, album2.getArtist());
    }

    @Test
    void setArtist() {
        Album album = new Album("album1", "Artist1", 100, 18200, "sample_url");
        album.setArtist("change1");
        assertEquals("change1", album.getArtist());
        assertEquals(album.artist, album.getArtist());
        album.setArtist("change2");
        assertEquals("change2", album.getArtist());
        assertEquals(album.artist, album.getArtist());
    }

    @Test
    void getSongCount() {
        Album album1 = new Album("album1", "Artist1", 100, 18200, "sample_url");
        Album album2 = new Album("album2", "Artist2", 10, 1820, "sample_url/tothe.place");
        assertEquals( 100, album1.getSongCount());
        assertEquals(album1.songCount, album1.getSongCount());
        assertEquals(10, album2.getSongCount());
        assertEquals(album2.songCount, album2.getSongCount());
    }

    @Test
    void setSongCount() {
        Album album = new Album("album1", "Artist1", 100, 18200, "sample_url");
        album.setSongCount(1);
        assertEquals(1, album.getSongCount());
        assertEquals(album.songCount, album.getSongCount());
        album.setSongCount(2);
        assertEquals(2, album.getSongCount());
        assertEquals(album.songCount, album.getSongCount());
    }

    @Test
    void getLength() {
        Album album1 = new Album("album1", "Artist1", 100, 18200, "sample_url");
        Album album2 = new Album("album2", "Artist2", 10, 1820, "sample_url/tothe.place");
        assertEquals(18200, album1.getLength());
        assertEquals(album1.length, album1.getLength());
        assertEquals(1820, album2.getLength());
        assertEquals(album2.length, album2.getLength());
    }

    @Test
    void setLength() {
        Album album = new Album("album1", "Artist1", 100, 18200, "sample_url");
        album.setLength(1);
        assertEquals(1, album.getLength());
        assertEquals(album.length, album.getLength());
        album.setLength(2);
        assertEquals(2, album.getLength());
        assertEquals(album.length, album.getLength());
    }

    @Test
    void getImgUrl() {
        Album album1 = new Album("album1", "Artist1", 100, 18200, "sample_url");
        Album album2 = new Album("album2", "Artist2", 10, 1820, "sample_url/tothe.place");
        assertEquals("sample_url", album1.getImgUrl());
        assertEquals(album1.imgUrl, album1.getImgUrl());
        assertEquals("sample_url/tothe.place", album2.getImgUrl());
        assertEquals(album2.imgUrl, album2.getImgUrl());
    }

    @Test
    void setImgUrl() {
        Album album = new Album("album1", "Artist1", 100, 18200, "sample_url");
        album.setImgUrl("change1");
        assertEquals("change1", album.getImgUrl());
        assertEquals(album.imgUrl, album.getImgUrl());
        album.setImgUrl("change2");
        assertEquals("change2", album.getImgUrl());
        assertEquals(album.imgUrl, album.getImgUrl());
    }
}