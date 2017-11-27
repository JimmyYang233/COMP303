package m8Exercise;

public interface UnitVisitor {
	public void visitFile(File pFile);
	public void visitDirectory(Directory pDirectory);
	public void visitSymLink(SymLink pSymLink);
	public void visitHiddenDirectory(HiddenDirectoryDecorator pHiddenDirectory);
}
