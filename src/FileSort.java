
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileSort {
    static final String Path = "datos.txt";
    public static int[] loadfile(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(Path));
            String line;
            while((line = br.readLine()) != null){
                list.add(Integer.parseInt(line));
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void PutRandomNumbers(int n){
        try{
            java.io.PrintWriter output = new java.io.PrintWriter(Path);
            for(int i = 0; i < n; i++){
                output.println((int)(Math.random() * 1000));
            }
            output.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
