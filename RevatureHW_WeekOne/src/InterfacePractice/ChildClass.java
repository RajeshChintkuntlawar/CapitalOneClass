package InterfacePractice;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ChildClass extends AbstractClass{

	public ChildClass(int ID, int number, String name) {
		super(ID, number, name);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getName(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumber(int ID) {
		// TODO Auto-generated method stub
		return 0;
	}

}
