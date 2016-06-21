import java.util.ArrayList;




public class ParseResponse {
	
	
	
	public static void main(String s[]){
		
		
		String str = "TUEF11001A_____________________BB99900101000123116228082012172400NA03N010103A020303IOU0501S06082808200007011ID03I0101062808010202DLPA03A010137RM_167_HUNG_SING_HSE_HUNG_HOM_EST_KLN0701Y0801N0901N1001N1101N1201N130828082012140828082012PH03P0101038520308082810010501S0601R0701N0808280820120908280820121001NPH03P020102630308082810020501S0601R0701N0808280820120908280820121001NEA03E010113A02@GOOGLE.CN0201N030828082012040828082012EA03E020112A01@YAHOO.CN0201N030828082012040828082012SM03S0101010020100301004010ES02**NA03N010103AAA0204BBBB";
		
		
		if(str.startsWith("TUEF")){
			String[]  strByNameSegment= str.split("NA03N01");
			new ParseResponse().getParsedNameSegmentData(strByNameSegment);
			
	}
	
	}
	

	public NameSegmaentPojo getParsedNameSegmentData(String []strByNameSegment){
		//String firstNameArr[] = new String[strByNameSegment.length-1];
		int nameCounter = 0;
		
		ArrayList<NameSegmaentPojo> nameSegementList =  new ArrayList<NameSegmaentPojo>();
		
		for(int i = 1 ;i<=strByNameSegment.length;i++){
			
			String tempString = strByNameSegment[i];
			System.out.println(tempString.indexOf("ID03I0"));
			NameSegmaentPojo object = new NameSegmaentPojo();
			fun1(tempString,0,object);
		
			return object;
	}
		return null;
		
}
	
	public void fun1(String tempString,int index,NameSegmaentPojo object){
		
		int endIndexForSegment = index+2;
		int endIndexForLength = endIndexForSegment + 2;
		if(tempString.length() >= index){
		String tempstr =  tempString.substring(index, endIndexForSegment);
		
		ArrayList<NameSegmaentPojo> nameSegementList =  new ArrayList<NameSegmaentPojo>();
		
		label : {
			
			if(tempstr.equals("EA") || tempstr.equals("EM") || tempstr.equals("ID")){
				
				break label;
			}
			{
				int lengthToRead = Integer.parseInt(tempString.substring(endIndexForSegment, endIndexForLength));
				
				
				if(tempstr.equals("01")){
					object.setFname(tempString.substring(endIndexForLength,endIndexForLength+lengthToRead));
				}
				if(tempstr.equals("02")){
					object.setMname(tempString.substring(endIndexForLength,endIndexForLength+lengthToRead));
				}
				if(tempstr.equals("03")){
					object.setLname(tempString.substring(endIndexForLength,endIndexForLength+lengthToRead));
				}
				if(tempstr.equals("04")){
					object.setMothersName(tempString.substring(endIndexForLength,endIndexForLength+lengthToRead));			
				}
				if(tempstr.equals("05")){
					object.setCivilStatus(tempString.substring(endIndexForLength,endIndexForLength+lengthToRead));
				}
				
				index = endIndexForLength+lengthToRead;
				fun1(tempString,index,object);
			}
		}
	}
		System.out.println(object);
		
	}
}
