/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Eng. Fadi R
 */
public class Main extends Application {
    // declare hashmap to assign numbers to string names
     HashMap<Integer,String> hashMap=new HashMap();
   
    @Override
    public void start(Stage stage) throws Exception {
        
       // init hashmaps number keys and names
        hashMap.put(0, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
        hashMap.put(7, "seven");
        hashMap.put(8, "eight");
        hashMap.put(9, "nine");
        
        // test vals
        int[] nums={0,0,6,2,7};
        
        //declare the array with 15 location max to be in safety side
        String[] convertedArr=new String[15];
        convertedArr=convertNumbers(nums);
      
       
       
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    // function to convert numbers to written string names with using hashmap 
    public String[] convertNumbers(int[] numbers)
    {
        String[] numWritten=new String[15];
        int j=0;
        for(int i=0;i<numbers.length;i++)
        {
            // if the hashmap contains number
          if(hashMap.containsKey(numbers[i]))
          {
              // get string name of given numnber
              numWritten[j]=hashMap.get(numbers[i]);
              System.out.println("arraytest.ArrayTest.start() | "+numbers[i]+" --> "+numWritten[j]);
              j++;
              
          }
          
        }
        return numWritten;
    }
    
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
