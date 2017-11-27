package m8Exercise;

import java.util.Iterator;

public class HiddenDirectoryDecorator extends AbstractFile
{
	private Directory aDirectory;
	protected HiddenDirectoryDecorator(String pName)
	{
		super(pName);
		aDirectory=new Directory(pName);
	}
	
	public void add(lFile plFile)
	{
		aDirectory.add(plFile);
	}
	
	@Override
	public Iterator<lFile> iterator()
	{
		return aDirectory.iterator();
	}
	
	@Override
	public String getName() {
		return "."+ aDirectory.getName();
	}
	
	@Override
	public void accept(UnitVisitor pVisitor)
	{
		pVisitor.visitHiddenDirectory(this);
	}

	@Override
	public void remove(lFile pName)
	{
		aDirectory.remove(pName);
		
	}

}