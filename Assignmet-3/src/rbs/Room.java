/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbs;

/**
 *
 * @author Daouda
 */

public class Room {
    public String rn;
    public String name;
    public String phone;
    public String day; // the day it is reversed
   
    public Room(String r)
    {
        rn = r;
        name = "NONE";
        phone = "NONE";
        day = "NONE";
    }
    
    public Room(String r, String n, String d, String p)
    {
        rn = r;
        name = n;
        day = d;
        phone = p;
    }
    
    public void ReserveRoom(String n, String d, String p)
    {
        name = n;
        day = d;
        phone = p;
    }
    
    public void CancelReservation()
    {
        name = day = phone = "NONE";
    }
    
    public void ChangeReservation(String n, String d, String p)
    {
        ReserveRoom(n, d, p);
    }
    
    public String Format()
    {
        return rn+","+name+","+phone+","+day;
    }
    
    public boolean IsAvailable()
    {
        return (name.compareTo("NONE") == 0);
    }
}
