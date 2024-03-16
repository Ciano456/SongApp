/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songapp;

/**
 *
 * @author cianoconnor
 */
public class NewSong {
    private String song;
    private String artist;
    private String genre;
    
    public NewSong() {
    }
    
    //constructor
    public NewSong(String song, String artist, String genre) {
        this.song = song;
        this.artist = artist;
        this.genre = genre;
    }

    //returns the song name
    public String getSong() {
        return song;
    }

    //returns the artist
    public String getArtist() {
        return artist;
    }
    
   
    //returns the genre
    public String getGenre() {
        return genre;
    }
    
    //sets the song
    public void setSong(String song) {
        this.song = song; 
    }
    
    //sets the artist
    public void setArtist(String artist) {
        this.artist = artist; 
    }
    
    //sets the genre
    public void setGenre (String genre) {
        this.genre = genre; 
    }
    
   
}
