public class JamesBond {
public static void main(String[] args) {
Vault v = new Vault();
JamesBond j = new JamesBond();

}
int findCode(Vault v) {
		for(int i=0;i<1000000;i++) {
			if(v.tryCode(i)) {
				return i;
			}	
			}
		return -1;
		}
		
	}



//3. Make a James Bond class that has a method findCode() that takes a Vault as a parameter.
//The codes are between 0 and 1 million. This method tries all the codes, and returns the first code that opens the vault, or -1 if no code opened the vault.

//4. Test your code by instantiating the JamesBond and Vault classes.

