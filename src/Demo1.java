public class Demo1 {
    public static void main(String[] args) {
        int[]arr = {33,56,23,12,89};
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
           if (arr[i]>max){
                max = arr[i];
            }


        }
        System.out.println(max);
    }
}
