package testing;

public class Korean {

	//Lead of hangul Jamo(ChoSeung) and those English KeyCode.
	private static final String[][] LJ = { {"\u1100","r" }, {"\u1101", "R"}, {"\u1102", "s"}, {"\u1103", "e"}, 
				{"\u1104", "E"}, {"\u1105", "f"}, {"\u1106", "a"}, {"\u1107", "q"}, {"\u1108", "Q"}, {"\u1109", "t"}, 
				{"\u110a", "T"}, {"\u110b", "d"}, {"\u110c", "w"}, {"\u110d", "W"}, {"\u110e", "c"}, {"\u110f", "z"}, 
				{"\u1110", "x"}, {"\u1111", "v"}, {"\u1112", "g"} };

	//Vowel of hangul Jamo(JungSeung) and those English KeyCode.
	//"A" is representative "hangul are-A" one of the old Hangul Jamo. but didn't matched to keyboard
	//are-A(K) is very useful making vowel char, the unicode is \u119e(Vowel Jamo) and \u318d(Compatibility)
	private static final String[][] VJ = { {"\u1161", "k"}, {"\u1162", "o"}, {"\u1163", "i"}, {"\u1164", "O"}, 
				{"\u1165", "j"}, {"\u1166", "p"}, {"\u1167", "u"}, {"\u1168", "P"}, {"\u1169", "h"}, {"\u116a", "hk"}, 
				{"\u116b", "ho"}, {"\u116c", "hl"}, {"\u116d", "y"}, {"\u116e", "n"}, {"\u116f", "nj"}, {"\u1170", "np"}, 
				{"\u1171", "nl"}, {"\u1172", "b"}, {"\u1173", "m"}, {"\u1174", "ml"}, {"\u1175", "l"}, {"\u119e", "K"} };

	//Tail of hagul Jamo(JongSeung) and those English KeyCode.
	private static final String[][] TJ = { {"\u11a8","r" }, {"\u11a9", "R"}, {"\u11aa", "rt"}, {"\u11ab", "s"}, 
				{"\u11ac", "sw"}, {"\u11ad", "sg"}, {"\u11ae", "e"}, {"\u11af", "f"}, {"\u11b0", "fr"}, {"\u11b1", "fa"},
				{"\u11b2", "fq"}, {"\u11b3", "ft"}, {"\u11b4", "fx"}, {"\u11b5", "fv"}, {"\u11b6", "fg"}, {"\u11b7", "a"}, 
				{"\u11b8", "q"}, {"\u11b9", "qt"}, {"\u11ba", "t"}, {"\u11bb", "T"}, {"\u11bc", "d"}, {"\u11bd", "x"}, 
				{"\u11be", "c"}, {"\u11bf", "z"}, {"\u11c0", "x"}, {"\u11c1", "v"}, {"\u11c2", "g"} };

	//Consonant of hangul Compatibility and those English KeyCode.
	public static final String[][] CC = { {"\u3131", "r"}, {"\u3132", "R"}, {"\u3133", "rt"}, {"\u3134", "s"}, 
				{"\u3135", "sw"}, {"\u3136", "sg"}, {"\u3137", "e"}, {"\u3138", "E"}, {"\u3139", "f"}, {"\u313a", "fr"}, 
				{"\u313b", "fa"}, {"\u313c", "fq"}, {"\u313d", "ft"}, {"\u313e", "fx"}, {"\u313f", "fv"}, {"\u3140", "fg"}, 
				{"\u3141", "a"}, {"\u3142", "q"}, {"\u3143", "Q"}, {"\u3144", "qt"}, {"\u3145", "t"}, {"\u3146", "T"}, 
				{"\u3147", "d"}, {"\u3148", "w"}, {"\u3149", "W"}, {"\u314a", "c"}, {"\u314b", "z"}, {"\u314c", "x"}, 
				{"\u314d", "v"}, {"\u314e", "g"} };

