package NumSorting;
import java.util.*;

/* N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오. */

public class NumSorting {
	public static void main(String[] args) {
		
		/* 이중 for문을 사용헀으며 처음 값다 다음값을 비교해가며 작은 수를 앞에 저장하고 큰 값을 뒤에 넣어주는 것을 반복하며 정렬하도록 만들었다.*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i =0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = i+1; j < num; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}

}
