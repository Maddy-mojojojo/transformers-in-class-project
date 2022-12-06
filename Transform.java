public interface Transform {
    
    public String forwardTransform(String input)
          throws TranformationException;

    public String reverseTransform(String input)
          throws TranformationException;
    
}