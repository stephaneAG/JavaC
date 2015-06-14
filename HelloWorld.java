/* HelloWorld.java */

import com.sun.jna.Library;
import com.sun.jna.Native;

public class HelloWorld{
	
	/* Interface implementing C functions (..) */
	public interface CTest extends Library{
		public void helloFromC();
	}
	
	/* Program's Main */
	static public void main(String argv[]){
		CTest ctest = (CTest) Native.loadLibrary("test", CTest.class);
		ctest.helloFromC();
	}
}