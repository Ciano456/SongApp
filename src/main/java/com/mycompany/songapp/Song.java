/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.songapp;
import java.util.*; 
/**
 *
 * @author cianoconnor
 */
public interface Song {
    
    //Moves the last liked song to another playlist.
    void moveSong();
    
    //Adds a new song to the liked playlist.
    void addSong(NewSong song);
    
    //Displays the list of liked songs.
    void displayLikedSongs();
}
