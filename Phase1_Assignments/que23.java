
public class que23 {

	int SmallestValue(int arr[], int l, int r, int k) 
    { 
                 if (k > 0 && k <= r - l + 1) 
            { 
                    int pos = randomPartition(arr, l, r); 
                    if (pos-l == k-1) 
                        return arr[pos]; 
                    if (pos-l > k-1) 
                        return SmallestValue(arr, l, pos-1, k); 
                    return SmallestValue(arr, pos+1, r, k-pos+l-1); 
            } 
    return Integer.MAX_VALUE; 
} 
void swap(int arr[], int i, int j) 
{ 
    int temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
} 
int partition(int arr[], int l, int r) 
{ 
    int x = arr[r], i = l; 
    for (int j = l; j <= r - 1; j++) 
    { 
        if (arr[j] <= x) 
        { 
            swap(arr, i, j); 
            i++; 
        } 
    } 
    swap(arr, i, r); 
    return i; 
} 
int randomPartition(int arr[], int l, int r) 
{ 
    int n = r-l+1; 
    int pivot = (int)(Math.random()) * (n-1); 
    swap(arr, l + pivot, r); 
    return partition(arr, l, r); 
} 

public static class OrderStatistics {
public static void main(String[] args) {
	que23 ob = new que23(); 
    int arr[] = {12, 3, 5, 79, 4, 19, 26}; 
    int n = arr.length,k = 4; 
    System.out.println(" Smallest element is "+ ob.SmallestValue(arr, 0, n-1, k)); 
}
}
	
}
