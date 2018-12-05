
import java.security.MessageDigest;
import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

public class DigestTest  {
	
	public static void main(String args[]) throws Exception
	{
		Security.addProvider(new BouncyCastleProvider());
		MessageDigest hash = MessageDigest.getInstance("SHA1", "BC");
		
		String hash_input1 = "student_no";
		String hash_input2 = "name";
				
		
		//update + digest
		hash.update(Utils.toByteArray(hash_input1));
		byte out[] = hash.digest(Utils.toByteArray(hash_input2));
	
		
		// String concatenation + digest
		byte out1[] = hash.digest(Utils.toByteArray(hash_input1+hash_input2));
		
		System.out.println("md  = " + Utils.toHexString(out));
		System.out.println("md  = " + Utils.toHexString(out1));
		
		// modification
		
	}

	
	
}
