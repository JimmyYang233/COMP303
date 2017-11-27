package m8Exercise;

public class DeleteVisitor implements UnitVisitor
{
	private String deleteName;

	public DeleteVisitor(String pName)
	{
		deleteName=pName;
	}
	@Override
	public void visitFile(File pFile)
	{
	}

	@Override
	public void visitDirectory(Directory pDirectory)
	{
		for(lFile plFile : pDirectory)
		{
			if(plFile.getName().equals(deleteName))
			{
				pDirectory.remove(plFile);
			}
			else
			{
				plFile.accept(this);
			}
		}
	}

	@Override
	public void visitSymLink(SymLink pSymLink)
	{
		for(lFile plFile : pSymLink)
		{
			if(plFile.getName().equals(deleteName))
			{
				pSymLink.remove(plFile);
			}
			else
			{
				plFile.accept(this);
			}
		}
		
	}

	@Override
	public void visitHiddenDirectory(HiddenDirectoryDecorator pHiddenDirectory)
	{
		for(lFile plFile : pHiddenDirectory)
		{
			if(plFile.getName().equals(deleteName))
			{
				pHiddenDirectory.remove(plFile);
			}
			else
			{
				plFile.accept(this);
			}
		}
		
		
	}

}
