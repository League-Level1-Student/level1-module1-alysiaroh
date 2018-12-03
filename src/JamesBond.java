public class JamesBond {
int findCode(Vault v) {
	for(int i=0;i<1000000;i++) {
		boolean a = v.tryCode(i);
		if(a==true) {
		return i;
	}
	
	}
	return -1;
}



}


