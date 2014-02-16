/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1;

/**
 *
 * @author Nicolas
 */
class BookstoreException extends Exception {

    public BookstoreException() {  
    }  
  
    public BookstoreException(String message) {  
        super(message);  
    }  
  
    public BookstoreException(Exception e) {  
        super(e);  
    } 
    
}
