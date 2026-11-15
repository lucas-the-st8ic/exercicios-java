class Swapper{

    public Object[] arguments;

    public Swapper(Object[]args){
        arguments = args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[2];
        arguments[2] = temp;
    }
}
