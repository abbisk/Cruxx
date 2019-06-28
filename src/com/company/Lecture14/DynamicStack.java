package com.company.Lecture14;

public class DynamicStack  extends Stack{
    @Override
    public boolean push(int item) {
        if (isfull()){
            int temp[] = new int[data.length*2];
            for (int i = 0; i <data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
