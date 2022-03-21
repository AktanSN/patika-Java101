package boksOyunu;

import java.util.Random;

public class Match {
	Fighter f1;
	Fighter f2;

	int minWeight;
	int maxWeight;

	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}
	
	void run() {
		if(isCheck()) {
			int first;
			int count=1;
			System.out.println("Fighter "+this.f1.name+ " Health: "+this.f1.health);
			System.out.println("Fighter "+this.f2.name+ " Health: "+this.f2.health);
			
			
			while(this.f1.health>0 && this.f2.health>0) {
				System.out.println("==== Round " +count+" ====");
				Random random = new Random();
				first= random.nextInt(2)+1;
				if(first==1) {
					this.f2.health= this.f1.hit(this.f2);
				}else {
					this.f1.health=this.f2.hit(this.f1);
					
				}
				System.out.println("Fighter "+this.f1.name+ " Health: "+this.f1.health);
				System.out.println("Fighter "+this.f2.name+ " Health: "+this.f2.health);
				if(isWin()){
					break;
				}
				count++;
				
			}
		}else {
			System.out.println("Sporcularýn sikletleri uymuyor.");
		}
	}
	
	boolean isCheck() {
		return (this.f1.weight >= this.minWeight && this.f1.weight<= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight<= this.maxWeight);
	}
	
	boolean isWin(){
		if(this.f1.health==0) {
			System.out.println("===================");
			System.out.println(this.f2.name+" kazandý!");
			return true;
		}
		if(this.f2.health==0) {
			System.out.println("===================");
			System.out.println(this.f1.name+" kazandý!");
			return true;
		}
		
		return false;
	}
	
	
}
