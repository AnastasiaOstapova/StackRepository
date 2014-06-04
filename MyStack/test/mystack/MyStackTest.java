package mystack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anastasiia_Ostapova
 */
public class MyStackTest {
    
    @Test(expected = EmptyStackException.class)
    public void popEmptyStack_Test(){
        MyStack myStack = new MyStack();
        myStack.pop();
    }
    
    @Test
    public void popStack_Test(){
        MyStack myStack = new MyStack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        int beforeLastElement = myStack.pop();
        assertTrue(beforeLastElement == 3);

        
        
    }
    
    @Test
    public void peek_Test(){
        MyStack myStack = new MyStack(2);
        myStack.push(1);
        myStack.push(2);
        int beforeLastElement = myStack.peek();
        assertEquals(beforeLastElement, 2);
        
    }
    
    @Test
    public void stackIsEmpty_Test(){
        MyStack myStack = new MyStack();
        assertTrue(myStack.empty());
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void stackIsFool_Test(){
        MyStack myStack = new MyStack(2);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
    }
    
    @Test
    public void myStackIsEmpty_Test(){
        MyStack myStack = new MyStack(1);
        myStack.push(1);
        myStack.pop();
        assertTrue(myStack.empty());
    }
    
    @Test(expected = EmptyStackException.class)
    public void peekException_Test(){
        MyStack myStack = new MyStack();
        myStack.peek();
    }

    
}
