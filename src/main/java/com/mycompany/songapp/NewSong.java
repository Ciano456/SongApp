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

    public NewSong(String song, String artist, String genre) {
        this.song = song;
        this.artist = artist;
        this.genre = genre;
    }

    
    public String getSong() {
        return song;
    }

    
    public String getArtist() {
        return artist;
    }
    
   
   
    public String getGenre() {
        return genre;
    }
    
    public void setSong(String song) {
        this.song = song; 
    }
    
    public void setArtist(String artist) {
        this.artist = artist; 
    }
    
    public void setGenre (String genre) {
        this.genre = genre; 
    }
    
   
}
