/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songapp;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author cianoconnor
 */
public class PlaylistOne implements Playlist{
private List<NewSong> songs; 
    private boolean isRepeat;

    // Default Constructor
    public PlaylistOne(Boolean isRepeat) {
        this.songs = new ArrayList<>();
        this.isRepeat = false;
    }

    // Overloaded Constructor
    public PlaylistOne() {
        this(false); // Calls the other constructor with default value
    }

    // Getters & Setters
    public List<NewSong> getSongs() {
        return songs;
    }

    public boolean isRepeat() {
        return isRepeat;
    }

    public void setIsRepeat(boolean isRepeat) {
        this.isRepeat = isRepeat;
    }
    
//  Methods from Interface
    @Override
    public void addSong(NewSong song) {
        this.songs.add(song);
    }

@Override
    public void search(String title) {
        List<String> searchResults = new ArrayList<>();

        // Search in the current playlist
        for (NewSong song : songs) {
            if (song.getSong().equalsIgnoreCase(title)) {
                searchResults.add("Found in " + this.getClass().getSimpleName() + " playlist");
                break; // Once found, no need to continue searching
            }
        }

        // Display search results
        if (!searchResults.isEmpty()) {
            StringBuilder message = new StringBuilder("Song found in the following playlist(s):\n");
            for (String result : searchResults) {
                message.append(result).append("\n");
            }
            JOptionPane.showMessageDialog(null, message.toString());
        } else {
            JOptionPane.showMessageDialog(null, "This song is not in the " + this.getClass().getSimpleName() + " playlist");
        }
    }

  @Override
    public void toDisplay() {
//        If the playlist is empty it will alter the user
        if (songs.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The playlist has no songs");
            return;
        }

        StringBuilder message = new StringBuilder("Rock Playlist: \n");
//      if the playlist is repeated display that it is
        if (isRepeat) {
            message.append("This playlist is on repeat. \n");
        }

//       Add each song to the message
        for (NewSong song : songs) {
            message.append(song.getArtist())
                    .append(" - ")
                    .append(song.getSong())
                    .append(" [")
                    .append(song.getGenre())
                    .append("]\n");
        }

//       Display the accumulated message
        JOptionPane.showMessageDialog(null, message.toString());
    }
    
    @Override
    public boolean moveUp(String songName) {
        for (int i = 1; i < songs.size(); i++) {
            if (songs.get(i).getSong().equalsIgnoreCase(songName)) {
                Collections.swap(songs, i, i - 1);
                return true;
            }
        }
        return false; // Song not found or already at the top
    }
    
    @Override
    public boolean moveDown(String songName) {
        for (int i = 0; i < songs.size() - 1; i++) {
            if (songs.get(i).getSong().equalsIgnoreCase(songName)) {
                Collections.swap(songs, i, i + 1);
                return true;
            }
        }
        return false;
    }

    



   

    @Override
    public void delete(String songName) {
        Iterator<NewSong> iterator = songs.iterator();
        while (iterator.hasNext()) {
            NewSong song = iterator.next();
            if (song.getSong().equalsIgnoreCase(songName)) {
                iterator.remove();
                return;
            }
        }
    }
}

