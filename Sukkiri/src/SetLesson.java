import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SetLesson {

	public static void main(String[] args) {
		Set<String>colores=new HashSet<>();
		colores.add("赤");
		colores.add("青");
		colores.add("黄");
		colores.add("赤");
		System.out.println("色は"+colores.size()+"種類");
		for(String s:colores) {
			System.out.println(s);
		}
		int count=0;
		Set<Integer>dices=new HashSet<>();
		Random rand=new Random();

		while(dices.size()<6) {
			count++;
			int dice=rand.nextInt(6)+1;
			System.out.println(dice);
			dices.add(dice);
		}
		System.out.println(count+"回で全部揃いました");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("何回>>");
		int n=sc.nextInt();
		Set<Integer> data=new HashSet<>();
		for(int i=0;i<n;i++) {
			int dice=rand.nextInt(6)+1;
			data.add(dice);
		}
		if(data.size()==1) {
			System.out.println("ゾロ目");
		}else {
			System.out.println("ゾロ目ではありません");
		}

		List<Integer> nums=new ArrayList<>();
		nums.add(5);
		nums.add(3);
		nums.add(2);
		nums.add(5);
		nums.add(5);
		nums.add(4);
		System.out.println(nums);
		Set<Integer>ns=new HashSet<>(nums);
		System.out.println(ns);
		System.out.println(ns.size()+"種類あります");
	}
}
