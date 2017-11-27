package m8Exercises;

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
		for(lFile plFile: pSymLink){
			plFile.accept(this);
		}
	}
	
}
