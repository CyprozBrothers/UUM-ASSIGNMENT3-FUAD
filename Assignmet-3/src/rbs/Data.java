/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Daouda
 */
public class Data {
    
    public static ArrayList<Room> R;
    
    public static void Load()
    {
        R = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(
                new FileReader("room.txt")))
        {
            String rno, s,name, phone, day;
            StringTokenizer token;
            
            while((s = br.readLine())!= null)
            {
                token = new StringTokenizer(s,",");
                rno = token.nextToken();
                name = token.nextToken();
                phone = token.nextToken();
                day = token.nextToken();
                R.add(new Room(rno,name,day,phone));
            }
        }
        catch(Exception ex)
        {
            System.out.println("I/O Error: "+ex);
        }
    }
    
    public static void Save()
    {
        try(FileWriter fw = new FileWriter("room.txt"))
        {
            // write all room data
            for (Room r : R) 
            {
                fw.write(r.Format()+ "\r\n");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
