import java.io.File;
import java.io.IOException;

public class DNAdbase {

    private static int hashSize;
    private static File command;
    private static String memory;
    private static DNAparser parse;

    /**
     * 
     * @param args is the input
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        if (args.length == 4) {
            command = new File(args[0]);
            hashSize = Integer.parseInt(args[2]);
            memory = args[3];
            parse = new DNAparser(command, memory, hashSize);
            parse.parse();
        }
        else {
            System.out.println("Please input a correctly formatted command");
        }
    }
    
    /**
     * 
     * @return the parser
     */
    public DNAparser getParser() {
        return parse;
    }
    
}
