/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdsaparking2;

/**
 *
 * @author DELL
 */
public class main {

    // creates a new object to save data
    public static LinkedList tempData = new LinkedList();
    
    public static void main(String[] args) {
        // TODO code application logic here
        loadingGUI LS1 = new loadingGUI();
        LS1.setVisible(true);
        
        loadingGUI.fill();
        LS1.setVisible(false);
        
        

    }
    
}