	//Vowel of hangul Compatibility and those English KeyCode.
	public static final String[][] VC = { {"\u314f", "k"} , {"\u3150", "o"}, {"\u3151", "i"}, {"\u3152", "O"}, 
				{"\u3153", "j"}, {"\u3154", "p"}, {"\u3155", "u"}, {"\u3156", "P"}, {"\u3157", "h"}, {"\u3158", "hk"}, 
				{"\u3159", "ho"}, {"\u315a", "hl"}, {"\u315b", "y"}, {"\u315c", "n"}, {"\u315d", "nj"}, {"\u315e", "np"}, 
				{"\u315f", "nl"}, {"\u3160", "b"}, {"\u3161", "m"}, {"\u3162", "ml"}, {"\u3163", "l"}, {"\u318d", "K"} };

	//Double Charactors among the CC and VC
	private static final String[][] DC = { //consonant
					{"\u3133", "rt"},{"\u3135", "sw"}, {"\u3136", "sg"}, {"\u313a", "fr"}, {"\u313b", "fa"}, 
					{"\u313c", "fq"}, {"\u313d", "ft"}, {"\u313e", "fx"}, {"\u313f", "fv"}, {"\u3140", "fg"}, {"\u3144", "qt"}, 
					  //vowel
					{"\u3158", "hk"}, {"\u3159", "ho"}, {"\u315a", "hl"}, {"\u315d", "nj"}, {"\u315e", "np"}, 
					{"\u315f", "nl"}, {"\u3162", "ml"} 
					};

	//change Double to Single Char. same two char(like rr) is always consonant, and the others are vowels
	private static final String[][] DS = {//double consonant char
				{"rr", "R"}, {"ee", "E"}, {"qq", "Q"}, {"tt", "T"}, {"ww", "W"},
					//double vowel char
				{"lK", "k"}, {"kl", "o"}, {"il", "O"}, {"Kl", "j"}, {"jl", "p"}, {"ul", "P"}, {"Km", "h"}, 
				{"mA", "n"}, {"nK", "b"}, {"kK", "i"}, {"il", "O"}, {"Kl", "j"}, {"jl", "p"}, {"ul", "P"},
				{"Km", "h"}, {"mK", "n"}, {"nK", "b"} 
				};

	//change Triple to Single or Double Char. every triple char is vowels
	private static final String[][] TS = { {"KKl", "u"}, {"hlK", "hk"}, {"hkl", "ho"}, {"KKm", "y"}, {"njl", "np"}, 
				{"KKl", "u"}, {"hlK", "hk"}, {"hkl", "ho"}, {"KKm", "y"}, {"njl", "np"} };

//	private static final String[] Type = {"LEAD", "VOWEL", "TAIL", "CONS", "COMP", "MULTI", "KOR", "ENG", "NOTHING"};

