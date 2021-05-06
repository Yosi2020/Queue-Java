/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyu;

import java.util.Scanner;

/**
 *
 * @author mo
 */
public class Eyu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Array Queue Test\n");
        System.out.println("Enter Size of Integer Queue ");
        int n = scan.nextInt();
        ArrayQueue q = new ArrayQueue(n); 
        char ch = 0;
        boolean found = true; 
        while(found){
        System.out.print("\n     Simulation of Queue   ");
        System.out.print("\n           Main Menu   ");
        System.out.print("\n     Option   ");
        System.out.println("\n[1] Enqueue an Item\n");
        System.out.println("[2] Dequeue an Item\n" );
        System.out.println("[3] Exit the Program" );
        Scanner scan1 = new Scanner(System.in);
        int option = scan1.nextInt();        
        switch(option){
            case 1:{
                boolean Enqueue = true;
                while(Enqueue){
                Scanner Enq = new Scanner(System.in);
                System.out.println("          The Enqueue Menu   ");
                System.out.println("     Option   ");
                System.out.println("[1] Enter item to Enqueue\n");
                System.out.println("[2] show content of QUEUE\n" );
                System.out.println("[3] Go Back to Main Menu" );
                int option1 = Enq.nextInt();
                switch(option1){
                    case 1:
                    { do{
                        System.out.println("Enter integer element to insert");
                        try
                        {
                            q.insert( scan.nextInt() );
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }  
                    q.display();            
                    System.out.println("\nDo you want to continue (Type y or n) \n");
                    ch = scan.next().charAt(0);

                    } while (ch == 'Y'|| ch == 'y');
                    if (ch == 'N'|| ch == 'n'){
                        break;
                    }
                    }
                    case 2:
                    {do{
                        try
                        {
                            System.out.println("Conntents of Queue = ");
                            q.show();
                            
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : "+e.getMessage());
                        }
                    q.display();            
                    System.out.println("\nGo back to the Previous interface (Type y or n) \n");
                    ch = scan.next().charAt(0);

                    } while (ch == 'N'|| ch == 'n');
                    if (ch == 'y'|| ch == 'Y'){
                        break;
                    }
                    }
                    case 3:{
                        break;
                    }}
                    if(option1 == 3){
                    break;
                    }
                }
                break;
                
}
            case 2:{
                boolean dequeue = true;
                while(dequeue){
                Scanner Enq = new Scanner(System.in);
                System.out.println("          The Dequeue Menu   ");
                System.out.println("     Option   ");
                System.out.println("[1] Dequeue item\n");
                System.out.println("[2] show content of QUEUE\n" );
                System.out.println("[3] Go Back to Main Menu" );
                int option2 = Enq.nextInt();
                switch(option2){
                    case 1:{
                        try
                        {
                            if(q.isEmpty()){
                            System.out.println("Message: The Queue is EMPTY");
                            }
                            else
                            System.out.println("Message: Item "+q.remove() +" on the queue was dequeued");
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : " +e.getMessage());
                        }
                        break;
                
                }
                case 2:
                    { do{
                        try
                        {
                            System.out.println("Conntents of Queue = ");
                            q.show();
                        }
                        catch(Exception e)
                        {
                            System.out.println("Error : "+e.getMessage());
                        }
                        q.display();            
                    System.out.println("\nGo back to the Previous interface (Type y or n) \n");
                    ch = scan.next().charAt(0);

                    } while (ch == 'N'|| ch == 'n');
                    if (ch == 'y'|| ch == 'Y'){
                        break;
                    }
                    }
                    case 3:{
                        break;
                    }
                }
                if (option2 == 3 || option2 == 1){
                break;
                }
            }
                break;
            }
            case 3:
                System.exit(0); 
        }
        }}}
    