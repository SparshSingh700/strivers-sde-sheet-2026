/*
Question:
Implement a Max Heap from scratch.

Operations implemented:
1. Insert
2. Extract Max
3. Delete by index
4. Build Heap
5. Get Max
6. Print Heap
*/

import java.util.ArrayList;

class MaxHeap{
    private ArrayList<Integer> heap;
    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Insert an element into the heap
    public void insert(int value){
        heap.add(value);
        int currentIndex = heap.size() - 1;

        //heapify up    
        while(currentIndex >0){
            int parentIndex= (currentIndex - 1)/2;

            //heap property is satisfied
            if(heap.get(currentIndex)<= heap.get(parentIndex)){
                break;
            }
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
        }
    }

    public int extractMax(){
        if(heap.size() == 0){
            throw new RuntimeException("Heap is empty");
        }

        int max = heap.get(0);
        int last= heap.size() - 1;

        // Move the last element to the root
        heap.set(0, heap.get(last));
        heap.remove(last);

        //restore heap property by heapifying down
        if(heap.size() > 0){
            heapifyDown(0);
        }

        return max;
    }
        
    
    //heapify down
    private void heapifyDown(int index){
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Check if left child exists and is greater than current largest
        if(leftChild < heap.size() && heap.get(leftChild) > heap.get(largest)){
            largest = leftChild;
        }
        //Check if right child exists and is greater than current largest
        if(rightChild < heap.size() && heap.get(rightChild) > heap.get(largest)){
            largest = rightChild;
        }
        //if largest is current index, heap property is satisfied
        if(largest == index){
            return;
        }

        swap(index, largest);
        heapifyDown(largest);
    }

    // Delete element at given index
    public void delete(int index){
        if(index <0 || index >= heap.size()){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        //make it to maximum value and extract max
        heap.set(index, Integer.MAX_VALUE);

        //bring it to root
        while(index>0){
            int parentIndex= (index-1)/2;
            if(heap.get(parentIndex)>= heap.get(index)){
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }

        //extract max to remove it from heap
        extractMax();
    } 

    //Build heap using array
    public void buildHeap(int[] arr){
        heap.clear();

        for(int num : arr){
            heap.add(num);
        }

        //heapify from last non-leaf node down to root
        for(int i = (heap.size() - 2) / 2; i >= 0; i--){
            heapifyDown(i);
        }

    }

    //get maximum element without removing it
    public int getMax(){
        if(heap.size() == 0){
            throw new RuntimeException("Heap is empty");
        }
        return heap.get(0);
    }


    //printing a heap
    public void printHeap(){
        System.out.println(heap);
    }

    void swap(int i, int j){
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

}

public class ImplementMaxHeap {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap();

        heap.insert(10);
        heap.insert(30);
        heap.insert(20);
        heap.insert(5);
        heap.insert(40);

        System.out.print("Heap: ");
        heap.printHeap();

        System.out.println("Max = " + heap.getMax());

        System.out.println("Extract Max = " + heap.extractMax());

        System.out.print("Heap after extraction: ");
        heap.printHeap();

        heap.delete(1);

        System.out.print("Heap after deletion: ");
        heap.printHeap();

        int[] arr = {12, 7, 25, 18, 30};

        heap.buildHeap(arr);

        System.out.print("Built Heap: ");
        heap.printHeap();
    }
}