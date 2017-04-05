import java.io.*;

public class FileStreamTest{

  public static void main(String[] args) {
  	
  	try{

  		byte bwrite[]={11,25,45,54,54};
  		OutputStream os=new FileOutputStream("test.txt");
  		for (int i=0;i<bwrite.length ;i++ ) {
  		 	os.write(bwrite[i]); // write the bytes
  		}
  		os.close();

  		InputStream is =new FileInputStream("test.txt");

  		int size=is.available();

  		for(int i=0;i<size;i++){
  			System.out.print( (char)is.read()+ " ");
  		}
  		is.close();

  	}catch(IOException e){
  		System.out.print("Exception");
  	}

  }

}