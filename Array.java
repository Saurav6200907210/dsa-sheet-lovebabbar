Q.You are given a string s, and your task is to reverse the string.
Examples:
Input: s = "Geeks"
Output: "skeeG"
Ans-class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
         return s;
    }
   
}

Q.Given an array arr[]. Your task is to find the minimum and maximum elements in the array.

Examples:

Input: arr[] = [1, 4, 3, 5, 8, 6]
Output: [1, 8]
Explanation: minimum and maximum elements of array are 1 and 8.

Ans-class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list =new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        list.add(arr[arr.length-1]);
        return list;
    }
}

Q.Given an integer array arr[] and an integer k, your task is to find and return the kth smallest element in the given array.

Note: The kth smallest element is determined based on the sorted order of the array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.

Ans-class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        int result=arr[k-1];
        return result;
    }
}

Q.Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.

Ans-class Solution {
    public void sort012(int[] arr) {
        // code here
        int count0 = 0, count1 = 0, count2 = 0;
        
        // Counting
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) count0++;
            else if(arr[i] == 1) count1++;
            else count2++;
        }
        
        // Filling array
        int i = 0;
        
        while(count0 > 0){
            arr[i++] = 0;
            count0--;
        }
        
        while(count1 > 0){
            arr[i++] = 1;
            count1--;
        }
        
        while(count2 > 0){
            arr[i++] = 2;
            count2--;
        }
    
    }
}  

Q.Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

Examples:

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.

Ans-class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int [] array = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0) {
                array[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                array[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=array[i];
        }
    }
}  

Q.You are given two arrays a[] and b[], return the Union of both the arrays in any order.

The Union of two arrays is a collection of all distinct elements present in either of the arrays. If an element appears more than once in one or both arrays, it should be included only once in the result.

Note: Elements of a[] and b[] are not necessarily distinct.
Note that, You can return the Union in any order but the driver code will print the result in sorted order only.

Examples:

Input: a[] = [1, 2, 3, 2, 1], b[] = [3, 2, 2, 3, 3, 2]
Output: [1, 2, 3]
Explanation: Union set of both the arrays will be 1, 2 and 3.
// answer using arraylist but not satisfied the condition because time complexity(both the answer are covered first is using arraylist and second is using hashset)

Ans-(first approch arraylist)
    class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
         for(int i=0;i<a.length;i++){
            if(!list.contains(a[i])) list.add(a[i]);
         }
         for(int i=0;i<b.length;i++){
            if(!list.contains(b[i])) list.add(b[i]);
         }
         return list;
    }
}
=> second approch using hashset(in hashset can't stored duplicate value )

    class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
    
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length;i++){
            set.add(b[i]);
        }
        return new ArrayList<>(set);
    }   
}

Q.Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.

Ans-class Solution {
    public void rotate(int[] arr) {
        // code here
        int array[] = new int[arr.length];
        int j=1;
        array[0]=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            array[j]=arr[i];
            j++;
        }
        int i=0;
        for(int var:array){
            arr[i++]=var;
        }
    }
}    
    

Q.You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Ans-class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currentsum=arr[0];
        int maxsum =arr[0];
        for(int i=1;i<arr.length;i++){
            currentsum= Math.max(arr[i],currentsum+arr[i]);
            maxsum = Math.max(currentsum,maxsum);
            
        }
        return maxsum;
    }
}
    
