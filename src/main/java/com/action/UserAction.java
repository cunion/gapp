/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author chan
 */
public class UserAction extends ActionSupport{
    public String login(){
        System.out.println("login now111666666666");
        return "login";
    }
}
