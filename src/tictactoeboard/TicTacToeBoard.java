/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeboard;

/**
 *
 * @author ivanr
 */
public class TicTacToeBoard {

    String map[][] = new String[3][3];
    /**
     * @param args the command line arguments
     */
    
    public void add(String val,int x,int y){
        map[x][y] = val;
    }
    
    public void print(){
        for(int i = 0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                System.out.print(map[i][j]);
                if( j+1 < map.length ){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
    
    public boolean checkFull(String[][] map){
        for(int i = 0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                if(map[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void move(String[][] map){
        int moved = 0;
        for(int i = 0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                if(!checkFull(map)){
                    if(map[i][j].equalsIgnoreCase("-")){
                        map[i][j] = "0";
                        moved = 1;
                        break;
                    }
                }
            }
            if(moved == 1)
                break;
        }
    }
    public static void main(String[] args) {
        TicTacToeBoard tTTB = new TicTacToeBoard();
        for(int i = 0;i<tTTB.map.length;i++){
            for(int j=0;j<tTTB.map.length;j++){
                tTTB.add("-", i, j);
            }
        }
        tTTB.print();
        tTTB.add("X", 0, 0);
        tTTB.add("0", 1, 1);
        tTTB.add("X", 1, 2);
        System.out.println("After:");
        tTTB.print();
        tTTB.move(tTTB.map);
        tTTB.move(tTTB.map);
        tTTB.print();
    }
}
