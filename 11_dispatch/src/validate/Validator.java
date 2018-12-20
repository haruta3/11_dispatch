package validate;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class Validator {

    private StringBuffer errors;

    public Validator() {
        errors = new StringBuffer();
    }

    /**
     * �K�{�`�F�b�N
     */
    public boolean requireCheck(String param, String message) {
        boolean result = true;

        if(param == null || param.length() ==0) {
            result = false;
            errors.append("��" + message + "�͕K�{���͂ł��B<br>");
        }
        return result;
    }
    
    
    public boolean minlengthCheck(String param, String message) {
        boolean result = true;

        if(param.length() > 10) {
            result = false;
            errors.append("��" + message + "��10�����ȓ��ł��B<br>");
        }
        return result;
    }
    

    public boolean integerCheck(String val,String message) {
    	   
        try{
        	Integer.parseInt(val);
        	return  true;
        }catch(NumberFormatException nfex) {
        	 errors.append("��" + message +"�͐��l���͂ł��B<br>");
        	return false;  
        }
    }
    
    public boolean minusCheck(String val,String message) {
        try{
        	int a = Integer.parseInt(val);
    
        	if(a >= 0) {
        	return  true;
        	}
        	else{
        		errors.append("��"+ message +"��0�ȏ�ł��B<br>");
        		return false;
        	}
        }catch(NumberFormatException nfex) {
        	return false;  
        }
    }
    
    public boolean genreCheck(String[] genre,String message) {
    	boolean result = true;
    	
       	if(genre == null || genre.length== 0) {
            result = false;
            errors.append("��"+message+"��I�����Ă��������B<br>");
        }

    	else if(genre.length > 3) {
    		result =false;
    		errors.append("��"+message+"�̑I���͎O�܂łł��B<br>");
    	}
    	 return result;
 
    }
    
    
    public String getMessage() {
    	return errors.toString();
    }
}