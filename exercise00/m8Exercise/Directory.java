package m8Exercise;

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
		ArrayList<lFile> tmp= new ArrayList<>(alFiles);
		return tmp.iterator();
	}

	@Override
	public void accept(UnitVisitor pVisitor) {
		pVisitor.visitDirectory(this);
		
	}

	@Override
	public void remove(lFile pName)
	{
		alFiles.remove(pName);
//		for(lFile plFile : alFiles)
//		{
//			if (plFile.getName().equals(pName))
//			{
//				alFiles.remove(plFile);
//			}
//		}
	}

}
