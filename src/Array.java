import java.util.Arrays;

public class Array {
    private final int  len;
    private  int[] items;
    private int counter = 0;
    private int[] secondItems;

    public Array(int length){
        len = length;
        items  = new int[len];
    }


    public void insert(int item){
        if(counter >= len){
            secondItems = new int[(counter + 1)];
            for(int i = 0; i < counter; i++ )
                secondItems[i] = items[i];

            secondItems[counter] = item;
            items = new int[(counter + 1)];

            for(int i = 0; i <= counter; i++)
                items[i] = secondItems[i];

        }else
            items[counter] = item;

        counter++;
    }

    public void removeAt(int index){
        secondItems = new int[(counter - 1)];
        int count = 0;
        for(int i = 0; i <= (counter - 1); i++ ){
            if(i != index)
                secondItems[count] = items[i];
            else if (i == index)
                count -= 1;

            count++;
        }

        items = new int[(counter - 1)];
        for(int i = 0; i < (counter - 1); i++ ){
            items[i] = secondItems[i];
        }
    }

    public int indexOf(int value){
        int indexVal = 0;
        for(int val : items){
            if(val == value)
                return indexVal;
            else
                indexVal++;
        }
        return -1;
    }
    public void print(){
        for(int output: items)
            System.out.println(output);

    }

}
