package ex01_collection_set;

import java.util.TreeSet;

//�ߺ� X , �������� ����
public class TreeSetMain {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			//set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		System.out.println(set.headSet(new Integer(50)));
		System.out.println(set.headSet(50)); // 50���� ������
		
		System.out.println(set.tailSet(50)); // 50���� ū��
		}
}
