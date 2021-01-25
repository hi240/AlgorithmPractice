package codeSignal;

public class _10addBorder {
	String[] addBorder(String[] picture) {
	    int length=0;
	    String[] addBorder = new String[picture.length+2];
	    
	    for(int i=0;i<picture.length;i++){
	        if(picture[i].length()>length)length=picture[i].length();
	        picture[i]="*"+picture[i]+"*";
	        addBorder[i+1]=picture[i];
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for(int i=0;i<length+2;i++){
	        sb.append("*");
	    }
	    
	addBorder[0]=String.valueOf(sb);
	addBorder[picture.length+1]=String.valueOf(sb);

	return addBorder;
	}

}
