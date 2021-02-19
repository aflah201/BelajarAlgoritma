package AflahBelajarJavaAlgoritma;

public class B_ArraySatuDimensi {
    
    public static void main(String[] args){
        int data[] = new int[10];
        
        for (int i = 0; i<data.length; i++){
            data[i] = i;
            System.out.print(data[i]+" ");
        }
    }
}
