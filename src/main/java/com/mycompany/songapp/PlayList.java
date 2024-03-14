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
public class PlayList {
    private String name;
    private List<Song> songs; 
    
    public PlayList (String name) {
        this.name = name;
        this.songs = new ArrayList<>(); 
    }
    
    public String getName() {
        return name; 
    }
    
    public List<Song> getSongs() {
        return songs; 
    }
    
    public void addSong(Song song) {
        songs.add(song); 
    }
    
    public void removeSong(Song song) {
        songs.remove(song); 
    }
   
}
