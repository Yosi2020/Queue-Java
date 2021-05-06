/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eyu;

import java.util.NoSuchElementException;

/**
 *
 * @author mo
 */
class ArrayQueue {
          protected Object Queue[] ;
   protected int front, rear, size, len;
 
    /* Constructor */
    public ArrayQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new Object[size];
        front = -1;
        rear = -1;
    }    
    /*  Function to check if queue is empty */
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    /*  Function to check if queue is full */
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return len ;
    }      
    /*  Function to insert an element to the queue */
    public void insert(Object i) 
    {
        if (len == size){
            System.out.println("Queue is FULL");
        return;}
        if (rear ==size - 1 || rear == -1) 
        {
            Queue[0] = i;
            rear = 0;
            if (front == -1) front = 0;
            
        }
        else
            Queue[++rear] = i; 
        len++ ;    
    }    
    /*  Function to remove front element from the queue */
   
    public Object remove() 
    {
       // if (isEmpty())
        //   throw new NoSuchElementException("Underflow Exception");
        //else 
        //{
            len-- ;
            Object ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        //}        
    }
    /*  Function to display the status of the queue */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
} 
    public void show(){
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
              int count = 0;
        for (int i = front; i <= rear; i++){
            System.out.print(Queue[i]+" ");
            count = count + 1;
        }
        System.out.println();
        System.out.println("Size: " + count);
    }
}
