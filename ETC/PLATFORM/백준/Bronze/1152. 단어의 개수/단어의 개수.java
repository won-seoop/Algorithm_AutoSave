import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().trim();
        
        if(line.isEmpty()){
        System.out.print(0);
            
        }
        else{
             String[] sep_line = line.split("\\s+");
        System.out.print(sep_line.length);
        }
       
        
    }
}