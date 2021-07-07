package algorithm;

import java.util.ArrayList;

//병합정렬
public class MergeSort {
	public ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> dataList){
		if(dataList.size()<=1) return dataList;
		int medium = dataList.size()/2;
		ArrayList<Integer> leftArr = new ArrayList<>();
		ArrayList<Integer> rightArr = new ArrayList<>();
		leftArr=this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(0, medium)));
		rightArr=this.mergeSplitFunc(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));
		return mergeFunc(leftArr,rightArr);
	}
	public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftArr,ArrayList<Integer> rightArr){
		ArrayList<Integer> mergedList = new ArrayList<>();
		int leftpoint=0;
		int rightpoint=0;
		while(leftArr.size()>leftpoint&&rightArr.size()>rightpoint) {
			if(leftArr.get(leftpoint)>rightArr.get(rightpoint)) {
				mergedList.add(rightArr.get(rightpoint));
				rightpoint+=1;
			}else {
				mergedList.add(leftArr.get(leftpoint));
				leftpoint+=1;
			}
		}
		while(leftArr.size()>leftpoint) {
			mergedList.add(leftArr.get(leftpoint));
			leftpoint+=1;
		}
		while(rightArr.size()>rightpoint) {
			mergedList.add(rightArr.get(rightpoint));
			rightpoint+=1;
		}
		return mergedList;
	}
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(4);
		test.add(3);
		test.add(6);
		MergeSort mergesort = new MergeSort();
		System.out.println(mergesort.mergeSplitFunc(test));
	}

}
