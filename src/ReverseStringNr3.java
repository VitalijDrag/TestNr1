class ReverseString3 {
    public static void main(String[] args)
    {
        String input = "JavaIsFun";
        StringBuilder input1 = new StringBuilder();

        input1.append(input);
        input1.reverse();

        System.out.println(input1);
    }
}