	private static final char replaceEn = '\u0cff';
	//LEAD, VOWEL, TAIL, CONS, COMP, MULTI, KOR, ENG, NOTKOR, NOTHING
	//VJ, VJ, TJ, CC, VC // DC // DS, TS
	public static String koreanBuild(String korean, char e){ //e should be a Korean Compatibility char. 
		 													//if e is english char, it convert '\u0cff' which is never used in Korean.
		StringBuilder kostr = new StringBuilder(); //constructed by korean lead, vowel, tail, sometimes constonant
	    StringBuilder enstr = new StringBuilder(); //constructed by english
	    StringBuilder inputEn = new StringBuilder(); //save input english char
	    
	    String en = ""+e;
		
	    //construct korean -> kostr, enstr
		if(korean.length()>0){
			String fko = flattenKorean(korean);
			char f;
			for(int i = 0; i<fko.length(); i++){
				f = fko.charAt(i);
				if(isType(f, "ENG")){
					kostr.append(replaceEn);
					enstr.append(replaceEn);
					inputEn.append(f);
//					System.out.println(inputEn);
				}else{
					kostr.append(f);
					enstr.append(convert(f, "ENG"));
				}
//				System.out.println("1. kostr = "+getUnicode(kostr)); 
//				System.out.println("1. enstr = "+enstr);
			}
		}

		//construct char en
		if(isType(en, "ENG")){
			return korean+en;
		}else if(isType(en, "MULTI")){
			if(korean.length()==0){
				korean = en;
				return korean;
			}
			String fko = flattenKorean(en);
			int fkolen = fko.length();
			kostr.append(fko);
//			System.out.println("kostr.append(fko)= "+kostr);
			for(int i = 0; i< fkolen; i++){
				enstr.append(convert(fko.charAt(i), "ENG"));
			}
//			System.out.println("enstr= "+enstr);

		//not multi but Korean (hangul jamo) -> english
		}else if(isType(en, "KOR")){
			en = convert(en, "ENG");
		}else {
			return korean+en;
		}
		
		//start!
		if(isType(en, "ENG")){
			
			//first char is compatibility
			if(korean.length()==0){
				korean = convert(en, "COMP");
				return korean;
			}else if(!isType(korean.charAt(korean.length()-1), "KOR")){
				korean = korean + convert(en, "COMP");
				return korean;
			}
			
			int enlen = enstr.length();
//			int kolen = kostr.length();
//			System.out.println("3. kostr= "+getUnicode(kostr.toString()));
//			System.out.println("3. enstr= "+enstr);

			if(enlen>0){
				//the english text sequence is ...b_2, b_1, en. (b means before)
				String b_1, b_2; 
				String kotmp, entmp;
				b_1 = ""+enstr.charAt(enlen-1);
				
				//1. en is vowel 
				if(isType(en, "VOWEL")){
					if(isType(b_1, "CONS")){
						entmp = en;
						char kolast = kostr.charAt(kostr.length()-1);
						String enlast = convert(kolast, "ENG");
						int cri = 0;

						if(enlast.equals("R") && whereIsVowel(kostr.toString())==2){
							enlast = "rr";
							cri = 1;
						}
						else if(enlast.equals("E") && whereIsVowel(kostr.toString())==2){
							enlast = "ee";
							cri = 1;
						}
						else if(enlast.equals("Q") && whereIsVowel(kostr.toString())==2) {
							enlast = "qq";
							cri = 1;
						}
						else if(enlast.equals("T") && whereIsVowel(kostr.toString())==2) {
							enlast = "tt";
							cri = 1;
						}
						else if(enlast.equals("W") && whereIsVowel(kostr.toString())==2) {
							enlast = "ww";	
							cri = 1;
						}
				
						if(enlast.length()==2){
							b_1 = ""+enlast.charAt(1);
							b_2 = ""+enlast.charAt(0);
							
							String kotype;
							if(isType(kolast, "TAIL"))
								kotype = "TAIL";
							else 
								kotype = "COMP";
							
							kotmp = convert(b_2, kotype);
							kostr.replace(kostr.length()-1, kostr.length(), kotmp);
							kotmp = convert(b_1, "LEAD");
							kostr.append(kotmp);
							
							if(cri==1){
								enstr.replace(enstr.length()-1, enstr.length(), enlast);
							}

						}
						kotmp = convert(b_1, "LEAD");
						kostr.replace(kostr.length()-1, kostr.length(), kotmp);
						kotmp = convert(entmp, "VOWEL");
						kostr.append(kotmp);
						enstr.append(entmp);
//						System.out.println("4-1. kostr = "+getUnicode(kostr));
//						System.out.println("4-1. enstr = "+enstr);
	
					}else if(isType(b_1, "VOWEL")){
						if(enlen>=2){
							b_2 = ""+enstr.charAt(enlen-2);
							if(isType(b_2, "VOWEL")){
								entmp = merge(""+b_2+b_1+en);
								if(entmp.length()<3){
									kotmp = convert(entmp, "VOWEL");
									kostr.replace(kostr.length() - 1, kostr.length(), kotmp);
									enstr.replace(enstr.length() - 2, enstr.length(), entmp);
								}
							}else{
								entmp = ""+b_1+en;
								if(!en.equals(entmp)){
									if(isType(entmp, "VOWEL")){
										en = entmp;
										kotmp = convert(en, "VOWEL");
										kostr.replace(kostr.length()-1, kostr.length(), kotmp);
										enstr.append(en);
									}else{
										kotmp = convert(en, "COMP");
										kostr.append(kotmp);
										enstr.append(en);
									}
								}
								
							}
						}else{
							entmp = ""+b_1+en;
							if(!en.equals(entmp)){
								if(isType(entmp, "VOWEL")){
									en = entmp;
									kotmp = convert(en, "VOWEL");
									kostr.replace(kostr.length()-1, kostr.length(), kotmp);
									enstr.append(en);
								}else{
									kotmp = convert(en, "COMP");
									kostr.append(kotmp);
									enstr.append(en);
								}
							}
						}
//						System.out.println("4. kostr = "+getUnicode(kostr));
//						System.out.println("4. enstr = "+enstr);
						
					}else{
						kotmp = convert(en, "COMP");
						kostr.append(kotmp);
						enstr.append(en);
					}
					
				//2. en is consonant
				}else if(isType(en, "CONS")){
					if(isType(b_1, "VOWEL")){
						if(isType(en, "TAIL")){
							kotmp = convert(en, "TAIL");
						}else{
							kotmp = convert(en, "COMP");
						}
						
						kostr.append(kotmp);
						enstr.append(en);
//						System.out.println("5-1. kostr = "+getUnicode(kostr));
//						System.out.println("5-1. enstr = "+enstr);

					}else if(isType(b_1, "CONS")){
						String kob_1 = ""+kostr.charAt(kostr.length()-1);
						String typeb_1;
						if(isType(kob_1, "TAIL"))
							typeb_1 = "TAIL";
						else if(isType(kob_1, "LEAD"))
							typeb_1 = "LEAD";
						else 
							typeb_1 = "COMP";
						
						if(whereIsVowel(kostr.toString())==3){
							b_2 = ""+kostr.charAt(kostr.length()-2);
							if(b_1.equals(en)){
								entmp = merge(en+en);
								enstr.replace(enstr.length()-1, enstr.length(), entmp);
								kotmp = convert(b_2, "TAIL")+convert(entmp, "LEAD");
								int minus = isType(kostr.charAt(kostr.length()-1), "COMP") ? 2:1;
								kostr.replace(kostr.length()-minus, kostr.length(), kotmp);
							}else{
								kotmp = convert(en, "COMP");
								enstr.append(en);
								kostr.append(kotmp);
							}
//							System.out.println("5-3. kostr = "+getUnicode(kostr));
//							System.out.println("5-3. enstr = "+enstr);
							
						}else {
							if(b_1.equals(en)){
								if(isType(merge(en+en), typeb_1)){
									entmp = merge(en+en);
									kotmp = convert(entmp, typeb_1);
									kostr.replace(kostr.length()-1, kostr.length(), kotmp);
									enstr.replace(enstr.length()-1, enstr.length(), entmp);
								}else{
									kostr.append(convert(en, "COMP"));
									enstr.append(convert(en, "COMP"));
								}
								
							}else if(isType(b_1+en, typeb_1)){
								entmp = b_1 + en;
								kotmp = convert(entmp, typeb_1);
								kostr.replace(kostr.length()-1, kostr.length(), kotmp);
								enstr.replace(enstr.length()-1, enstr.length(), entmp);
							}else{
								kostr.append(convert(en, "COMP"));
								enstr.append(en);
							}
								
//							System.out.println("5-4. kostr = "+getUnicode(kostr));
//							System.out.println("5-4. enstr = "+enstr);
						}
//						System.out.println("5-5. kostr = "+getUnicode(kostr));
//						System.out.println("5-5. enstr = "+enstr);

					//3. it is not korean -> just append
					}else{
						kostr.append(en);
						enstr.append(en);
					}
				}

			}
			
		}
		


		 korean = unflattenKorean(kostr.toString(), inputEn.toString());
		 return korean;

	}
	
