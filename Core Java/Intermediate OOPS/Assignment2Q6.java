abstract class Persistence{
	abstract public String persist();
}
class FilePersistence extends Persistence{

	@Override
	public String persist() {
		return "File Persistence Method";
	}
}
class DataBasePersistence extends Persistence{

	@Override
	public String persist() {
		return "Data Base Persistence Method";
	}
}
class PersistanceProvider
{
	public static Persistence getPersistence() 
	{
		if( Math.random()*10 > 5)
			return new FilePersistence();
			
		return new DataBasePersistence();
	}
}
public class Assignment2Q6 {
	public static void main(String[] args)
	{
		Persistance unknownPersistenceObject = PersistenceProvider.getPersistance();

		System.out.println(unknownPersistence.persist());
	}

}