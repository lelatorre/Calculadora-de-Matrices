package calculadoramatrices;

public class Traza implements IInterface{
  @Override
   //Función que calcula diagonal principal de una matriz cuadrada y suma valores de esa diagonal.
    public int traza(int a[][],int n, int m) {
        int sumaDiag =0;
        for (int i = 0; i < n; i++) {
            sumaDiag+=a[i][i];   
        }
        return sumaDiag;
    }
    
     @Override
    public int[][] matriz(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimir(int[][] mat, int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[][] suma(int[][] a, int[][] b, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int[][] resta(int[][] a, int[][] b, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }  

    @Override
    public int determinanteMatriz(int[][] x, int N) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
