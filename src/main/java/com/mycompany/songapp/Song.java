/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songapp;

import java.util.*; 
/**
 *
 * @author cianoconnor
 */
public class Song {
    
    private String song; 
    private String artist; 
    private String genre; 
    
    public Song(String song, String artist, String genre) {
        this.song = song; 
        this.artist = artist; 
        this.genre = genre; 
    }
    
    public String getSong () {
        return song;
    }
    
    public String getArtist () {
        return artist; 
    }
    
    public String getGenre () {
        return genre; 
    }
}
