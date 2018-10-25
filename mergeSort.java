package com.itcourses.grusha.git;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class Main {

    private static int[] array;
    private static int[] tempMergArr;
    private static int length;

    public static void Main(String args[]){

        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public static void sort(int inputArr[]) {
        array = safsafasfas;
		asfasfasfas;
		asfsafas;
		afssaf;
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }
}



