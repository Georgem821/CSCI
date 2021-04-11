
public class RemoveValue {
	
	    static int[] remove(int v, int[] in){
	        int i, count = 0;
	        for(i = 0;i<in.length;i++){
	            if(in[i] == v){
	                count++;
	            }
	        }
	        int out[] = new int[in.length-count];
	        int k = 0;
	        for(i = 0;i<in.length;i++){
	            if(in[i]!=v){
	                out[k++] = in[i];
	            }
	        }
	        return out;
	    }

	    public static void main(String args[]){
	        int in[] = {0, 1, 3, 2, 3, 0, 3, 1};
	        int v = 3;
	        int out[] = remove(v,in);
	        System.out.println("Array ofter remove all "+v +": ");
	        for(int i = 0;i<out.length;i++){
	            System.out.println(out[i]);
	        }
	    }
	}


