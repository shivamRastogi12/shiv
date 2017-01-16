package basicjava;

public class reverseString {

	String biginput;
	
	public void input()
	{
		biginput = "Th!$ is @ very B!G S+ring";		
		System.out.println("Your Input string is : "+biginput);
		reverse();
		}
	
	
	public void reverse()
	{
		char currentChar = 'T';		
        String letters= "" ;
        String output = "";
		int currentAlphaindex = 0;
		int replacementCount = 0;
		int stringLength1 = biginput.length();
		char[] alpha = new char[stringLength1];
        int[] alphaIndex = new int[stringLength1];
		 char[] fullText = new char[stringLength1];
		//stringLength1 = biginput.length();
		 for (int count = 0; count < stringLength1; count++)
		 {
	           currentChar = biginput.charAt(count);
	            fullText[count] = currentChar;
	            alphaIndex[count] = -1;
	            if(Character.isLetter(currentChar))
	            {
	                alpha[currentAlphaindex] = currentChar;
	                alphaIndex[currentAlphaindex] = count;
	                currentAlphaindex++;
	            }
		 }
		for (int i = (stringLength1 - 1); i >= 0; i--){
            letters = letters + alpha[i];
            letters = letters.trim();
        }
        for(int i = 0; i < stringLength1; i++){
            if((alphaIndex[i] >= 0)){
                fullText[alphaIndex[i]] = letters.charAt(replacementCount);
                replacementCount++;
            }
            output = output + fullText[i];
        }
        System.out.println("input: " + biginput + "\noutput: " + output);
    
	}
	
	public static void main(String[] args) {
		reverseString obj = new reverseString();
		obj.input();

	}

}
