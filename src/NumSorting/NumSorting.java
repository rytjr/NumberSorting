package NumSorting;
import java.util.*;

/* N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class NumSorting {
	public static void main(String[] args) {
		
		/* ���� for���� ��������� ó�� ���� �������� ���ذ��� ���� ���� �տ� �����ϰ� ū ���� �ڿ� �־��ִ� ���� �ݺ��ϸ� �����ϵ��� �������.*/
		
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
