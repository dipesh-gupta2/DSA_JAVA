public class Performance {
    public static void main(String[] args) {
        StringBuilder builder =new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)(97+i);
            builder.append(ch);
            System.out.println((builder));
        }
        builder.insert(12,"Afss");
        System.out.println(builder);
    }

}
