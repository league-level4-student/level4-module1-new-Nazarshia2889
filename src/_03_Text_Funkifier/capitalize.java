package _03_Text_Funkifier;

public class capitalize implements TextFunkifier{
	private String unfunkifiedText;

    public capitalize(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    
	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		char[] unfunk = unfunkifiedText.toCharArray();
		for(int i = 0; i < unfunk.length; i++) {
			unfunk[i] = Character.toUpperCase(unfunk[i]);
		}
		StringBuilder sb = new StringBuilder();
		 
        for (int i = 0; i < unfunk.length; i++) {
            sb.append(unfunk[i]);
        }
		
		return sb.toString();
	}

}
