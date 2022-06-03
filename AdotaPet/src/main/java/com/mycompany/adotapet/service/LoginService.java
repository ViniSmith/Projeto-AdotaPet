/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adotapet.service;

/**
 *
 * @author Esperanza TUNADO
 */
public class LoginService {

    public static boolean PodeLogar(String login, String senha) {
        return login.equals("admin") && senha.equals("123"); 
    }
    
}
