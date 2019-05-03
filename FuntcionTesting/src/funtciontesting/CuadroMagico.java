/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funtciontesting;

/**
 *
 * @author jgome
 */
public class CuadroMagico {

    private int n;
    private int[][] cuadro;
    public CuadroMagico(int n, int[][] matriz) {
        this.n = n;
        this.cuadro = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                this.cuadro[i][j]=matriz[i][j];
            }
        }
    }
    public boolean esCuadroMagico() {
        int sumatotal=sumaTotal();
        boolean fila=true, columna=true, diagonal1=true, diagonal2=true;
        for(int i=0; i<n; i++)
        {
            if(sumanFila(i)!=sumatotal) fila=false;
            if(sumanColumna(i)!=sumatotal) columna=false;
        }
        if(sumanDiagonal1()!=sumatotal) diagonal1=false;
        if(sumanDiagonal2()!=sumatotal) diagonal2=false;
        return fila && columna && diagonal1 && diagonal2;
    }
    public int sumaTotal() {
        int sum = n*(n*n + 1)/2;
        return sum;
    }
    public int sumanFila(int n) {
        int sumaFila = 0;
        int f = n;
        for (int c = 0; c < this.n; c++)
        {
            sumaFila += cuadro[f][c];
            
        }
            return sumaFila;
        }
    public int sumanColumna(int n) {
        int sumaColumna = 0;
        int c = n;
        for (int f = 0; f < this.n; f++)
        {
            sumaColumna += cuadro[f][c];
            
        }
        return sumaColumna;
    }
    public int sumanDiagonal1() {
        int sumaDiag1 = 0;
        int f = 0, c = 0;
        while (f < n && c < n) {
            sumaDiag1 += cuadro[f][c];
            f++;
            c++;
        }
        return sumaDiag1;
    }
    public int sumanDiagonal2() {
        int sumaDiag2=0;
        int f=0, c=n-1;
        while (f < n && c >= 0) {
                sumaDiag2 += cuadro[f][c];
                f++;
                c--;
            }
        return sumaDiag2;
    }
    public static void main(String Args[])
    {
        int[][] matriz={{1,1,1},
                        {1,0,1},
                        {0,5,0}};
        CuadroMagico cuadro=new CuadroMagico(3, matriz);
        System.out.println(cuadro.esCuadroMagico());
    }
}