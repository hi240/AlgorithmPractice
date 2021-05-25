package binarySearch;
//이분 탐색
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,7,9};
		binary(7,arr);
	}
	public static void binary(int num,int[] arr) {
		int mid=0;
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			mid=(left+right)/2;
			if(num==arr[mid]) {
				System.out.println(num+"은 "+mid+"번째 배열에 위치해있습니다.");
				break;
			}
			if(num<arr[mid]) right=mid-1;
			else left=mid+1;
		}
	}
}
	