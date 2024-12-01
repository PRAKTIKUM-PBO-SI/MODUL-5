/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class ValidasiInputException extends Exception {
    public ValidasiInputException(String message){
        super (message);
    }
    
    @Override
    public String toString() {
        return "Terjadi kesalahan pada validasi input: " + getMessage();
    }
    
}
