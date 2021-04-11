
public class Fundraiser {
	static int[] combineOrder(int arr1[],int arr2[]){
		int arr[] = new int[5];
		for(int i = 0;i<5;i++){
		arr[i] = arr1[i] + arr2[i];
		}
		return arr;
		}

		public static void main(String args[]){
		int arr1[] = {0, 0, 3, 4, 7};
		int arr2[] = {0, 4, 0, 1, 2};

		int[] arr = combineOrder(arr1,arr2);
		System.out.println("Combined order: ");
		for(int i = 0;i<5;i++){
		System.out.println(arr[i]);
		}
		}
		}

