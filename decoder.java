
import java.util.*;

class Main{
    
    
    public static void main(String args[]){
        String ty;
        int val;
        int [] arr = new int[11];
        Arrays.fill(arr,0);
    
        Scanner sc = new Scanner(System.in);
        ty=sc.next();
       for(int i=0;i<ty.length();i++){
            
            val= ty.charAt(i)-'0';
            if(i==1 || i==0){
                
                if(i==0  && val>=1 && val<=26){
                arr[i]+=1;
                
                    
               }
               if( i==1){
                
                if(val>=1 && val<=26){
                  arr[i]+=1;
                  
                
                }
                if(Integer.parseInt(ty.substring(i-1,i+1))<=26){
                  arr[i]+=1;
                  
                
                }
                
                
              }
                
            }
            else{
                
                
                if(val>=1 && val<=26){
                  arr[i]+=arr[i-1];
                  
                
                }
                if(Integer.parseInt(ty.substring(i-1,i+1))<=26){
                  arr[i]+=arr[i-2];
                  
                
                }
                
                
            }
            
                
        }
        System.out.println(arr[ty.length()-1]);
            
    
     
       // System.out.println(ty);
        /*for(int i=0;i<ty.length();i++){
            
            
        }*/
        
        
        
        
    }
    
    
}
