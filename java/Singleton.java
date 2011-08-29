class Singleton {
  private static Singleton instance;
  private boolean inUse;
  private int val;

  private Singleton()
  {
    inUse = true;
    val = 5;
  }

  public static Singleton getInstance()
  {
    if(instance == null)
      instance = new Singleton();
    return instance;
  }

}
