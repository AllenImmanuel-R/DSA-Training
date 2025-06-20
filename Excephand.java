import java.util.Scanner;

class Excephand{
    public static void main(String[] args) {
        int a []= {56,45,34,23,12};
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        int key= sc.nextInt();
        try {
            for(int i=0;i<n;i++){
                System.out.println(a[i]/key);
                }
            }
            catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception");
                
        }
    }
    
}   
