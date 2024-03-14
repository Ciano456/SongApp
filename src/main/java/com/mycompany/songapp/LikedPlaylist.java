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
public class LikedPlaylist {
    private Stack<Song> likedSongsStack;

    public LikedPlaylist() {
        likedSongsStack = new Stack<>();
    }

    // likes a song
    public void likeSong(Song song) {
        likedSongsStack.push(song);
        System.out.println("Liked song: " + song.getSong());
    }
    
    public Stack<Song> getLikedSongStack() {
        return likedSongsStack; 
    }
}