	public static String koreanBuild(String korean, String s){
		int len = s.length();
		String res = korean;
		if(len==0)
			return korean;
		
		for(int i = 0; i<len; i++){
			res = koreanBuild(res, s.charAt(i));
		}
		
		return res;
	}
	
	public static String koreanBuild(String s){
		int len = s.length();
		String res = "";
		if(len==0)
			return "";
		
		for(int i = 0; i<len; i++){
			res = koreanBuild(res, s.charAt(i));
		}
		
		return res;
	}

	public static String koreanBuild(char c){
		return koreanBuild(""+c);
	}
	
	private static final int SBase = 0xAC00, LBase = 0x1100, VBase = 0x1161, TBase = 0x11A7,
    LCount = 19, VCount = 21, TCount = 28,
    NCount = VCount * TCount, 
    SCount = LCount * NCount; 
    

	private static String flattenKorean(String st) {
    	
    	StringBuilder result = new StringBuilder();
    	
    	if(st.length()==0)
    		return "";

    	for(int i=0; i<st.length(); i++){

    		char ch = st.charAt(i);
    		if(!isType(ch, "MULTI")){
    			result.append(ch);
    		}else{
            
		        int SIndex = ch - SBase;
		        if (SIndex < 0 || SIndex >= SCount) {
		            return String.valueOf(ch);
		        }
		        int L = LBase + SIndex / NCount;
		        int V = VBase + (SIndex % NCount) / TCount;
		        int T = TBase + SIndex % TCount;
		        result.append((char)L);
		        result.append((char)V);
		        if (T != TBase) result.append((char)T);
		    }
	    }
        return result.toString();
    }
    
    
	private static String unflattenKorean(String st, String enst) {
        int len = st.length();
        if (len == 0) 
        	return "";
        StringBuilder result = new StringBuilder();
        char first =  st.charAt(0); ;
        result.append(first);
        int count = 0;

        for (int i = 1; i < len; ++i) {
            char ch = st.charAt(i);
            
            if(ch == replaceEn){
            	result.append(enst.charAt(count));
            	count++;
            	continue;
            }else if(isType(ch, "LEAD")){
            	first = st.charAt(i);
            	result.append(first);
            }
            
            if(( isType(ch, "CONS") ||isType(ch, "VOWEL")) && !isType(ch, "COMP")) {
	            // 1. check   L and V
	            int LIndex = first - LBase;
	            if (0 <= LIndex && LIndex < LCount) {
	                int VIndex = ch - VBase;
	                if (0 <= VIndex && VIndex < VCount) {
	                	first = (char)(SBase + (LIndex * VCount + VIndex) * TCount);
	                	result.setCharAt(result.length()-1, first);
	                    continue; 
	                }
	            }

	            // 2. check LV and T
	            int SIndex = first - SBase;
	            if (0 <= SIndex && SIndex < SCount && (SIndex % TCount) == 0) {
	                int TIndex = ch - TBase;
	                if (0 <= TIndex && TIndex <= TCount) {
	                	first += TIndex;
				        result.setCharAt(result.length()-1, first);
	                    continue; 
	                }
	            }
	        }else{

	            // if neither case, just add.
	            result.append(ch);
	        }
	    }

        return result.toString();
    }

