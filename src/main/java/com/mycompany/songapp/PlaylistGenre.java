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
public class PlaylistGenre {
    private Map<String, Playlist> playlists;

    // Constructor
    public PlaylistGenre() {
        this.playlists = new HashMap<>();
    }
    
    public class PlaylistMake {

        public static Playlist createPlaylist(String genre) {

            if(genre.equalsIgnoreCase("Country")){
                return new PlaylistOne();
            } else
                return new PlaylistTwo();
        }
    }
    

 
    public Playlist getPlaylist(String genre) {
        return playlists.get(genre);
    }

    // check to see if playlist is made already
    public boolean playlistExists(String genre) {
        return playlists.containsKey(genre);
    }
    
    
    //creating new playlist method
    public boolean registerNewPlaylist(String genre, Playlist playlist) {
        if (!playlists.containsKey(genre)) {
            playlists.put(genre, playlist); 
            return true; 
        }
        return false; 
    }
}
