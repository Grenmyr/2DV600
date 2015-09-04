package CountJava;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class CountJava {
	private List<File> _files;
	private LinkedList<String> _scanDetails;
	
	public CountJava(File rootFile) {
		_files = listJavaFiles(rootFile);
		_scanDetails = scanJavaFiles(_files);
		System.out.println(_scanDetails);
	}

	public static void main(String[] args) {
		try{
			new CountJava(new File(args[0]));
		}catch(Exception e){
			System.out.println("Uknown error");	
		}
	}
	
	public List<File> listJavaFiles(File rootFile) {
        List<File> resultList = new ArrayList<File>();
        File[] fList = rootFile.listFiles();
        
        for (File file : fList) {
        	if(file.getName().endsWith("java")){
        		resultList.add(file);      		
            } 
        	else if (file.isDirectory()) {
                resultList.addAll(listJavaFiles(file));
            }
        }
        return resultList;
    } 
	
	public LinkedList<String> scanJavaFiles(List<File> files){
		LinkedList<String> list = new LinkedList<String>();
		try {
			for (int i=0; i <files.size(); i++){
				int count = 0;
				Scanner fileScanner = new Scanner(files.get(i));	
				while (fileScanner.hasNextLine()) {
						count +=1;    
						fileScanner.nextLine();
				}
				list.add(i+1+": "+files.get(i).getName()+ " Amount of lines: "+count);
				fileScanner.close();
			}
		} catch (IOException e1) {
			System.out.println("Error, make sure path is correct.");
		}
		return list;
	}
}
