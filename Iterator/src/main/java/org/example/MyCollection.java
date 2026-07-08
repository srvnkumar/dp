package org.example;

//Aggregate Interface
public interface MyCollection<T>{

    MyIterator<T> iterator();
}
