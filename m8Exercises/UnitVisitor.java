package m8Exercises;

public interface UnitVisitor {
	public void visitFile(File pFile);
	public void visitDirectory(Directory pDirectory);
	public void visitSymLink(SymLink pSymLink);
}
