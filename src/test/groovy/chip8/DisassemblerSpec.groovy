package chip8

import spock.lang.Specification

class DisassemblerSpec extends Specification {

    def "Nueva pantalla"() {
        setup:
        def app = new Disassembler()

        when:
        def result = app.cls()

        then:
        result == "0000: CLS"
    }

    def "Return: codificado"() {
        setup:
        def app = new Disassembler()

        when:
        def result = app.ret()

        then:
        result == "0000: RET"
    }

   def "SYS: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sys((byte)0x3E, (byte)0x54)

        then:
        result == "0000: SYS 0E54"
    }

    def "JP: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.jp((byte)0x13, (byte)0x54)

        then:
        result == "0000: JP 0354"
    }

    def "CALL: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.call((byte)0x23, (byte)0x54)

        then:
        result == "0000: CALL 0354"
    }

    def "SE: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sebx((byte)0x3E, (byte)0x54)

        then:
        result == "0000: SE VE, 54"
    }

    def "DRA: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.dra((byte)0xDE, (byte)0x54)

        then:
        result == "0000: DRA VE, V5, 4"
    }

    def "SNE: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.snebx((byte)0x4E, (byte)0x54)

        then:
        result == "0000: SNE VE, 54"
    }
    
    def "SE: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.seX_Y((byte)0x5E, (byte)0x54)

        then:
        result == "0000: SE VE, V5"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ldbx((byte)0x6E, (byte)0x54)

        then:
        result == "0000: LD VE, 54"
    }

    def "ADD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.bxadd((byte)0x7E, (byte)0x54)

        then:
        result == "0000: ADD VE, 54"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ldX_Y((byte)0x8E, (byte)0x54)

        then:
        result == "0000: LDx_y VE, V5"
    }

    def "OR: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.or((byte)0x8E, (byte)0x54)

        then:
        result == "0000: OR VE, V5"
    }

    def "AND: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.and((byte)0x8E, (byte)0x54)

        then:
        result == "0000: AND VE, V5"
    }

    def "XOR: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.or_x((byte)0x8E, (byte)0x54)

        then:
        result == "0000: XOR VE, V5"
    }

    def "ADD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xyadd((byte)0x8E, (byte)0x54)

        then:
        result == "0000: ADD_2 VE, V5"
    }

    def "SUB: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xysub((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SUB VE, V5"
    }

    def "SRL: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.srl((byte)0x8E, (byte)0x54)

        then:
        result == "0000: SRL VE, V5"
    }

    def "ZOB: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.zob((byte)0x8E, (byte)0x54)

        then:
        result == "0000: ZOB VE, V5"
    }

    def "DFL: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.dfl((byte)0x8E, (byte)0x54)

        then:
        result == "0000: DFL VE, V5"
    }

    def "SNE: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xysne((byte)0x9E, (byte)0x54)

        then:
        result == "0000: SNE VE, V5"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.idl((byte)0xAE, (byte)0x54)

        then:
        result == "0000: LD I"
    }

    def "JP: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.a_jp((byte)0xBE, (byte)0x54)

        then:
        result == "0000: JP V0, 0E54"
    }

    def "RD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.rd((byte)0xCE, (byte)0x54)

        then:
        result == "0000: RD VE, 54"
    }

    def "SP: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.sp((byte)0xEE, (byte)0x54)

        then:
        result == "0000: SP VE"
    }

    def "SNP: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.snp((byte)0xEE, (byte)0x54)

        then:
        result == "0000: SNP VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xd_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, DT"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xk_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, K"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.dt_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD DT, VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.tx_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD ST, VE"
    }

    def "ADD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ixadd((byte)0xFE, (byte)0x54)

        then:
        result == "0000: ADD I, VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.fx_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD F, VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.bx_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD B, VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.ixi_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD [I], VE"
    }

    def "LD: codificado"(){
        setup:
        def app = new Disassembler()

        when:
        def result = app.xix_ld((byte)0xFE, (byte)0x54)

        then:
        result == "0000: LD VE, [I]"
    }

}