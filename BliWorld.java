/* BliWorld.java */

import com.sun.jna.Library;
import com.sun.jna.Native;

public class BliWorld{
	
	/* Interface implementing C functions (..) */
	public interface CBli extends Library{
		public void helloFromC();
		public void printOutWorkingDirFromC();
	}
	
	/* Program's Main */
	static public void main(String argv[]){
		CBli cBli = (CBli) Native.loadLibrary("bli", CBli.class);
		cBli.helloFromC();
		cBli.printOutWorkingDirFromC();
	}
}