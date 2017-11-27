package m8Exercises;

public class Driver {

	public static void main(String[] args) {
		File porn=new File("Porn");
		File code=new File("Code");
		File movie=new File("Movie");
		File nakedPicture=new File("Naked Picture");
		Directory study=new Directory("Study");
		Directory secret=new Directory("Secret");
		Directory main=new Directory("main");
		secret.add(porn);
		secret.add(nakedPicture);
		study.add(code);
		main.add(movie);
		main.add(study);
		study.add(secret);
		PrintVisitor printVisitor=new PrintVisitor();
		main.accept(printVisitor);
	}

}
