
public class Message_Encoder {
	 public abstract String encode(String plainText);
	}

	public interface MessageDecoder {
	   
	    public abstract String decode(String cipherText);

	}

	public class SubstitutionCipher implements MessageEncoder, MessageDecoder {
	   
	
	    private int shiftBy;   
	   
	  
	    public SubstitutionCipher (int shiftBy){
	        this.shiftBy = shiftBy;
	    }
	   
	   
	    private char shift(char ch, int shiftValue){
	        char shiftedChar = ch;       
	        
	        if(ch >= 'a' && ch <= 'z')
	            shiftedChar = (char) ( 'a' + ( ch - 'a' + shiftValue ) %26 );
	       
	        else if(ch >= 'A' && ch <= 'Z')
	            shiftedChar = (char) ( 'A' + ( ch - 'A' + shiftValue ) %26 );
	        return shiftedChar;
	    }
	   
	    
	    public String encode(String plainText){
	        String encodedMsg = "";
	        for( int i = 0; i < plainText.length(); i++){
	            char ch = plainText.charAt(i);
	            encodedMsg += shift(ch, shiftBy);
	        }
	        return encodedMsg;
	    }
	    
	    public String decode(String cipherText){
	        String decodedMsg = "";
	        for( int i = 0; i < cipherText.length(); i++){
	            char ch = cipherText.charAt(i);
	            decodedMsg += shift(ch, -shiftBy);
	        }
	        return decodedMsg;
	    }
	} 

	public class Message_Encoder implements MessageEncoder, MessageDecoder {
	   
	    
	    private int n;
	   
	   
	    public ShuffleCipher (int n){
	        this.n = n;
	    }
	   
	    
	    private String shuffle(String text){
	       
	        int mid;
	        if (text.length() % 2 == 0)
	            mid = text.length()/2;
	        else
	            mid = (text.length()+1)/2;
	        
	        String first = text.substring(0, mid);
	        
	        String second = text.substring(mid);
	       
	        String shuffled = "";
	        
	        for(int i=0, j=0 ;i < first.length(); i++, j++)
	        {
	            shuffled += first.charAt(i);
	            if(j < second.length())
	                shuffled += second.charAt(i);           
	        }
	       
	        return shuffled;
	    }
	   
	    
	    private String reShuffle(String text){
	        String first ="", second="";
	        
	        for(int i=0;i<text.length();i++)
	        {
	            if(i%2==0)
	                first += text.charAt(i);
	            else
	                second += text.charAt(i);               
	        }   
	       
	        return first+second;
	    }
	   
	    
	    public String encode(String plainText){
	        String encodedMsg = plainText;
	        for(int i=0;i<n;i++)
	            encodedMsg = shuffle(encodedMsg);
	        return encodedMsg;
	    }
	    
	    public String decode(String cipherText){
	        String decodedMsg = cipherText;
	        for(int i=0;i<n;i++)
	            decodedMsg = reShuffle(decodedMsg);
	        return decodedMsg;
	    }
	}

	public class CipherDriver {
	    
	    public static void main(String[] args) {
	        int choise, choise2;
	        
	        java.util.Scanner input = new java.util.Scanner(System.in);

	        while (true) {

	            System.out.println("\n\n1.To Encode A Message");
	            System.out.println("2.To Decode A Message");
	            System.out.println("3.Exit");

	            do {
	                System.out.print("Enter your choise: ");
	                choise = input.nextInt();
	                input.nextLine();

	                if (choise == 3)
	                    System.exit(0);

	            } while (choise > 3 || choise < 1);

	            System.out.println("\n\n1.Substitution Cipher");
	            System.out.println("2.Shuffle Cipher");
	            System.out.println("3.Exit");

	            do {
	                System.out.print("Enter your choise: ");
	                choise2 = input.nextInt();
	                input.nextLine();

	                if (choise2 == 3)
	                    System.exit(0);

	            } while (choise2 > 3 || choise2 < 1);

	            String text;
	            int n;
	           
	            
	            switch (choise) {

	            case 1: 

	                System.out.print("Enter text to be encode: ");
	                text = input.nextLine();
	                String encodedMsg = "";

	                switch (choise2);  
	                    System.out.print("Enter shift value: ");
	                    n = input.nextInt();
	                    input.nextLine();
	                    SubstitutionCipher sub = new SubstitutionCipher(n);
	                    encodedMsg = sub.encode(text);
	                    System.out.println("Encode Message: " + encodedMsg);
	                    break;
	                case 2:
	                    System.out.print("Enter number of shuffles: ");
	                    n = input.nextInt();
	                    input.nextLine();
	                    ShuffleCipher shu = new ShuffleCipher(n);
	                    encodedMsg = shu.encode(text);
	                    System.out.println("Encode Message: " + encodedMsg);
	                    break;
	                }
	                break;
	            
	                System.out.print("Enter text to be decode: ");
	                text = input.nextLine();
	                String decodedMsg = "";

	                switch (choise2) {
	                case 1: 
	                    System.out.print("Enter shift value: ");
	                    n = input.nextInt();
	                    input.nextLine();
	                    SubstitutionCipher sub = new SubstitutionCipher(n);
	                    decodedMsg = sub.decode(text);
	                    System.out.println("Decoded Message: " + decodedMsg);
	                    break;
	                case 2: 
	                    System.out.print("Enter number of shuffles: ");
	                    n = input.nextInt();
	                    input.nextLine();
	                    ShuffleCipher shu = new ShuffleCipher(n);
	                    decodedMsg = shu.decode(text);
	                    System.out.println("Encode Message: " + decodedMsg);
	                    break;
	                } 
	                break;
	            } 
	       
	    }
	} 
