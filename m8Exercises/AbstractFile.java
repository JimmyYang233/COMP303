package m8Exercises;

public abstract class AbstractFile implements lFile{
	String aName;
	
	protected AbstractFile(String pName){
		aName=pName;
	}

	public String getName(){
		return aName;
	}
}
