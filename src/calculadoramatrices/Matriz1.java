package calculadoramatrices;

import javax.swing.JOptionPane;

public class Matriz1 implements IInterface{
    
@Override
    //Función que genera matriz a partir de los datos ingresados por el usuario.
    public int [][] matriz(int a, int b) {
        int w[][] = new int [a][b];
        for (int i = 0; i <a; i++) {
            String datos =JOptionPane.showInputDialog("Ingrese los datos de la fila separados por comas (,)");
            //Guarda valores ingresados en String en un vector con ayuda de .split().
            String []dato=datos.split(",");
            //Ordena datos captados en []dato en matriz w[][].
            for (int j = 0; j < b; j++) {
                w[i][j]=Integer.parseInt(dato[j]);
            }
        }
        //Retorna matriz w[][].
        return w;
    }
    @Override
    
    //Imprime la matriz ya ordenada.
    public String imprimir(int mat[][], int a, int b) {
        String imp="";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                imp+=mat[i][j]+" ";
            }
            imp+="\n \t";
        }
        return imp;
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
    public int traza(int[][] a, int n, int m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int determinanteMatriz(int[][] x, int N) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
