import java.io.File;


public class FileExample {
	
	public static void main(String args[]){
		File file = new File("E:\\Personal Data");
		
		File []fileArr = file.listFiles();
		
		for(File fileObj:fileArr){
			if(fileObj.isFile()){
				System.out.println("File Name : "+fileObj.getName());
			}
			if(fileObj.isDirectory()){
				System.out.println("Directory Name : "+fileObj.getName());
				System.out.println("Path :"+ fileObj.getAbsolutePath());
				File innerFile = new  File(fileObj.getAbsolutePath());
				File []innerFilesFolder = innerFile.listFiles();
				for(File F:innerFilesFolder){
					if(F.isFile()){
						System.out.println("Inner Files :"+F.getName());
					}
					if(F.isDirectory()){
						System.out.println("Inner Directory"+F.getName());
					}
				}
			}
		}
		
	}

}
