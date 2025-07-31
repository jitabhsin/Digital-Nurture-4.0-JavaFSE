public class Main {
    public static void main(String[] args) {
        
        Product[]array={
            new Product(4,"Android","Mobile"),
            new Product(2,"Iphone","Mobile"),
            new Product(1,"Asus","Laptop"),
            new Product(3,"Dell","Laptop"),
        };

        sort(array);
         Product search1 = Search.linearsearch(array, "Android");
        if (search1 != null) {
            System.out.println("LinearSearch is Successful, product is found: " +search1.name);
        } else {
            System.out.println("No product");
        }

       
        Product search2 = Search.binarysearch(array, "Watch");
        if (search2 != null) {
            System.out.println("BinarySearch is Successful, product name: " + search2.name);
        } else {
            System.out.println("no product such exists");
        }


    }

    public static void sort(Product[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].name.compareTo(arr[j+1].name)>0){
                  Product t=arr[j];
                  arr[j]=arr[j+1];       
                  arr[j+1]=t;
        }
    }
}
    }
}
