public class Search {

    public static Product binarysearch(Product[]array,String item){
        int l=0;
        int r=array.length-1;
        while(l<=r){
            int m=(l+r)/2;
            String itemname=array[m].name;
            if(itemname.equals(item)){
                return array[m];
            }else if(itemname.compareTo(item)<0){
                r=m-1;
            }else{
                l=m+1;

            }   
  
        }
        return null;
    }
    public static Product linearsearch(Product[]array ,String item){
         for(Product p:array){
            if(p.name.equals(item)){
                return p;            }
         }
         return null;
    }
    
}
