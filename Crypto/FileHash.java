
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public class FileHash {
	
	public static void main(String args[]) throws Exception
	{
		int BUF_SIZE = 1024;
		
		byte[] buffer = new byte[BUF_SIZE];
		//MessageDigest digest = MessageDigest.getInstance("MD5");
		MessageDigest digest = MessageDigest.getInstance("SHA1");
		FileInputStream fis = new FileInputStream("1.pdf");
		int read = BUF_SIZE;

		while ((read = fis.read(buffer, 0, BUF_SIZE)) > 0) {

			digest.update(buffer, 0, read);
		}
		byte[] out = digest.digest();

		
		System.out.println("md = " + Utils.toHexString(out));

	}

}
