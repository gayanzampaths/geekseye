/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayan
 */
public class PassByTesting {
    static void changeValue(int n){
        n=10;
    }
    
    public static void main(String[] args) {
        int n = 5;
        changeValue(n);
        System.out.println("Value is :"+n);
    }
}
