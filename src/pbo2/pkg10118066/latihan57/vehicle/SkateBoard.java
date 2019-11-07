/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan57.vehicle;

/**
 *
 * @author PC
 */
public class SkateBoard extends Vehicle{
    private double myBoardLength;
    
    public SkateBoard(){
        System.out.println("SkateBoard");
    }

    public double getMyBoardLength() {
        return myBoardLength;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
}
