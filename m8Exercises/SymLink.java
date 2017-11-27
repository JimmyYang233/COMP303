package m8Exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class SymLink extends AbstractFile{
	
	private ArrayList<lFile> alFiles=new ArrayList<lFile>(); 
	
	public SymLink(String pName) {
		super(pName);
	}
	
	public void add(lFile plFile){
		alFiles.add(plFile);
	}

	@Override
	public Iterator<lFile> iterator() {
		return alFiles.iterator();
	}

	@Override
	public void accept(UnitVisitor pVisitor) {
		pVisitor.visitSymLink(this);
	}
	
}
