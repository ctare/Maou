import java.util.Scanner;

public class Maou {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("勇者に会いました");

		M m = new M();


		while(true){
			int a = sc.nextInt();
			m.setHp(m.getHp()-a);
			if(m.hp <= 0){
				break;
			}
		}
		System.out.println("魔王は世界を救った");
	}
}

class M{
	int hp  = 10;

	void setHp(int hp){
		this.hp = hp;
	}

	int getHp(){
		return this.hp;
	}
}
