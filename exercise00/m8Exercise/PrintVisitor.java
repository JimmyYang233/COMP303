package m8Exercise;

public class PrintVisitor implements UnitVisitor{

	@Override
	public void visitFile(File pFile) {
		System.out.println(pFile.getName());
		
	}

	@Override
	public void visitDirectory(Directory pDirectory) {
		System.out.println(pDirectory.getName());
		for(lFile plFile: pDirectory){
			plFile.accept(this);
		}
	}

	@Override
	public void visitSymLink(SymLink pSymLink) {
		System.out.println(pSymLink.getName());
		for(lFile plFile: pSymLink){
			plFile.accept(this);
		}
	}

	@Override
	public void visitHiddenDirectory(HiddenDirectoryDecorator pHiddenDirectory)
	{
		System.out.println(pHiddenDirectory.getName());
		for(lFile plFile : pHiddenDirectory) {
			plFile.accept(this);
		}
		
	}
	
}
