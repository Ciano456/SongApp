/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songapp;
import java.util.*; 
import javax.swing.JOptionPane;
/**
 *
 * @author cianoconnor
 */
public class LikedPlaylist implements Song {
    
    // Variables
    private Stack<NewSong> likedSongList = new Stack<>();
    private NewSong lastLikedSong;
    private boolean moveSong = false;
    private javax.swing.JTextArea likedDisplay;


    public NewSong getLastLikedSong() {
        return lastLikedSong;
    }

    public void setLastLikedSong(NewSong lastLikedSong) {
        this.lastLikedSong = lastLikedSong;
    }

    // Default Constructor
    public LikedPlaylist(javax.swing.JTextArea likedDisplay) {
         this.likedDisplay = likedDisplay;
    }

    // Getters & Setters
    public Stack<NewSong> getLikedList() {
        return likedSongList;
    }

    public void setLikedList(Stack<NewSong> likedSongList) {
        this.likedSongList = likedSongList;
    }

    // Methods from Interface
    @Override
    public void moveSong() { 
        if(moveSong){
            JOptionPane.showMessageDialog(null, "You already added the last liked song to the genre Playlist");
        } else if(likedSongList.isEmpty()){
            JOptionPane.showMessageDialog(null, "You have not liked any songs");
        } else{
            lastLikedSong = likedSongList.pop();
            moveSong = true;
        }   
    }

    @Override
    public void addSong(NewSong song) {
        likedSongList.push(song);
        moveSong = false;
    }

    @Override
    public void displayLikedSongs() {
        StringBuilder sb = new StringBuilder();
        for(NewSong song : likedSongList){
               sb.append(song.getSong()).append(" by ").append(song.getArtist()).append(" [").append(song.getGenre()).append("]\n");
        }
        likedDisplay.setText(sb.toString());
    }
}


