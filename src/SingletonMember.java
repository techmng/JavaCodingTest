
public class SingletonMember {
	private SingletonMember objSingletonMember = null;

	private SingletonMember() {
	}

	public SingletonMember getSingletonMemberInstance() {
		if (objSingletonMember == null) {
			synchronized (SingletonMember.class) {
				objSingletonMember = new SingletonMember();
			}
		}

		return objSingletonMember;
	}
}
