class DoubleCheckedLocking {
  public static void main(String[] args) {
    while(true){
      Singleton instance = Singleton.getInstance();
    }
  }
}

