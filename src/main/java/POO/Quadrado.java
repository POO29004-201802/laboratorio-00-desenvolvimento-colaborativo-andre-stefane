package POO;

public class Quadrado {
    public void plotar(int tamanho){
        int i, j;
        for (i=0; i<tamanho; i++){

            for (j=0; j<tamanho; j++){
                if (i==0 || i == (tamanho-1) || j == (tamanho-1) || j==0) {
                    System.out.print("+");
                }  else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

