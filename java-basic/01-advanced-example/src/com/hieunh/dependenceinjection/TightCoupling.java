package com.hieunh.dependenceinjection;


interface SortAlgorithm {
    int[] sort(int[] arr);
}

class BubbleSort implements SortAlgorithm{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("Sorted by BubbleSort");
        return new int[0];
    }
}

class BinarySort implements SortAlgorithm {
    @Override
    public int[] sort(int[] arr) {
        System.out.println("Sorted by BinarySort");
        return new int[0];
    }
}

class Bussiness {
    private SortAlgorithm sortAlgorithm;

    public Bussiness(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] arr) {
        this.sortAlgorithm.sort(arr);
    }
}

class Main {
    public static void main(String[] args) {
        SortAlgorithm bubbleSort = new BubbleSort();
        SortAlgorithm binarySort = new BinarySort();

        Bussiness bussiness1 = new Bussiness(bubbleSort);
        Bussiness bussiness2 = new Bussiness(binarySort);
    }
}
