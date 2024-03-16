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
    
        void addSong(NewSong song);
        void search(String song);
        void toDisplay();
        void delete(String songName);
        void setIsRepeat(boolean isRepeat);
        boolean moveUp(String songName);
        boolean moveDown(String songName);
        
}