	private static int whereIsVowel(String ko){
 
    	int ret = 0;
    	int len = ko.length();

    	for(int i=1; i<=len; i++){
    		String tmp = ""+ko.charAt(len-i);
    		if((tmp!=matching(tmp, VJ)) ||(tmp!=matching(tmp, VC))){
    			ret = i;
    		}
    	}
    	return ret;
    }


	//LEAD, VOWEL, TAIL, COMP, MULTI, KOR, ENG, NOTKOR, NOTHING
	//VJ, VJ, TJ, CC, VC // DC // DS, TS
	//to convert Korean to Englsh or English to Korean. Type is What you want.
	public static String convert(String s, String type){

		if(type.equals("NOTHING"))
			return s;
		
		String ret = s;

		if(isType(s.charAt(0), "ENG")){
			if(type.equals("COMP")){
				String tmp = matching(s, CC);
				if(tmp.equals(s)){
					ret = matching(s, VC);
				}else{
					ret = tmp;
				}
			}else if(type.equals("LEAD")){
				ret = matching(s, LJ);
			}else if(type.equals("VOWEL")){
				ret = matching(s, VJ);
			}else if(type.equals("TAIL")){
				ret = matching(s, TJ);
			}

		}else if(isType(s.charAt(0), "KOR") && type.equals("ENG")){
			if(isType(s, "VOWEL")){
				if(isType(s, "COMP")){
					ret = matching(s, VC);
				}else{
					ret = matching(s, VJ);
				}
			}else if(isType(s, "CONS")){
				if(isType(s, "COMP")){
					ret = matching(s, CC);
				}else{
					ret = matching(s, LJ);
					if(s.equals(ret)){
						ret = matching(s, TJ);
					}
				}
			}

		}

		return ret;

	}

