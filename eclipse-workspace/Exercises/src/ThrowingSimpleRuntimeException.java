public class ThrowingSimpleRuntimeException {

  public static void main (String args[])  {  // Can you remove "throws Exception"?

    throw new SimpleRuntimeException("Testing throwing RuntimeException");
  }

}