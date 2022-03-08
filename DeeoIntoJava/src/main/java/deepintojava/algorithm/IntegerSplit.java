package deepintojava.algorithm;

public class IntegerSplit {

    public static void main(String[] args) {
        split(100,0,"");
    }
    public static void split(int n,int base,String result){
        if(n==0){
            System.out.println(result);
            return;
        }
        for(int i=base+1;i<=n;i++){
            split(n-i,i,result+i+"|");
        }
    }
}
