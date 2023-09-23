package com.practice1;

import java.util.Optional;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;

public class Tester1 implements OneInter, Twointer {
	 Optional<Integer> i;

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getClass().getName());
//
//		ExecutorService es = Executors.newSingleThreadExecutor();
//		es.execute(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("hai");
//				System.out.println(Thread.currentThread().getClass().getName());
//
//			}
//		});
//		es.shutdown();

//		Tester1 tester1 = new Tester1();
//		System.out.println("output >>>>>>>>>>" + tester1.myMethod());
//		
//		HashMap<String,Stu> m=new HashMap<>();
//		m.put(null,new Stu(10));
//		m.put(null,null);
//		
//		System.out.println(m);//{100=vijay}
////		m.put("100","ashok");
//System.out.println(m.put(null,new Stu(20)));
//		System.out.println(m);//{100=ashok}
		
		
//		System.out.println(new Tester1().findSum());
		
		

	}

private  void findSum() {
	if(i.isPresent()) {
		
		Integer orElse = i.orElse(9);
//		 orElse + new Integer(20);
	}
	}

//	@Override
//	public String myMethod() {
//		//  Auto-generated method stub
//		return Twointer.super.myMethod();
//	}

	public String myMethod() {

		return "MyMethod";
	}

}
class Stu{
	
	public Stu(int i) {
		this.id=i;
	}

	private int id;

	@Override
	public String toString() {
		return "" + id;
	}
	
	
}
