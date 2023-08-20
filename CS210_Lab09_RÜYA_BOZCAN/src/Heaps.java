public class Heaps
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int idx)
    {
        int largestIdx = idx;
        int leftIdx = 2 * idx + 1;
        int rightIdx = 2 * idx + 2;

        if (leftIdx < n && arr[leftIdx] > arr[largestIdx])
        {
            largestIdx = leftIdx;
        }

        if (rightIdx < n && arr[rightIdx] > arr[largestIdx])
        {
            largestIdx = rightIdx;
        }

        if (largestIdx != idx)
        {
            int temp = arr[idx];
            arr[idx] = arr[largestIdx];
            arr[largestIdx] = temp;

            heapify(arr, n, largestIdx);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        Heaps ob = new Heaps();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}

// Time Complexity: Time complexity of heapify is O(Logn).
// Time complexity of createAndBuildHeap() is O(n) and the overall time complexity of Heap Sort is O(nLogn).
// Advantages of heapsort:
// Efficiency –  The time required to perform Heap sort increases logarithmically
// while other algorithms may grow exponentially slower as the number of items to sort increases.
// This sorting algorithm is very efficient.
// Memory Usage – Memory usage is minimal because apart from what is necessary to hold the initial list of items to be sorted,
// it needs no additional memory space to work
// Simplicity –  It is simpler to understand than other equally efficient sorting algorithms
// because it does not use advanced computer science concepts such as recursion