	public static String convert(char c, String type){
			return convert(""+c, type);
	}



	//matching String(char) and find where it is (String s is object to matched,
	// String[][] array is VJ, CC, etc, int wh is where to find. ex) ENG is 1, KOR is 0.)
	// if array is DS, TS, wh = 0
	private static String matching(String s, String[][] array){
		String ret = s;
		char c = s.charAt(0);
		int wh = ((c>='A'&&c<='Z')||(c>='a'&&c<='z')) ? 1:0;
		if((array == DS)||(array==TS)){
			wh = 0;
		}

		for(int i = 0; i<array.length; i++){
			if(s.equals(array[i][wh])){
				ret = array[i][(wh+1)%2];
				break;
			}
		}

		return ret;
	}

	private static String matching(char c, String[][] array){
		return matching(""+c, array);
	}

	
	private static boolean isType(char c, String type){
    	return isType(""+c, type);
    }
    
	private static boolean isType(String s, String type){

		char c = s.charAt(0);
		boolean ret = false;

		if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){//input is english
			if(type.equals("COMP")){
				if(!s.equals(matching(s, CC)) || !s.equals(matching(s, VC)))
					ret = true;
			}else if(type.equals("LEAD")){
				if(!s.equals(matching(s, LJ)))
					ret = true;
			}else if(type.equals("VOWEL")){
				if(!s.equals(matching(s, VJ)) || !s.equals(matching(s, VC)))
					ret = true;
			}else if(type.equals("TAIL")){
				if(!s.equals(matching(s, TJ)))
					ret = true;
			}else if(type.equals("CONS")){
				if(!s.equals(matching(s, CC))||!s.equals(matching(s, LJ))||!s.equals(matching(s, TJ)))
					ret = true;
			}else if(type.equals("ENG")){
				ret = true;
			}else{
				ret = false;
			}

		}else{ //input is korean
			
			if(type.equals("MULTI") &&(c>= 0xac00 && c<=0xd7af))
				ret = true;
			else if(type.equals("LEAD") &&(c >= 0x1100 && c <= 0x1112))
				ret = true;
			else if(type.equals("TAIL") &&(c >= 0x11a8 && c <= 0x11c2))
				ret =  true;
			else if(type.equals("CONS") && ((c >= 0x1100 && c <= 0x1112)||
					(c >= 0x11a8 && c <= 0x11c2)||(c>=0x3131 && c<=0x314e)))
				ret =  true;
			else if(type.equals("VOWEL") && ((c >= 0x1161 && c <= 0x1175) || 
					(c>=0x314f && c<= 0x318d)))
				ret =  true;
			else if(type.equals("COMP") && (c>= 0x3131 && c<=0x318f))
				ret =  true;
			else if(type.equals("KOR") && ((c>= 0x3131 && c<=0x318f)||
					(c>= 0xac00 && c<=0xd7af)||(c >= 0x1100 && c <= 0x1112)||
					(c >= 0x11a8 && c <= 0x11c2)||(c >= 0x1161 && c <= 0x1175)))
				ret =  true;
			else 
				ret =  false;
		}
		return ret;


	}

	private static String merge(String st){
		int stlen = st.length();
		String ret = st;

		if(stlen==2){
			ret = matching(st, DS);
		}else if(stlen==3){
			ret = matching(st, TS);
		}
		
		return ret;
	}

    public static String merge(char ch){
		return merge(""+ch);
	}
    
    

    public static String getUnicode(String s){
    	StringBuilder uni = new StringBuilder();
    	String tmp;
    	
    	for(int i = 0; i<s.length(); i++){
    		tmp = Integer.toHexString(s.charAt(i));
    		if(tmp.length()==4){
    			uni.append("\\u"+tmp);
    		}
    	}
    	return uni.toString();
    	
    }
    
    public static String getUnicode(char c){
    	return getUnicode(""+c);
    }
    public static String getUnicode(StringBuilder sb){
    	return getUnicode(sb.toString());
    }
    

}

