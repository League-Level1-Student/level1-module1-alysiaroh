
public class Vault {
int secretCode;
boolean tryCode(int code) {
 if(code==secretCode) {
	 return true;
 }
 else {
	 return false;
 }
}
}
