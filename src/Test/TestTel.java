package Test;

import java.text.DecimalFormat;

public class TestTel {

	public static void main(String[] args) {
		
		long phoneFmt = 123456789L;
		//prend 12 chiffres Stirng , commencant à gauche par un '0'
		DecimalFormat phoneDecimalFmt = new DecimalFormat("0000000000");
		String noTelString= phoneDecimalFmt.format(phoneFmt);

		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
		    //un group de 4-4
		String[] phoneNumArr={noTelString.substring(0, 2),
		          noTelString.substring(2,6),
		          noTelString.substring(6)};
 
		System.out.println(phoneMsgFmt.format(phoneNumArr));

	}

}
