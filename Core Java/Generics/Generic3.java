class Generic<T>{
	public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
	}
	
}
public class Generic3 {

	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5};
		Generic<Integer> objGeneric = new Generic<>();
		Integer[] arr1=objGeneric.swap(arr, 1, 4);
		for(int i : arr1) {
			System.out.println(i);
		}

	}

}
