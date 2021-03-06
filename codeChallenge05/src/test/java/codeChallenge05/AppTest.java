/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge05;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void Insert(){ // You should change the type of output to (int) for this test
        LinkedList list = new LinkedList();
        list.insert(9);
        int value1 = 9;
        assertEquals(9, list.insert(9) );
         }

    @Test public void Includes(){
        LinkedList list = new LinkedList();
        list.append(9);
        int value = 8;
        boolean value2= false;
        assertEquals(value2, list.includes(value));
}
    @Test public void ToString(){
        LinkedList list = new LinkedList();
        list.append(9);
        String value2= "{ 9 } -> X";
        assertEquals(value2, list.tostring());

}
    @Test public void append(){ // You should change the type of output to (int) for this test
        LinkedList list = new LinkedList();
        list.append(9);
        int value1 = 9;
        assertEquals(value1, list.append(9));

    }

    @Test public void insertBefore(){
        LinkedList list = new LinkedList();
        list.append(2);
        list.append(6);
        assertEquals( "newNode: 12 then: 6" , list.insertBefore(6,12));
    }

    @Test public void insertAfterValue(){
        LinkedList list = new LinkedList();
        list.append(8);
        list.append(4);
        assertEquals( "current: 8 then: 12" , list.insertAfterValue(8,12));

    }


//***************************************** Kth From End **************************************************************

    @Test public void kthFromEnd(){
        LinkedList list =new LinkedList();
        list.append(8);
        list.append(4);
        list.append(9);
        list.append(1);
        list.append(3);
        assertEquals(null , list.kthFromEnd(6)); // k is greater than the length of the linked list
        assertEquals(null, list.kthFromEnd(5)); // k and the length of the list are the same
        assertEquals(4,list.kthFromEnd(3));
    }
    @Test public void  kthFromEnd2(){
        LinkedList list =new LinkedList();
        list.append(3);
        assertEquals(null,list.kthFromEnd(2)); // the linked list is of a size 1
    }


//***************************************** zip_lists **************************************************************
    @Test public void zip_lists_SameLength(){
        LinkedList list1 =new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.append(100);
        list1.append(120);
        list1.append(130);
        list2.append(5);
        list2.append(8);
        list2.append(3);
        assertEquals( "{ 100 } -> { 5 } -> { 120 } -> { 8 } -> { 130 } -> { 3 } -> X", LinkedList.zip_lists(list1,list2).tostring());
    }
    @Test public void zip_lists_FirstLarger() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.append(100);
        list1.append(120);
        list1.append(130);
        list2.append(5);
        list2.append(3);
        assertEquals("{ 100 } -> { 5 } -> { 120 } -> { 3 } -> { 130 } -> X", LinkedList.zip_lists(list1,list2).tostring());

    }

    @Test public void zip_lists_SecondLarger(){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.append(100);
        list1.append(120);
        list2.append(5);
        list2.append(3);
        list2.append(7);
        list2.append(1);
        assertEquals("{ 100 } -> { 5 } -> { 120 } -> { 3 } -> { 7 } -> { 1 } -> X", LinkedList.zip_lists(list1,list2).tostring());
    }

}
