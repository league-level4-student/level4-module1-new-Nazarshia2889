package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		char[] unfunk = new char[unfunkifiedText.length()];
		boolean upper = false;
		
		
		for(int i = 0; i < unfunk.length; i++) {
			if(upper) {
				unfunk[i] = Character.toUpperCase(unfunkifiedText.charAt(i));
			}
			else { 
				unfunk[i] = Character.toLowerCase(unfunkifiedText.charAt(i));
			}
			upper = !upper;
		}
		
		StringBuilder sb = new StringBuilder();
		 
        for (int i = 0; i < unfunk.length; i++) {
            sb.append(unfunk[i]);
        }
		
		return sb.toString();
	}
    

}
