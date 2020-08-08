package topic7.assignment;

class CalculateRemainder{
	
	
	public byte twoDigit(byte a, byte b){
		System.out.println("Mod operation on two bytes: "+a +" and "+b+" Result "+( a%b ));
		byte rem = (byte)(a%b);
		return rem;
	}

	public short twoDigit(short a, short b){
		System.out.println("Mod operation on two shorts: "+a +" and "+b+" Result "+( a%b ));
		short rem = (short)(a%b);
		return rem;
	}

	public int twoDigit(int a, int b){
		System.out.println("Mod operation on two ints: "+a +" and "+b+" Result "+( a%b ));
		int rem = (a%b);
		return rem;
	}

	public long twoDigit(long a, long b){
		System.out.println("Mod operation on two longs: "+a +" and "+b+" Result "+( a%b ));
		long rem = (a%b);
		return rem;
	}



}

class Assignment5_9{

	public static void main(String[] args){

		CalculateRemainder remainder = new CalculateRemainder();
		remainder.twoDigit((byte)100,(byte)6);
		remainder.twoDigit((short)100,(short)6);
		remainder.twoDigit(100, 6);
		remainder.twoDigit(100l, 6l);
		
		
	}
	
}