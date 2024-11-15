public class Caesar {

    private String Kt;
    private int S;
    private String Gt;

    public Caesar() {
        Kt = "";
        Gt = "";
    }
        public void verschluesseln(){
            for (int i = 0 ; i < Kt.length()  ; i++) {
                int h = this.getASCII(Kt.charAt(i));
                Gt  = Gt +  this.getChar(h + S);
            }
        }

        public void entschluesseln() {
            for (int i = 0; i < Gt.length() ; i++) {
                int h = this.getASCII(Gt.charAt(i));
                Kt = Kt + this.getChar(h - S);
            }
    }
        public int getASCII(char pWert) {
            return (int) pWert;
        }

        public char getChar(int pWert) {
            return (char) pWert;
        }


        public String getKt() {
            return Kt;
        }

        public int getS() {
             return S;
        }
        public String getGt() {
            return Gt;
        }

        public void setKt(String zeichenkette) {
            Kt = zeichenkette;

        }

        public void setS(int schluessel) {
            S = schluessel;
        }



}
