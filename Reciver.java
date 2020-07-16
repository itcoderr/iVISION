/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Raj
 */
public class Reciver {
    public static void main(String[] args){
        int i=5;
        InputStream in = null;
        String dateTime,fileName;
        fileName="pankaj.jpg";
        Socket soc=null;
        ServerSocket ss=null;
        byte array[] =new byte[1000000];

       FileOutputStream outputFile= null;
        try {
            outputFile = new FileOutputStream("C:\\Users\\Pankaj Solanki\\Documents\\ivision\\"+fileName);
            ss = new ServerSocket(9552);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
       while(i>0){
        try {
            System.out.println("Waiting for the client");
            soc = ss.accept();
            in = soc.getInputStream();
            int count;
            while((count = in.read(array))>0)
            {
                outputFile.write(array, 0, count);
            }
            System.out.println("done");
            in.close();
            soc.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
        i--;
       }
        try {
            ss.close();
        } catch (IOException ex) {
            System.out.print(ex.toString());
        }


    }
}
