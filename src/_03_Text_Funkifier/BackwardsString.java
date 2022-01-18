package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	 
        StringBuilder builder = new StringBuilder();
 
        // append a string into StringBuilder input1
        builder.append(unfunkifiedText);
 
        // reverse StringBuilder input1
        builder.reverse();
        String text = builder.toString();
;
        return text;

    }
}
