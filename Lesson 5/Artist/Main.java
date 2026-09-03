class Artist {
	private String name;
	private String medium;
	private int age;

	public Artist(String name, String medium, int age) {
		this.name = name;
		this.medium = medium;
		this.age = age;
	}

	public void introduceSelf() {
		System.out.println("Name: " + name);
		System.out.println("Medium: " + medium);
		System.out.println("Age: " + age);
	}
}

public class Main {
	public static void main(String[] args) {
		Artist artist = new Artist("Jungkook", "Music", 28);
		artist.introduceSelf();
	}
}
