package package1;

public class Login {

	public static void main(String[] args) {
		User admin = new User();
		admin.setPassword("password");
		admin.setUsername("admin");
		System.out.println(admin.getPassword());
		System.out.println(admin.getUsername());
	}

}
