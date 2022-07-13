public class maxminarray {
    private int[] arr;


    public int max(){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public int min(){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }


    public void initArray(int[] array){

        arr=array;
    }
}
