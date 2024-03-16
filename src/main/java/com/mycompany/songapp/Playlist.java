/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.songapp;
import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author cianoconnor
 */
public interface Playlist {
        
        //Adds a new song to the playlist.
        void addSong(NewSong song);
        
        //Searches for a song in the playlist.
        void search(String song);
        
        //Displays the contents of the playlist.
        void toDisplay();
        
        //Deletes a song from the playlist.
        void delete(String songName);
        
        //Sets the repeat mode of the playlist.
        void setIsRepeat(boolean isRepeat);
        
        //Moves a song up in the playlist.
        boolean moveUp(String songName);
        
        //Moves a song down in the playlist.
        boolean moveDown(String songName);
        
}
