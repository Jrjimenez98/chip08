package chip8;

public class Disassembler {
    
    public String addr(byte msb, byte lsb) {
        return String.format("%02X%02X: ", msb, lsb);
    }

    public String cls() {
        return "CLS";
    }

    public String ret(){
        return "RET";
    }

    public String sys(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("SYS %02X%02X", x, lsb);
    }

    public String jp(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("JP %02X%02X", x, lsb);
    }

    public String call(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("CALL %04X", x, lsb);
    }

    public String sebx(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("SE V%1X, %02X", x, lsb);
    }

    public String dra(byte msb, byte lsb) {
        var n = lsb & 0x0F;
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("DRA V%1X, V%1X, %1X", x, y, n);
    }

    public String snebx(byte msb, byte lsb) {
        var x = msb & 0x0F;
        return String.format("SNE V%1X, %02X", x, lsb);
    }

    public String seX_Y(byte msb, byte lsb) {
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SE V%1X, V%1X", x, y);
    }

    public String ldbx(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, %02X", x, lsb);
    }

    public String bxadd(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD V%1X, %02X", x, lsb);
    }

    public String ldX_Y(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("LD V%1X, V%1X", x, y);
    }

    public String or(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("OR V%1X, V%1X", x, y);
    }

    public String and(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("AND V%1X, V%1X", x, y);
    }

    public String or_x(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("XOR V%1X, V%1X", x, y);
    }

    public String xyadd(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("ADD V%1X, V%1X", x, y);
    }

    public String xysub(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SUB V%1X, V%1X", x, y);
    }

    public String srl(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SRL V%1X, V%1X", x, y);
    }

    public String zob(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("ZOB V%1X, V%1X", x, y);
    }

    public String dfl(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("DFL V%1X, V%1X", x, y);
    }

    public String xysne(byte msb, byte lsb){
        var x = msb & 0x0F;
        var y = (lsb >>> 4) & 0x0F;
        return String.format("SNE V%1X, V%1X", x, y);
    }

    public String idl(byte msb, byte lsb){
        return String.format("LD I");
    }

    public String a_jp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("JP V0, %02X%02X", x, lsb);
    }

    public String rd(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("RD V%1X, %02X", x, lsb);
    }

    public String sp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SP V%1X", x);
    }

    public String snp(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("SNP V%1X", x);
    }

    public String xd_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, DT", x);
    }

    public String xk_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, K", x);
    }

    public String dt_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD DT, V%1X", x);
    }

    public String tx_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD ST, V%1X", x);
    }

    public String ixadd(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("ADD I, V%1X", x);
    }

    public String fx_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD F, V%1X", x);
    }

    public String bx_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD B, V%1X", x);
    }

    public String ixi_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD [I], V%1X", x);
    }

    public String xix_ld(byte msb, byte lsb){
        var x = msb & 0x0F;
        return String.format("LD V%1X, [I]", x);
    }
}