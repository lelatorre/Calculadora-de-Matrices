package calculadoramatrices;


public interface IInterface {
    //Métodos abstractos de la clase IInterface
    public int [][] matriz(int a, int b);
    
    public String imprimir(int mat[][], int a, int b);
    
    public int[][] suma(int a[][], int b[][],int n, int m);
    
    public int[][] resta(int a[][], int b[][],int n, int m);
    
    public int traza(int a[][],int n, int m);
    
    public int determinanteMatriz(int x[][], int N);
    
}

