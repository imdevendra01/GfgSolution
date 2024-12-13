
class Solution {
    public static int findPages(int[] arr, int k) {
        int n=arr.length;
        if(n<k) return -1;
        int s= Integer.MIN_VALUE,e=0;
        for(int i: arr){
            s=Math.max(s,i);
            e+=i;
        }
        
        while(s<e){
    int mid = s+(e-s)/2;
if  (Check(arr,k,mid))
e=mid;
else 
s=mid+1;}
return s;
}
public static boolean Check(int []arr,int k,int m){
   int  students =1,sum=0;
    for(int i=0;i<arr.length;i++){
        if(sum+arr[i]<=m)
        sum+=arr[i];
        else{
            students++;
            sum=arr[i];
        }
    }
    return students<=k;

    
    
        
    

        
    }
}