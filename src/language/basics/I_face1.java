package language.basics;

public interface I_face1 {

	public void click();

	public String strng();

	default void darkTheme() {

	}

	public void logOut();

	private void launchApp() {
		System.out.println("Launch Application");

	}

}
