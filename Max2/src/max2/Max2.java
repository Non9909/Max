
package max2;

public class Max2 {

    public static void main(String[] args) {
    int[] num={5,7,9};
    int max=num[0];
    for(int i=1; i<num.length; i++){
       if(max<num[i]){
          max=num[i];
    }
    }
     System.out.println("Max = " +max);
    
    }
    
}
