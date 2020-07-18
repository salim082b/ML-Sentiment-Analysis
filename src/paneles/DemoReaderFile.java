/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneles;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author bouafia
 */
public class DemoReaderFile {
    /*public static void main(String args[]){
        String texts = readFile("/home/bouafia/script_project/KibanaStatus.txt");
        System.out.println(texts);
    }*/
    public static String readFile(String file){
        String text = "";
        try{
            Scanner s = new Scanner(new File(file)); 
            while(s.hasNext()){
              text = text + s.nextLine();
            }
        }catch (FileNotFoundException e){
           System.out.println("file ot found");
        }
        return text; 
    }
}
