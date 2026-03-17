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
