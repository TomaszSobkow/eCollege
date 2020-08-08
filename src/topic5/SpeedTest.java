public class SpeedTest{
	
	public static void main(String[] args){
		
		String test = "test";
		long currentTime = System.currentTimeMillis();
		for(long i = 0; i < 100000; i++){
			test += " czasu";	
		}
		
		System.out.println("Time was setup String to 10_000 = " + (System.currentTimeMillis() - currentTime)/1000);
		
		currentTime = System.currentTimeMillis();
		String test2 = new String ("test");
		StringBuffer sb = new StringBuffer(test2);
		for(long i = 0; i < 100000; i++){
			sb.append("czasu");
		}
		System.out.println("Time was setup StringBufer to 10_000 = "+ (System.currentTimeMillis() - currentTime)/1000);
	
		
		
		currentTime = System.currentTimeMillis();
		StringBuilder sbulder = new StringBuilder("test");
		for(int i = 0; i < 100000; i++){
			sbulder.append("czasu");
		}
		System.out.println("Time was setup StringBulder to 10_000 = "+ (System.currentTimeMillis() - currentTime)/1000);
		
		
	}
}