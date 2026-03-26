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
Q.Given an array arr[] denoting heights of n towers and a positive integer k.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by k
Decrease the height of the tower by k
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by k for each tower. After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = [1, 5, 8, 10]
Output: 5
Explanation: The array can be modified as [1+k, 5-k, 8-k, 10-k] = [3, 3, 6, 8]. 
The difference between the largest and the smallest is 8-3 = 5.
    
    
Ans-
    class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
     int n = arr.length;
        
        Arrays.sort(arr);  

        int ans = arr[n-1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;

            int minHeight = Math.min(arr[0] + k, arr[i] - k);
            int maxHeight = Math.max(arr[i-1] + k, arr[n-1] - k);

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}

// one question left
Question -
    Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty
Answer-
    class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
         ArrayList<Integer> list = new ArrayList<>();
         Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
           if(arr[i]==arr[i-1]){
              list.add(arr[i]);
           }
        }
        return list;
    }
}

Question-
    Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10]
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
Explanation: After merging two sorted arrays we get [1, 2, 3, 5, 8, 9, 10, 13, 15, 20].
Input: a[] = [0, 1], b[] = [2, 3]
Output: a[] = [0, 1], b[] = [2, 3]
Explanation: After merging two sorted arrays we get [0, 1, 2, 3].

Answer-
    class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
      int n = a.length;
      int m= b.length;
      int gap = (n+m+1)/2;
      while(gap>0){
          int i=0;
          int j=gap;
          while(j<n+m){
              // a vs a
              if(i<n && j<n){
                  if(a[i]>a[j]){
                      int temp=a[i];
                      a[i]=a[j];
                      a[j]=temp;
                  }
              }
              // a vs b
              else if(i<n && j>=n){
                  if(a[i]>b[j-n]){
                      int temp=a[i];
                      a[i]=b[j-n];
                      b[j-n]=temp;
                  }
              }
              else{
                  if (b[i - n] > b[j - n]) {
                        int temp = b[i - n];
                        b[i - n] = b[j - n];
                        b[j - n] = temp;
                    }
                  
              }
              i++;
              j++;
          }
          if(gap == 1) break;
            gap = (gap + 1) / 2;
      }
    }
}


Question 
You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

Answer-
    class Solution {
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

    



































Question-
    Given an array and a range a, b. The task is to partition the array around the range such that the array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.

Note: The generated output is true if you modify the given array successfully. Otherwise false.

Geeky Challenge: Solve this problem in O(n) time complexity.

Examples:

Input: arr[] = [1, 2, 3, 3, 4], a = 1, b = 2
Output: true
Explanation: One possible arrangement is: {1, 2, 3, 3, 4}. If you return a valid arrangement, output will be true.

    Answer-
 class Solution {
    public void threeWayPartition(int arr[], int a, int b) {
        int low=0;
        int high= arr.length-1;
        int mid=0;
        while(mid<=high){
            if(arr[mid]<a){
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]>b){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;     
            }
            else{
                mid++;
            }
        } 
    }
}   


Question-
    Given an array arr and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

Examples :

Input: arr[] = [2, 1, 5, 6, 3], k = 3
Output: 1
Explanation: To bring elements 2, 1, 3 together, swap index 2 with 4 (0-based indexing), i.e. element arr[2] = 5 with arr[4] = 3 such that final array will be- arr[] = [2, 1, 3, 6, 5]
Answer-
    class Solution {
    int minSwap(int[] arr, int k) {
        int good = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k) good++;
        }

        int bad = 0;
        for(int i = 0; i < good; i++){
            if(arr[i] > k) bad++;
        }

        int ans = bad;

        for(int i = 0, j = good; j < arr.length; i++, j++){
            if(arr[i] > k) bad--;
            if(arr[j] > k) bad++;

            ans = Math.min(ans, bad);
        }
        return ans;
    }
}
    
Question-
    iven an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

Examples:

Input: arr[] = [111, 222, 333, 444, 555]
Output: true
Explanation:
arr[0] = 111, which is a palindrome number.
arr[1] = 222, which is a palindrome number.
arr[2] = 333, which is a palindrome number.
arr[3] = 444, which is a palindrome number.
arr[4] = 555, which is a palindrome number.
As all numbers are palindrome so This will return true.
Input: arr[] = [121, 131, 20]
Output: false
Explanation: 20 is not a palindrome hence the output is false.

Answer-
    class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int original = num;
            int rev=0;
            while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num= num/10;
            }
            if(original != rev) return false;
        }
        return true;
    }
}

Question-
    Given an array arr[] of integers, calculate the median.

Examples:

Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median 
Input: arr[] = [56, 67, 30, 79]
Output: 61.5
Explanation: In case of even number of elements, average of two middle elements is the median. 

Answer-
    class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n = arr.length;
        if(n%2!=0){
            return arr[n/2];
        }
        else{
            double ans = (arr[n/2]+arr[(n/2)-1])/2.0;
            return ans;
        }
    }
}


Question-
    Given two sorted arrays a[] and b[], find and return the median of the combined array after merging them into a single sorted array.

Examples:

Input: a[] = [3, 5, 6, 12, 15], b[] = [3, 4, 6, 10, 10, 12]
Output: 6
Explanation: The merged array is [3, 3, 4, 5, 6, 6, 10, 10, 12, 12, 15]. So the median of the merged array is 6.
Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
Output: 11
Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20]. So the median of the merged array is (10 + 12) / 2 = 11.

Answer-
    import java.util.*;

class Solution {
    public double medianOf2(int a[], int b[]) {
        int total = a.length + b.length;
        int[] array = new int[total];
        
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            array[j++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            array[j++] = b[i];
        }

        Arrays.sort(array);

        // Odd case
        if (total % 2 != 0) {
            return array[total / 2];
        } 
        // Even case
        else {
            return (array[total / 2] + array[(total / 2) - 1]) / 2.0;
        }
    }
}



