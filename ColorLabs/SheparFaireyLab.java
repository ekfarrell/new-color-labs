
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
              //opens picture using a dialog box
          /**/         
         //opens a pictue using a path
         //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
         //relative path
         Picture apic = new Picture("images\\Mypic.jpg");
         //change with selfie picture
         Picture me  = new Picture("images/Mypic.jpg");
         Picture me1 = new Picture("images/Mypic.jpg");
         Picture me2 = new Picture("images/Mypic.jpg");
         Pixel[] pixelArray1  = me.getPixels();
         Pixel[] pixelArray2  = me1.getPixels();
         Pixel[] pixelArray3  = me2.getPixels();
         /**
          * method 1 change
          * 
          */
        /* me.explore();
        */ int average,gvalue,bvalue,rvalue;/*
         for (Pixel pixelObj : pixelArray1)
         {
             gvalue = pixelObj.getGreen();
             bvalue = pixelObj.getBlue();
             rvalue = pixelObj.getBlue();
          
             average = (gvalue + bvalue + rvalue) / 3;
     
             if (average <= 255/4 + 1 && average >= 0)
             {
                 pixelObj.setRed(25);
                 pixelObj.setGreen(25);
                 pixelObj.setBlue(112);
             }
             else if (average <= 255/2 + 1 && average > 255/4 + 1)
             {
                 pixelObj.setRed(255);
                 pixelObj.setGreen(0);
                 pixelObj.setBlue(0);
             }
             else if (average <= 255/4 *3 + 1 && average > 255/2 + 1)
             {
                 pixelObj.setRed(100);
                 pixelObj.setGreen(149);
                 pixelObj.setBlue(237);
             }
             else if (average <= 255 && average > 255/4 *3 + 1)
             {
                 pixelObj.setRed(238);
                 pixelObj.setGreen(238);
                 pixelObj.setBlue(224);
             }
         }
         me.explore();
        // me.write("images//pic1.jpg");
         /**
          * method 2 change
          * 
          */
        /* */ int min = 256, max = -1,range;/*
         for (Pixel pixelObj : pixelArray2)
         {
             gvalue = pixelObj.getGreen();
             bvalue = pixelObj.getBlue();
             rvalue = pixelObj.getBlue();
     
             average = (gvalue + bvalue + rvalue) / 3;
             
             if (average < min)
             {
                 min = average;
             }
             if (average > max)
             {
                 max = average;
             }
         }
         for (Pixel pixelObj : pixelArray2)
         {
             gvalue = pixelObj.getGreen();
             bvalue = pixelObj.getBlue();
             rvalue = pixelObj.getBlue();
             average = (gvalue + bvalue + rvalue) / 3;
        
             if (average <= max/4 + 1 && average >= min)
             {
                 pixelObj.setRed(25);
                 pixelObj.setGreen(25);
                 pixelObj.setBlue(112);
             }
             else if (average <= max/2 + 1 && average > max/4)
             {
                 pixelObj.setRed(255);
                 pixelObj.setGreen(0);
                 pixelObj.setBlue(0);
             }
             else if (average <= max/4 *3 + 1 && average > max/2)
             {
                 pixelObj.setRed(100);
                 pixelObj.setGreen(149);
                 pixelObj.setBlue(237);
             }
             else if (average <= max && average > max/4 *3)
             {
                 pixelObj.setRed(238);
                 pixelObj.setGreen(238);
                 pixelObj.setBlue(224);
             }
         }
            me1.explore();
          //  me1.write("images//pic2.jpg");
        /**
         * Method 3
         */
        min= 256;
        max = -1;
         for (Pixel pixelObj : pixelArray3)
         {
             gvalue = pixelObj.getGreen();
             bvalue = pixelObj.getBlue();
             rvalue = pixelObj.getBlue();
     
             average = (gvalue + bvalue + rvalue) / 3;
             
             if (average < min)
             {
                 min = average;
             }
             if (average > max)
             {
                 max = average;
             }
         }
         for (Pixel pixelObj : pixelArray3)
         {
             gvalue = pixelObj.getGreen();
             bvalue = pixelObj.getBlue();
             rvalue = pixelObj.getBlue();
             average = (gvalue + bvalue + rvalue) / 3;
        
             if (average <= max/4 + 1 && average >= min)
             {
                 pixelObj.setRed(246);
                 pixelObj.setGreen(143);
                 pixelObj.setBlue(224);
             }
             else if (average <= max/2 + 1 && average > max/4)
             {
                 pixelObj.setRed(51);
                 pixelObj.setGreen(102);
                 pixelObj.setBlue(0);
             }
             else if (average <= max/4 *3 + 1 && average > max/2)
             {
                 pixelObj.setRed(45);
                 pixelObj.setGreen(134);
                 pixelObj.setBlue(51);
             }
             else if (average <= max && average > max/4 *3)
             {
                 pixelObj.setRed(170);
                 pixelObj.setGreen(152);
                 pixelObj.setBlue(57);
             }
         }
            me2.explore();
            //me2.write("images//pic3.jpg");
    }
}
         
          
          

 