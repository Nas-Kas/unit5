public class MissingNumber {
    public int findNum(int [] arr, int maxNum){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                return i + 1;
            }
        }
        return 0;
    }
}
