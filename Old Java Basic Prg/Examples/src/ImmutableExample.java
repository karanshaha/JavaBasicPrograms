
public final class ImmutableExample {

	private final  String name;
	private final Integer rollNo;
	
	public ImmutableExample(String name,Integer rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}

	public Integer getRollNo() {
		return rollNo;
	}
	
	public static void main(String s[]){
		String s1 = "ABC";
		Integer i1 = 101;
		ImmutableExample obj = new ImmutableExample(s1, i1);
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
		
		//tryMod(obj);
		s1="xyz";
		i1 = 102;
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
	//	obj.name = "mmm";
		
	}
	public static void tryMod(ImmutableExample obj){
	/*	obj.name = "kk";
		obj.rollNo =50;*/
		System.out.println(obj.getName());
	}
}
