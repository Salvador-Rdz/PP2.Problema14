/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema14;

/**
 *
 * @author Enano
 */
public class PP2Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución
        printTable(createTable());
    }
    public static int[][] createTable() //Se crea la tabla
    {
        int[][]Table=new int[7][7];     //Tabla 7X7
        int counter=0;
        for(int i=0;i<Table.length;i++)
        {
            for(int j=0;j<Table.length;j++)
            {
                if(j==counter)  //Si la posición del arreglo es igual al contador (Osease posicion 0,1,2,etc)
                {               //Eso crea la diagonal.
                    Table[i][j]=1;
                }
                else            //Si no, se llena con un 0
                {
                    Table[i][j]=0;
                }
            }
            counter++;  //Cada vez que se recorre una fila, el contador sube
        }
        return Table;
    }
    public static void printTable(int[][] Table) //Se imprime
    {
        int i,j;
        for(i=0;i<(Table.length-1);++i) //Se recorre la columna 
        {
            for(j=0;j<(Table.length-1);++j) //Se recorre la fila
            {
                System.out.print("["+Table[i][j]+"] "); //Se imprime la posicion actual
            }            
            System.out.println(""); //Se salta una línea cada fila.
        }
    }
}
