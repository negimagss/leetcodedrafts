package goldmanSachs;

import org.junit.Test;

public class HashMap<K, V> {
	//static K =1;
	
	@Test
	void run() {
		getString(1, 1);
	}
	
	void getString(K k , V  v) {
		System.out.println(k +" "+  v);
	}
	
	
	
}
