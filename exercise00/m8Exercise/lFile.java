package m8Exercise;

public interface lFile extends Iterable<lFile>, Visitable {
	public String getName();
	public void remove(lFile pName);
}
