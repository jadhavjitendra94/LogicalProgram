package Logical;

public class Remove_Specieal_Character {

	public static void main(String[] args) {

		String name="dhjdhdshk872387$%**$#@##jsdkjs";
		System.out.println(name.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
