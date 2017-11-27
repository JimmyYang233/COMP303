package m8Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class File extends AbstractFile{

	public File(String pName) {
		super(pName);
	}

	@Override
	public Iterator<lFile> iterator() {
		return Arrays.asList(new lFile[] {this}).iterator();
	}

	@Override
	public void accept(UnitVisitor pVisitor) {
		pVisitor.visitFile(this);
		
	}
	
}
