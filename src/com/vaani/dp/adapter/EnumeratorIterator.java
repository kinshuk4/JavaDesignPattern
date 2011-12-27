package com.vaani.dp.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/*
 *  We are Adapting Enumeration to Iterator.
 *  Adapter EnumeratorIterator implements Iterator to look like an Iterator 
 */

public class EnumeratorIterator implements Iterator{
    Enumeration enumeration;

   public EnumeratorIterator(Enumeration enumeration){
     this.enumeration = enumeration;
   }

// Iterator's hasNext() method is delegated to Enumerator's hasMoreElements()
   public boolean hasNext(){
     return enumeration.hasMoreElements();
   }

   // Iterator's next() method is delegated to Enumerator's nextElement()
   public Object next(){
     return enumeration.nextElement();
   }

   public void remove(){
     throw new UnsupportedOperationException();
   }
}
