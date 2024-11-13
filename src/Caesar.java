public class Caesar {

    private String Kt;
    private int S;
    private String Gt;

    public Caesar(){}


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

        public void getKt(String pWert) {

        }

        public String getKt() {
            return (String) Kt;
        }

        public void getS(int pWert) {

        }
        public String getGt() {
            return (String) Gt;
        }

        public void setKt(String zeichenkette) {
        }

        public void setS(int schluessel) {
        }



}




    }

