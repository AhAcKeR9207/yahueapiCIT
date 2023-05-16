class Light {
   private String name;
   private boolean state; // true/false
   private HSB hsb; // hue in degrees * 255, percent sat * 255, percent bri * 255
   private int[] xy; // positon.  might be specific to the emulator
   private int ct; // unknown
   private String alert; //unkown
   private String effect; //unkown
   private String colormode; // Might be hsb/rgb?
   private boolean reachable; //unkown
   
   public Light (String name, boolean state, HSB hsb, int[] xy, int ct, String alert, String effect, String colormode, boolean reachable) {
      this.name = name;
      this.state = state;
      this.hsb = hsb;
      this.xy = xy;
      this.ct = ct;
      this.alert = alert;
      this.effect = effect;
      this.colormode = colormode;
      this.reachable = reachable;
   }
   
   public String getName() {
      return this.name;
   }
   
   public boolean getState() {
      return this.state;
   }
   
   public HSB getHSB() {
      return this.hsb;
   }
   
   public int[] getXY() {
      return this.xy;
   }
   
   public int[] getCT() {
      return this.ct;
   }
   
   public String getAlert() {
      return this.alert;
   }
   
   public String getEffect() {
      return this.effect;
   }
   
   public String getColormode() {
      return this.colormode;
   }
   
   public boolean getReachable() {
      return this.reachable;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setState(boolean state) {
      this.state = state;
   }
   
   public void setHSB(HSB hsb) {
      this.hsb = hsb;
   }
   
   public void setXY(int[] xy) {
      this.xy = xy;
   }
   
   public void setCT(int ct) {
      this.ct = ct;
   }
   
   public void setAlert(String alert) {
      this.alert = alert;
   }
   
   public void setEffect(String effect) {
      this.effect = effect;
   }
   
   public void setColormode(String colormode) {
      this.colormode = colormode;
   }
   
   public void setReachable(boolean reachable) {
      this.reachable = reachable;
   }
   
   public void updateJSON() {
   
   }
}