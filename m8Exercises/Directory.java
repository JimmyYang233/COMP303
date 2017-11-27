package m8Exercises;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends AbstractFile{
	
	private ArrayList<lFile> alFiles=new ArrayList<lFile>(); 
	
	public Directory(String pName) {
		super(pName);
	}
	
	public void add(lFile plFile){
		alFiles.add(plFile);
	}

	@Override
	public Iterator<lFile> iterator()
	{
		return alFiles.iterator();
	}

	@Override
	public void accept(UnitVisitor pVisitor) {
		pVisitor.visitDirectory(this);
		
	}
	
}
