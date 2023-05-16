import java.util.ArrayList;
import java.util.List;

public class Factorial {

    int x=0;

    public int FactorialIterativo(int n){
       int r=1;
        for(int i=n;n>1;n--){
            r= r*n;
        }
        return r;
    }

    public int FactorialRecursiva(int n){
        if(n==1){
            return 1;
        }else{
            return n*FactorialRecursiva(n-1);
        }
    }

    public List<Integer> FibonacciIterativo (int n){

        List<Integer> l= new ArrayList<>();
        int x=1;
        int y=0;
        l.add(x);
        for (int i=0; i<n-1; i=i+2 ){

            y=y+x;
            l.add(y);
            if(n%2==0){
        if(i==n-2){
            break;
             }
            }
            x=x+y;
            l.add(x);
        }

        return l;
    }
    public int FibonacciRecursivo (int n){

       if(n<=1){

           return n;
       }else{

          return FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2);
       }

    }

    public int Sumasn (int n){
       int x=0;

        for(int i=0;i<=n;i++){

            x=i+x;
        }
        return x;
    }

    public int SumasnRecursivo (int n){

        if(1==n){
            return n;
        }else{
            return SumasnRecursivo(n-1)+n;
        }
    }
    public int SumasImpIter (int n){
        int x=0;
        int i=1;
        while(i<=n*2){
            x=i+x;
            i=i+2;
        }



        return x;
    }
    public int SumasnImpRecursivo (int n, int y){

        if(y==1){
            return n;
        }else{

            return SumasnImpRecursivo(n-2,y-1)+n;
        }
    }

    public int SumasndeAaB (int a, int b){
        int x=0;

        for(int i;a<=b;a++){

            x=a+x;
        }
        return x;
    }

    public int SumasndeAaBRecur (int a, int b){

        if(a==b){
            return b;
        }else if(a>b) {
            return 0;
        }else{
                return SumasndeAaBRecur(a,b-1)+b;
            }
        }
    }


