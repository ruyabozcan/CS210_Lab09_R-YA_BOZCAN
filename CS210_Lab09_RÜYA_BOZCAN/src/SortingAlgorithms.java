// A Priority Queue P can be used for sorting by inserting a set S of n elements and calling removeMinElement() until P is empty:
// Algorithm PriorityQueueSort(S, P):
// Input: A sequence S storing n elements, on which a total order relation is defined, and a Priority Queue P that compares keys with the same relation
// Output: The Sequence S sorted by the total order relation
// while !S.isEmpty() do
// e ← S.removeFirst()
// P.insertItem(e, e)
// while P is not empty do
// e ← P.removeMinElement()
// S.insertLast(e)
// Selection Sort is a variation of PriorityQueueSort that uses an unsorted sequence to implement the priority queue P.
// the insertion of an item into P takes O(1) time.
// removing an item from P takes time proportional to the number of elements in P the time complexity of the algorithm is O(n2).
// Insertion sort is the sort that results when we perform a PriorityQueueSort implementing the priority queue with a sorted sequence.
// We improve phase 2 to O(n).
// However, phase 1 now becomes the bottleneck for the running time.
// The first insert Item takes O(1), the second O(2), until the last opertation taked O(n).
// The run time of phase 1 is O(n2 ) thus the run time of the algorithm is O(n2 ).