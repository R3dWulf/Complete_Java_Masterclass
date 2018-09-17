
public class KiloBytesAndMegaBytes {
        public static void main(String[] args) {
                printMegaBytesAndKiloBytes(0);
                printMegaBytesAndKiloBytes(48210);
                printMegaBytesAndKiloBytes(-1);
                printMegaBytesAndKiloBytes(2050);
        }
        
        public static void printMegaBytesAndKiloBytes( int kiloBytes )
        {
                if ( kiloBytes < 0 )
                {
                        System.out.println("Invalid Value");
                }
                else
                {
                        int KB = kiloBytes;
                        int MB = kiloBytes / 1024;    
                        int ZZ = kiloBytes % 1024;
                        System.out.println(KB + " KB =  " + MB + " MB and " + ZZ + " KB");
                }              

        }
}
