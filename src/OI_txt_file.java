import java.io.*;

public class OI_txt_file {

    public static void main(String[] args) {

                // Program info

        System.out.println("Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.");

                // Data processing

        String str_out;
        int counter_i, counter_j;
        counter_i = counter_j = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("file_18.txt"))) {

            while((str_out = br.readLine()) != null) {

                System.out.print(str_out + "\n");
                counter_i += 1;

            }

            System.out.println("Кол-во строк: " + counter_i);

            String str_in;

            BufferedReader brd = new BufferedReader (new InputStreamReader(System.in));

            try(FileWriter fw = new FileWriter("file_18.txt", false)) {

                for (counter_j = 0; counter_j < counter_i; counter_j++) {

                    System.out.print("Введите текст: ");
                    str_in = brd.readLine();
                    str_in += "\r\n";
                    fw.write(str_in);
                }
            }

            catch(IOException ex){

                System.out.println(ex.getMessage());

            }

        }

        catch(IOException ex){

            System.out.println(ex.getMessage());

        }

    }

}
