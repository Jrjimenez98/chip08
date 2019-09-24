package chip8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class App {

    public static short pc =512;

    public String getGreeting() {
        return "Hello world.";
    }

    public static void loadFile(byte[] ans) throws FileNotFoundException, IOException {
            
        
        Disassembler pmlp = new Disassembler();
        String salida = "";

        for(int i = 0; i < ans.length; i = i + 2, pc = (short) (pc + 2)){

            var hexVal = (ans[i] >>> 4) & 0x0F;

            switch(hexVal){
                
                case (byte)0x01:
                    salida = salida + String.format("%04X: ", pc) + pmlp.jp(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x02:
                    salida = salida + String.format("%04X: ", pc) + pmlp.call(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x03:
                    salida = salida + String.format("%04X: ", pc) + pmlp.sebx(ans[i], ans[i+1]) + "\n";

                break;

                case (byte)0x04:
                    salida = salida + String.format("%04X: ", pc) + pmlp.snebx(ans[i], ans[i+1]) + "\n";

                break;

                case (byte)0x05:
                    salida = salida + String.format("%04X: ", pc) + pmlp.seX_Y(ans[i], ans[i+1]) + "\n"; 
                break;

                case (byte)0x06:
                    salida = salida + String.format("%04X: ", pc) + pmlp.ldbx(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x07:
                    salida = salida + String.format("%04X: ", pc) + pmlp.bxadd(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x08:
                            var hexVal_2 = ans[i+1] & 0x0F;

                            switch(hexVal_2){

                                case (byte)0x00:
                                salida = salida + String.format("%04X: ", pc) + pmlp.ldX_Y(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x01:
                                salida = salida + String.format("%04X: ", pc) + pmlp.or(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x02:
                                salida = salida + String.format("%04X: ", pc) + pmlp.and(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x03:
                                salida = salida + String.format("%04X: ", pc) + pmlp.or_x(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x04:
                                salida = salida + String.format("%04X: ", pc) + pmlp.xyadd(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x05:
                                salida = salida + String.format("%04X: ", pc) + pmlp.xysub(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x06:
                                salida = salida + String.format("%04X: ", pc) + pmlp.srl(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x07:
                                salida = salida + String.format("%04X: ", pc) + pmlp.zob(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x0E:
                                salida = salida + String.format("%04X: ", pc) + pmlp.dfl(ans[i], ans[i+1]) + "\n";
                                break;
                            }
                            break;
                case (byte)0x09:
                salida = salida + String.format("%04X: ", pc) + pmlp.xysne(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x0A:
                salida = salida + String.format("%04X: ", pc) + pmlp.idl(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x0B:
                salida = salida + String.format("%04X: ", pc) + pmlp.a_jp(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x0C:
                salida = salida + String.format("%04X: ", pc) + pmlp.rd(ans[i], ans[i+1]) + "\n"; 
                break;

                case (byte)0x0D:
                salida = salida + String.format("%04X: ", pc) + pmlp.dra(ans[i], ans[i+1]) + "\n";
                break;

                case (byte)0x0E:
                            var hexVal_3 = ans[i+1] & 0x0F;

                            switch(hexVal_3){

                                case (byte)0x0E:
                                salida = salida + String.format("%04X: ", pc) + pmlp.sp(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x01:
                                salida = salida + String.format("%04X: ", pc) + pmlp.snp(ans[i], ans[i+1]) + "\n"; 
                                break;

                            }
                    break;

                case (byte)0x0F:
                            var hexVal_4 = ans[i+1];

                            switch(hexVal_4){

                                case (byte)0x07:
                                salida = salida + String.format("%04X: ", pc) + pmlp.xd_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x0A:
                                salida = salida + String.format("%04X: ", pc) + pmlp.xk_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x15:
                                salida = salida + String.format("%04X: ", pc) + pmlp.dt_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x18:
                                salida = salida + String.format("%04X: ", pc) + pmlp.tx_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x1E:
                                salida = salida + String.format("%04X: ", pc) + pmlp.ixadd(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x29:
                                salida = salida + String.format("%04X: ", pc) + pmlp.fx_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x33:
                                salida = salida + String.format("%04X: ", pc) + pmlp.bx_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x55:
                                salida = salida + String.format("%04X: ", pc) + pmlp.ixi_ld(ans[i], ans[i+1]) + "\n";
                                break;

                                case (byte)0x65:
                                salida = salida + String.format("%04X: ", pc) + pmlp.xix_ld(ans[i], ans[i+1]) + "\n";
                                break;

                            }
                    break;


            }
        }
    
        System.out.println(salida);

        }
    public static void main(String[] args){
        try{
            byte[] content = Files.readAllBytes(Paths.get("/ufo.rom"));
            loadFile(content);
        
        }catch (Exception e){
            System.out.println("error");
            e.printStackTrace();
        }
    }   

}
