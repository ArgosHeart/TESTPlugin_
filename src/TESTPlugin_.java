import ij.IJ;
import ij.plugin.PlugIn;


public class TESTPlugin_ implements PlugIn{

	@Override
	public void run(String arg) {
		// TODO Auto-generated method stub
		IJ.log("hello world");
		IJ.error("hello");
	}

}
