package sec1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Æ¯Á¤ µ¥ÀÌÅÍ°¡ Çü½ÄÀÌ ¸Â´ÂÁö ºñ±³ÇÏ·Á°í ÇÒ °æ¿ì µ¥ÀÌÅÍÇü½ÄÀ» ÁöÁ¤ÇÏ´Â Å¬·¡½º
//Matcher : Æ¯Á¤ ÆĞÅÏÀÇ ÇüÅÂ°¡ ¸Â´ÂÁö ºñ±³ÇÏ´Â Å¬·¡½º
//Á¤±Ô½Ä(Reg Expression) -> regex

public class PatternExam {
	public static void main(String arge[]) {
		
		String[] dt = {"beg","ty","9to6","8to5","single","Mom","ABC","ÃÖÅÂ¿µ","±³±³±³","546654"};
//		Pattern p = Pattern.compile("[a-z]*"); //¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[0-9a-z]*"); //¼ıÀÚ¿Í ¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[A-Za-z]*"); //¿µ¹® ´ë¹®ÀÚ,¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("s[A-Za-z]*"); //s·Î ½ÃÀÛÇÏ°í, ¿µ¹® ´ë¹®ÀÚ/¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
//		Pattern p = Pattern.compile("[°¡-ÆR]*"); //ÇÑ±Û·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ. ±¹Á¦ Ç¥ÁØ¿¡¼­ ÇÑ±Û µ¥ÀÌÅÍ Áß °¡Àå Ã¹¹øÂ° µ¥ÀÌÅÍ´Â "°¡", °¡Àå ¸¶Áö¸· µ¥ÀÌÅÍ´Â "ÆR"ÀÌ±â¶§¹®.
//		Pattern p = Pattern.compile("e$*"); //Æ¯Á¤ ¹®ÀÚ·Î ³¡³ª´Â °æ¿ì ¹®ÀÚ µÚ¿¡ $ -> À¥¿¡¼­ »ç¿ë°¡´É
//		Pattern p = Pattern.compile("^b*"); //Æ¯Á¤ ¹®ÀÚ·Î ½ÃÀÛÇÏ´Â °æ¿ì ¹®ÀÚ ¾Õ¿¡ ^ -> À¥¿¡¼­ »ç¿ë°¡´É
		Pattern p = Pattern.compile("^[0-9]*"); //¸ğµç °ªÀÌ ¼ıÀÚÀÎ µ¥ÀÌÅÍ2

		for(int i=0; i<dt.length; i++) {
			Matcher m= p.matcher(dt[i]);
			if(m.matches()) {
				System.out.println("Çü½Ä ÀÏÄ¡ : " + dt[i]);
			}
		}

	}
}
