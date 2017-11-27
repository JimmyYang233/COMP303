package m8Exercise;

public class Driver {

	public static void main(String[] args) {
		File porn=new File("Porn");
		File code=new File("Code");
		File movie=new File("Movie");
		File nakedPicture=new File("Naked Picture");
		Directory study=new Directory("Study");
		Directory secret=new Directory("Secret");
		Directory main=new Directory("main");
		HiddenDirectoryDecorator hidden=new HiddenDirectoryDecorator("Hidden");
		hidden.add(porn);
		hidden.add(nakedPicture);
		study.add(code);
		study.add(hidden);
		main.add(movie);
		main.add(study);
		PrintVisitor printVisitor=new PrintVisitor();
		DeleteVisitor deleteStudy=new DeleteVisitor("Study");
		DeleteVisitor deletePorn= new DeleteVisitor("Porn");
		DeleteVisitor deleteHidden= new DeleteVisitor(".Hidden");
		main.accept(printVisitor);
		System.out.println("...................................");
		main.accept(deletePorn);
		main.accept(printVisitor);
		System.out.println("...................................");
		main.accept(deleteHidden);
		//main.accept(deleteStudy); 
		main.accept(printVisitor);
	}

}
