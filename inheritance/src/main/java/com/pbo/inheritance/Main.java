/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.inheritance;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Contoh Game Tebak Ang1ka
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();

        // Contoh Game Tebak Kata
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
