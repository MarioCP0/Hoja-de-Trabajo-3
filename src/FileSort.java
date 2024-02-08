
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class FileSort {
    static final String Path = "datos.txt";
    public static Integer[] loadfile(){
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
        Integer[] arr = new Integer[list.size()];
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

    public static Integer[] CreateRandomArray(int n){
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 10000000);
        }
        return arr;
    }

    public static void SaveTimeCSV(HashMap<String, HashMap<String, Integer[]>> TimesInMsPerComplexity){
        try{
            FileWriter csvWriter = new FileWriter("times.csv");
            csvWriter.append("Sort,Complexity,Time\n");
            for(String sort : TimesInMsPerComplexity.keySet()){
                for(String complexity : TimesInMsPerComplexity.get(sort).keySet()){
                    csvWriter.append(sort + "," + complexity + "," + TimesInMsPerComplexity.get(sort).get(complexity)[0] + "\n");
                }
            }
            csvWriter.flush();
            csvWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
