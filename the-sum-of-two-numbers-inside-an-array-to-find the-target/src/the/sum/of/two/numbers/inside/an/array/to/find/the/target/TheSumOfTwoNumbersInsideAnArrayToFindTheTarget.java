
package the.sum.of.two.numbers.inside.an.array.to.find.the.target;

import java.util.HashMap;
import java.util.Scanner;

public class TheSumOfTwoNumbersInsideAnArrayToFindTheTarget {

    public static void main(String[] args) {
        HashMap<Integer,Integer >hashy=new HashMap<>(); 
       
     Scanner sc =new Scanner (System.in);
            System.out.println("set your target");
            int target =sc.nextInt() ;
            
        int [] array =new int [5];
        for (int x=0;x<5;x++){
        System.out.println("FILL THE ARRAY");
        
        array[x]=sc.nextInt();
   
    
      }
           for (int x=0;x<5;x++){
    int com=target-array[x];
    
    
    if(hashy.containsKey(com)){
    
        System.out.println(hashy.get(com)+" "+x);
    }
    else{
    
    hashy.put(array[x],x);
    
    
    }
    
    
    
    
      }
    
    
    
    
    }
}
        
                
     
    
    
    
