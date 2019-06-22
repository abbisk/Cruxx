//package com.company.Lecture11;
//
//public class Queue {
//    private int data[];
//
//    private int DEFAULT_SIZE = 10;
//
//    private int end = 0, top =0;
//    public Queue(){
//        public boolean isfull() {
//            return end == data.length;
//        }
//
//        public boolean isempty() {
//            return end == 0;
//        }
//
//        public boolean insert(int element) {
//            if (isfull()) {
//                return false;
//            }
//            data[end++] = element;
//            return true;
//        }
//
//    }
//    public int remove(){
//        if(isempty()){
//
//        }
//        int temp = data[0];
//        for (int i = 1; i <end ; i++) {
//            data[i-1]= data[i];
//            end--;
//            return temp;
//
//        }
//
//    }
//}