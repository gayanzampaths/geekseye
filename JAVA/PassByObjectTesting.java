/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayan
 */
public class PassByObjectTesting {
    public static void main(String[] args) {
        //instantiate object
        CreateObject c = new CreateObject(5);
        System.out.println("value before change :"+c.x);
        c.change(10);
        System.out.println("value after change :"+c.x);
    }
}

class CreateObject{
    //instantiate int variable x
    int x;
    //constructor for class
    public CreateObject(int x) {
        this.x = x;
    }
    //value changing method
    public void change(int val){
        x = val;
    }
}
